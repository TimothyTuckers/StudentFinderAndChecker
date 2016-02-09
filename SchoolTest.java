import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;



/** 
*
* Tests all the methods in the School class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/
public class SchoolTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *Test the "if statement" regarding NegativeValuesException.
   *
   */
   @Test public void ifStatementFail() {
      boolean exceptionThrown = false;
      try {
         Masters pupil = new Masters("1234567890", "Jones, Sam", -16, 1, 0.25);
      }
      catch (NegativeValueException e) {
         exceptionThrown = true;
      } 
   
      Assert.assertTrue(exceptionThrown);
   }
   

    /** Tests the readStudentFile method. 
    * @throws IOException Error reading file
       **/
   @Test public void readStudentFileTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
        
   
      Assert.assertEquals("readStudentFileFail", 
         school.getStudents().length, 6);
   }  
   
    /** Tests the getName method. 
    * @throws IOException Error reading file
       **/
   @Test public void getNameTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
        
   
      Assert.assertEquals("getNameTestFail",
          school.getName(), "Auburn University");
   }
   
    /** Tests the setName method. 
    * @throws IOException Error reading file
       **/
   @Test public void setNameTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      school.setName("the University of Alabama");
        
   
      Assert.assertEquals("setNameTestFail", 
         school.getName(), "the University of Alabama");
   }
   
    /** Tests the getStudents method. 
    * @throws IOException Error reading file
*@throws NegativeValueException Throws exception when value is negative.
       **/
   @Test public void getStudentsTest() 
      throws IOException, NegativeValueException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      Student[] student = new Student[6];
      student[0] = new Undergraduate("1234567890", "Jones, Sam", 16, 1);
      student[1] = new Masters("1234567888", "Andrews, Andy", 12, 1, 0.25);
      student[2] = new Masters("1234567891", "Smith, Pat", 12, 1, 0.25);
      student[3] = new PhD("1234567892", "Williams, Jo", 12, 1, 0.50, 0.10);
      student[4] = new Undergraduate("1234567889", "Jackson, Jackie", 16, 2);
   
      student[5] = new PhD("1234567887", "Cassidy, Cathy", 6, 2, 0.25, 0.10);
   
      Assert.assertEquals("getStudentsTestFail", 
         student[0].getNumber(),  school.getStudents()[0].getNumber());
      Assert.assertEquals("getStudentsTestFail", 
         student[1].getNumber(),  school.getStudents()[1].getNumber());
      Assert.assertEquals("getStudentsTestFail", 
         student[2].getNumber(),  school.getStudents()[2].getNumber());
      Assert.assertEquals("getStudentsTestFail", 
         student[3].getNumber(),  school.getStudents()[3].getNumber());
      Assert.assertEquals("getStudentsTestFail", 
         student[4].getNumber(),  school.getStudents()[4].getNumber());
      Assert.assertEquals("getStudentsTestFail", 
         student[5].getNumber(),  school.getStudents()[5].getNumber());
   
   }
   
     /** Tests the getExcludedRecords method. 
     * @throws IOException Error reading file
*@throws NegativeValueException Throws exception when value is negative.
       **/
   @Test public void 
   getExcludedRecordsTest() 
      throws IOException, NegativeValueException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      String[] student = new String[2];
      student[0] = "Invalid Student Category "
         + "in:\nhD;1234567893;Hanks, Thomas;12;3;0.50;0.10";
      student[1] = "Invalid Student Category "
         + "in:\nOgrad;1234567886;Tuttles, Terri;12;1;0.25";
    
   
      Assert.assertArrayEquals("getExcludedRecordsFail", 
         student,  school.getExcludedRecords());
   
   }
   
   
     /** Tests the addStudent method.
     *@throws IOException Error reading file
*@throws NegativeValueException Throws exception when value is negative.
       **/    
   @Test public void addStudentTest() 
      throws IOException, NegativeValueException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      Student s = new PhD("987654321", "Hendrix, Jimmy", 12, 1, 0.50, 0.10);
      school.addStudent(s);
       
        
   
      Assert.assertEquals("addStudentFail", 7,
          school.getStudents().length);
   }
   

       /** Tests the addExcludedRecords method. 
       * @throws IOException Error reading file
       **/
   @Test public void addExcludedRecordsTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      school.addExcludedRecord("987654321; HHendrix, Jimmy; 12, 0.50, 0.10");
       
        
   
      Assert.assertEquals("addExcludedRecordsFail", 
         school.getExcludedRecords().length, 3);
   }
          
          


     /** Tests the calculateTotalTuition method. 
     *@throws IOException Error reading file
     *@throws NegativeValueException Throws exception when value is negative.

     **/

   @Test public void calculateTuitionTest() 
      throws IOException, NegativeValueException {
      School school = new School();
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
       
      school.addStudent(pupil);
   
      Assert.assertEquals("calculateTuitionTestFail", 
         school.calculateTotalTuition(), 1600.00, .000001);
   }
   
 /** Tests the calculateTotalCost method.
 *@throws IOException Error reading file
   *@throws NegativeValueException Throws exception when value is negative.
  **/

   @Test public void calculateTotalCostTest() 
      throws IOException, NegativeValueException {
      School school = new School();
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
       
      school.addStudent(pupil);
   
      Assert.assertEquals("calculateTuitionTestFail", 
         school.calculateTotalCost(), 1840.00, .000001);
   }
   
         
    /** Tests the summary method.
    *@throws IOException Error reading file
    **/
   @Test public void summaryTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      String s = "\n------------------------------"
         + "\nSummary for Auburn University"
         + "\n------------------------------"
         + "\nNumber of Students: 6"
         + "\nTotal Tuition: $12,000.00"
         + "\nTotal Cost: $14,880.00";
        
   
      Assert.assertEquals("summaryFail", s, 
          school.summary());
   }
   
   
         
    /** Tests the listByNumber method. 
    *@throws IOException Error reading file
    **/
   @Test public void listByNumberTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      String s = "\nStudent: 1234567887 Cassidy, Cathy (PhD)"
         + "\nTotal Cost: $5,040.00 includes $3,600.00 "
         + "Tuition for 6 Credits (Out-of-State)"
         + "\nwith 0.25 Assistantship Rate and 0.1 Research Fee Rate"
         + "\n\nStudent: 1234567888 Andrews, Andy (Masters)"
         + "\nTotal Cost: $2,160.00 includes $1,800.00 Tuition "
         + "for 12 Credits (In-State"
         + "\nwith 0.25 Assistantship Rate"
         + "\n\nStudent: 1234567889 Jackson, Jackie (Undergraduate)"
         + "\nTotal Cost: $3,680.00 includes $3,200.00 Tuition" 
         + " for 16 Credits (Out-of-State)"
         + "\n\nStudent: 1234567890 Jones, Sam (Undergraduate)"
         + "\nTotal Cost: $1,840.00 includes $1,600.00 "
         + "Tuition for 16 Credits (In-State)"
         + "\n\nStudent: 1234567891 Smith, Pat (Masters)"
         + "\nTotal Cost: $2,160.00 includes $1,800.00 " 
         + "Tuition for 12 Credits (In-State)"
         + "\nwith 0.25 Assistantship Rate"
         + "\n\nStudent: 1234567892 Williams, Jo (PhD)"
         + "\nTotal Cost: $0.00 includes $0.00 " 
         + "Tuition for 12 Credits (International)"
         + "\nwith 0.5 Assistantship Rate and 0.1 "
         + "Research Fee Rate";
       
      String result = school.listByNumber();
   
      Assert.assertTrue("listByNumberFail", 
         result.contains("Student: 1234567887 Cassidy, Cathy (PhD)"));
      Assert.assertTrue("listByNumberFail", 
         result.contains("Total Cost: $5,040.00 includes $3,600.00"));
      Assert.assertTrue("listByNumberFail", 
         result.contains("Tuition for 6 Credits (Out-of-State)"));
   }

 /** Tests the listByName method. 
 * @throws IOException Error reading file
 **/
   @Test public void listByNameTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
                 
      String s2 = school.listByName();
      String s1 = "\n------------------------------\nStudents by Name"
         + "\n------------------------------\n\nStudent: 12345"
         + "67888 Andrews, Andy (Masters)\nTotal Cost: $2,160."
         + "00 includes $1,800.00 Tuition for 12 Credits (In-S"
         + "tate)\nwith 0.25 Assistantship Rate\n\nStudent: 12"
         + "34567887 Cassidy, Cathy (PhD)\nTotal Cost: $5,040."
         + "00 includes $3,600.00 Tuition for 6 Credits (Out-o"
         + "f-State)\nwith 0.25 Assistantship Rate and 0.1 Res"
         + "earch Fee Rate\n\nStudent: 1234567889 Jackson, Jac"
         + "kie (Undergraduate)\nTotal Cost: $3,680.00 include"
         + "s $3,200.00 Tuition for 16 Credits (Out-of-State)"
         + "\n\nStudent: 1234567890 Jones, Sam (Undergraduate)"
         + "\nTotal Cost: $1,840.00 includes $1,600.00 Tuition"
         + " for 16 Credits (In-State)\n\nStudent: 1234567891 "
         + "Smith, Pat (Masters)\nTotal Cost: $2,160.00 includ"
         + "es $1,800.00 Tuition for 12 Credits (In-State)\nwi"
         + "th 0.25 Assistantship Rate\n\nStudent: 1234567892 "
         + "Williams, Jo (PhD)\nTotal Cost: $0.00 includes $0."
         + "00 Tuition for 12 Credits (International)\nwith 0."
         + "5 Assistantship Rate and 0.1 Research Fee Rate\n\n";
      
      Assert.assertEquals("summaryFail", s1, 
          school.listByName());
   }
   
   
   /** Tests the excludedRecordsList method. 
   * @throws IOException Error reading file. 
   **/
   @Test public void excludedRecordsListTest() throws IOException {
      School school = new School();
      school.readStudentFile("school_1.txt");
      
      String s = "Invalid Student Category in:\nhD;1234567893;Hanks, "
         + "Thomas;12;3;0.50;0.10";
        
   
      Assert.assertEquals("excludedRecordsListFail", s, 
          school.getExcludedRecords()[0]);
   }
   
   
   /** This method tests AllThreeExceptions. 
   *@throws IOException error reading file.
   **/
   @Test public void allThreeExceptionsTest() throws IOException {
     
      boolean numberFormatThrown = false;
      boolean noSuchElementThrown = false;
      boolean negativeValueExceptionThrown = false;
      
    
      School s = new School();
      s.readStudentFile("school_3.txt");
                           
                                
   }
   
   
}
