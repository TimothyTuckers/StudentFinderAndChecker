import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
*
* Tests all the methods in the Student class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class StudentTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }



   /** Tests the getNumber method. 
   *@throws NegativeValueException Throws exception when value is negative.
      */
  
   @Test public void getNumberTest()throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890",
          "Jones, Sam", 16, 1);
   
      Assert.assertEquals("getNumberTestFail", pupil.getNumber(), "1234567890");
   }
   
    /** Tests the setNumber method. 
    *@throws NegativeValueException Throws exception when value is negative.
    */
   @Test public void setNumberTest() throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
      pupil.setNumber("666");
      
   
      Assert.assertEquals("setNumberTestFail", pupil.getNumber(), "666");
   }
   
    /** Tests the getName method. 
*@throws NegativeValueException Throws exception when value is negative.
    */
   @Test public void getNameTest() throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
        
   
      Assert.assertEquals("getNameTestFail", pupil.getName(), "Jones, Sam");
   }
   
    /** Tests the setName method. 
*@throws NegativeValueException Throws exception when value is negative.
    */
   @Test public void setNameTest() throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890",
         "Jones, Sam", 16, 1);
      pupil.setName("Junior, Sammy");
      
   
      Assert.assertEquals("setNameTestFail", pupil.getName(), "Junior, Sammy");
   }
   
   
    /** Tests the getCredits method. 
*@throws NegativeValueException Throws exception when value is negative.
    */
   @Test public void getCreditsTest()throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
        
   
      Assert.assertEquals("getCreditTestFail", pupil.getCredits(), 16);
   }
  
   /** Tests the setCredits method. 
*@throws NegativeValueException Throws exception when value is negative.
   */
   @Test public void setCreditsTest()throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
      pupil.setCredits(10);
      
   
      Assert.assertEquals("setCreditsTestFail", pupil.getCredits(), 10);
   }
   
    /** Tests the getResidency method. 
*@throws NegativeValueException Throws exception when value is negative.
    */
   @Test public void getResidencyTest() throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
        
   
      Assert.assertEquals("getResidencyTestFail", pupil.getResidency(), 1);
   }
  
  
   /** Tests the setResidency method. 
*@throws NegativeValueException Throws exception when value is negative.
   */
   @Test public void setResidencyTest()throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890",
         "Jones, Sam", 16, 1);
      pupil.setResidency(3);
      
   
      Assert.assertEquals("setResidencyTestFail", pupil.getResidency(), 3);
   }
  
  
  
  /** Tests the getStudentCount method. 
*@throws NegativeValueException Throws exception when value is negative.
  */
   @Test public void getStudentCountTest() throws NegativeValueException {
      Student.resetStudentCount();
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
       
   
      Assert.assertEquals("getStudentCountFail", pupil.getStudentCount(), 1);
   }
   
    /** Tests the resetStudentCount method. 
    *@throws NegativeValueException Throws exception when necessary.
    */
   @Test public void resetStudentCountTest()throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890",
          "Jones, Sam", 16, 1);
      pupil.resetStudentCount();
        
   
      Assert.assertEquals("resetStudentCountFail", pupil.getStudentCount(), 0);
   }
  
    /** Tests the toString method. 
    *@throws NegativeValueException Throws exception when necessary.
    **/
   @Test public void toStringTest()throws NegativeValueException {
      Undergraduate pupil = new Undergraduate("1234567890", 
         "Jones, Sam", 16, 1);
      String result = "Student: 1234567890 Jones, Sam (Undergraduate)" 
         + "Total Cost: $1,840.00 includes $1,600.00"  
         + "Tuition for 16 Credits (In-State)";
           
      Assert.assertTrue("error in first line",
          pupil.toString().contains("Student: 1234567890 Jones, " 
            + "Sam (Undergraduate)"));
      Assert.assertTrue("error in second line",
         pupil.toString().contains("Total Cost: $1,840.00" 
            + " includes $1,600.00 Tuition for 16 Credits (In-State)"));
   }
   
   
  
}
