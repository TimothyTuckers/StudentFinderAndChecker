import java.util.Scanner; 
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.text.NumberFormat;



/** 
*
* Creates an School class that provides methods 
* for reading in data and generating reports, 
* adding a student and sorting the students by number and name.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class School {

   private String name;
   
   private Student[] students;
      
   private String[] excludedRecords;
   
 /**
   * The constructor which establishes
   * parameters for the class.
   *
   */
   public School() {
   
      name = "not yet assigned";
      students = new Student[0];
      excludedRecords  = new String[0];
   
   }
   
   /**
   * This method reads the student file.
   *@param fileName The name of the file.
   *@throws IOException Defines the exception to be 
   * thrown.
   */
   public void readStudentFile(String fileName) throws IOException {
      
      Scanner scan = new Scanner(new File(fileName));
                  
      name = scan.nextLine().trim();
   
   
      while (scan.hasNext()) {
         String line = scan.nextLine();
         Scanner lineScan = new Scanner(line).useDelimiter(";");
         
         try {
         
         
         
            switch(lineScan.next().toUpperCase().trim().charAt(0)) {
               case 'U': 
                  String number = lineScan.next().trim();
                  String student = lineScan.next().trim();
                  int credit = Integer.parseInt(lineScan.next().trim());
                  int residency = Integer.parseInt(lineScan.next().trim());
               
                  addStudent(new Undergraduate(number, 
                     student, credit, residency));
                  break;
            
            
            
               case 'M': 
                  String numberM = lineScan.next().trim();
                  String studentM = lineScan.next().trim();
                  int creditM = Integer.parseInt(lineScan.next().trim());
                  int residencyM = 
                     Integer.parseInt(lineScan.next().trim());
                  double assistantshipRate = 
                     Double.parseDouble(lineScan.next().trim());
               
                  addStudent(new Masters(numberM, 
                     studentM, creditM, residencyM, assistantshipRate));
                  break;
               
               case 'P': 
                  String numberP = lineScan.next().trim();
                  String studentP = lineScan.next().trim();
                  int creditP = Integer.parseInt(lineScan.next().trim());
                  int residencyP = 
                     Integer.parseInt(lineScan.next().trim());
                  double assistantshipRateP = 
                     Double.parseDouble(lineScan.next().trim());
                  double researchFeeRateP = 
                     Double.parseDouble(lineScan.next().trim());
               
                  addStudent(new PhD(numberP, studentP, 
                     creditP, residencyP, 
                     assistantshipRateP, researchFeeRateP));
                  break;
               
               default: 
                  addExcludedRecord("Invalid Student Category in:\n" 
                     + line);
               
               
            }
         } 
         catch (NumberFormatException e) {
            addExcludedRecord(e + " occurred while processing:\n"
               + line);
         }
          
         catch (NoSuchElementException e) {
            addExcludedRecord(e + " occurred while processing:\n"
               + line);
         }
          
         catch (NegativeValueException e) {
            addExcludedRecord(e + " occurred while processing:\n"
               + line);
         }
         
          
      }
   
   
   
   }
   
   /**
   * This method gets the name of the school.
   *@return The name of the school.
   */
   public String getName() {
      return name;
   }

   /**
   * This method sets the name of the school.
   * @param nameIn The name of the school.
   */
   public void setName(String nameIn) {
      name = nameIn;
      
   }
   
   
   /**
   * This method gets the array containing students.
   *@return The array of students.
   */
   public Student[] getStudents() {
      return students;
   }

   /**
   * This method gets the array containing excludedRecords.
   *@return The array of excludedRecords.
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   * This method adds capacity to the students array.
   * @param studentIn The student.
   */
   public void addStudent(Student studentIn) {
      Student[] newStudent;
      newStudent = new Student[students.length + 1];
      for (int index = 0; index < students.length; index++) {
         newStudent[index] = students[index];
      }
     
      students = newStudent;
      students[students.length - 1] = studentIn;
          
   }
 
   
   
   /**
   * This method adds capacity to the ExcludedRecords array.
   * @param excludedRecordsIn The excluded records.
   * 
   */
   public void addExcludedRecord(String excludedRecordsIn) {
      String[] newExcludedRecords;
      newExcludedRecords = new String[excludedRecords.length + 1];
      for (int index = 0; index < excludedRecords.length; index++) {
         newExcludedRecords[index] = excludedRecords[index];
      }
      
      excludedRecords = newExcludedRecords;
      excludedRecords[excludedRecords.length - 1] = excludedRecordsIn;
   }
   
   /**
   * This method prints the student's information.
   *@return The student's information.
   */
   public String toString() {
      String output = "";
      for (int i = 0; i < students.length; i++) {
         output += students[i].toString() + "\n\n";
      
      }
      
      return output;
   }
   
   /**
   * This method calculates the tuition cost.
   *@return The tuition cost.
   */
   public double calculateTotalTuition() {
      double output = 0;
      for (int i = 0; i < students.length; i++) {
         output += students[i].calculateTuition();
      
      }
      
      return output;
   }
   
   /**
   * This method calculates the total cost.
   *@return The total cost.
   */
   public double calculateTotalCost() {
      double output = 0;
      for (int i = 0; i < students.length; i++) {
         output += students[i].calculateTotalCost();
      
      }
      
      return output;
   }
         
   /**
   * This method prints the string summary.
   *@return The summary of a school's information.
   */
   public String summary() {
      String output = "";
      output += "\n------------------------------\n" +  "Summary for " 
         + getName() + "\n------------------------------\n" 
         + "Number of Students: "
         + students.length
         + "\nTotal Tuition: " 
         + NumberFormat.getCurrencyInstance().format(
            calculateTotalTuition()) + "\nTotal Cost: "
         + NumberFormat.getCurrencyInstance().format(calculateTotalCost());
      
      return output;
   
   
   }
   
   /**
   * This method lists the student based on their student's id number.
   *@return The list of students.
   */
   public String listByNumber() {
      String output = "";
      output += "\n\n------------------------------\n" +  "Students by Number" 
         + "\n------------------------------\n\n";
      
      Arrays.sort(students);
      output += this.toString();
      
      return output;
   }
   
   /**
   * This method prints the student's based on their names.
   *@return The list of student's.
   */
   public String listByName() {
      String output = "";
      output += "\n------------------------------\n" +  "Students by Name" 
         + "\n------------------------------\n\n";
         
      Arrays.sort(students, new StudentNameComparator());
      output += this.toString();
      
      return output;
   }
   
   
   /**
   * This method prints the list of student records 
   * that were excluded from the original list due 
   * to typographical errors.
   *@return The list of excluded records.
   */
   public String excludedRecordsList() {
      String output = "";
      output += "\n------------------------------\n" +  "Excluded Records" 
         + "\n------------------------------\n\n";
      for (int i = 0; i < excludedRecords.length; i++) {
         output += excludedRecords[i] + "\n\n";
      
      }
      
      return output;
   }
   

   
   
}



