import java.text.DecimalFormat;
 
/** 
*
* Creates an abstract Student class that stores 
* the student data and provides methods to access the data. 
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public abstract class Student implements Comparable<Student> {

   protected String number;
   protected String name;
   protected int credits;
   protected int residency;
   
   /**
   * This represents the base tuition for students. 
   */

   public static final double BASE_TUITION = 100;


   private static int studentCount = 0; 
   
   
   /**
   * The constructor which establishes
   * parameters for the class.
   *
   *@param numberIn The student ID number.
   *@param nameIn The student's name.
   *@param creditsIn The number of credit hours the
   * student will be taking.
   *@param residencyIn The status of the student's 
   * residency via in-state, out-of-state, or international.
   *@throws NegativeValueException Throws exception when value is negative.
*
   */

   public Student(String numberIn, String nameIn, 
      int creditsIn, int residencyIn)
      throws NegativeValueException {
      
      if (creditsIn < 0 || residencyIn < 0) {
         throw new NegativeValueException();
      } 
      
   
      number = numberIn;
      name = nameIn;
      credits = creditsIn;
      residency = residencyIn;
   
      studentCount++;
   
   }
   
   /**
   * This method gets the student id number.
   *@return The student ID number.
   */
   public String getNumber() {
      return number;
   }

   /**
   * This method sets the student id number.
   * @param numberIn The studen id number.
   *
   */
   
   public void setNumber(String numberIn) {
      number = numberIn;
   }

   /**
   * This method gets the name of the student.
   *@return The name of the student.
   */
   public String getName() {
      return name;
   }

   /**
   * This method sets the name of the student.
   * @param nameIn The name of the student.
   */
   public void setName(String nameIn) {
      name = nameIn;
      
   }

   /**
   * This method gets the number of credits the student will be taking.
   *@return The number of credit the student will be taking.
   */
   public int getCredits() {
      return credits;
   }

   /**
   * This method sets the number of credits the student will be taking.
   * @param creditsIn The number of credits the student will be taking.
   */
   public void setCredits(int creditsIn) {
      credits = creditsIn;
      
   }

   /**
   * This method gets the residency status of the student.
   *@return The residency status of the student. 
   */
   public int getResidency() {
      return residency;
   }

   /**
   * This method sets the residency status of the student.
   * @param residencyIn The residency status of the student.
   */
   public void setResidency(int residencyIn) {
      residency = residencyIn;
      
   }

   /**
   * This method gets the number of students. 
   *@return The number of students.
   */
   public static int getStudentCount() {
      return studentCount;
   }
   
   /**
   * This method resets the student count to zero.
   * 
   */
   public static void resetStudentCount() {
      studentCount = 0;
   
   }
   
   /**
   * This method sets the abstract paramaters
   * for the calculateTuition method XXX. 
   * @return The student's tuition.
   */  
   public abstract double calculateTuition();
  
  /**
   * This method provides an abstract funtion for calculating 
   * the toal cost.
   *@return The student's total cost.
   */
   public abstract double calculateTotalCost();

   /**
   * This method prints the students information.
   *@return The string of the information provided regarding the student.
   */ 
   public  String toString() {
      DecimalFormat tuitionFmt = new DecimalFormat("#,##0.00");
      String output = "Student: " + number + " " + name 
         + " " + "(" + this.getClass().getName() + ")"
         + "\n" + "Total Cost: $" 
         + tuitionFmt.format(calculateTotalCost()) + " includes $"
         + tuitionFmt.format(calculateTuition()) 
         + " Tuition for " + credits + " Credits ";
      
      if (residency == 1) {
         output += "(In-State)";
      }
      else if (residency == 2) {
         output += "(Out-of-State)";
      
      }
      else {
         output += "(International)";
      }
    
   
      return output;
   }
   
   /**
   * This method compares one student to another
   * based on name.
   * @return The student's total cost.
   * @param student The student's name.
   */
   
   public int compareTo(Student student) {
   
      return this.getNumber().compareTo(student.getNumber());
   
   }

 
}


