import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
*
* Tests all the methods in the Graduate class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class GraduateTest {


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
   
   /**
   *Test the "if statement" regarding NegativeValuesException.
   *
   */
   @Test public void ifStatementFail2() {
      boolean exceptionThrown = false;
      try {
         Masters pupil = new Masters("1234567890", "Jones, Sam", 16, -1, 0.25);
      }
      catch (NegativeValueException e) {
         exceptionThrown = true;
      } 
   
      Assert.assertTrue(exceptionThrown);
   }
   
     /** Tests the getAssistantshipRate method. 
     *@throws NegativeValueException Throws exception when value is negative.
     */
   @Test public void getAssistantshipRateFail() throws NegativeValueException {
      Masters pupil = new Masters("1234567890", "Jones, Sam", 16, 1, 0.25);
        
   
      Assert.assertEquals("getAssistantshipRateFail", 
         pupil.getAssistantshipRate(), 0.25, .00001);
   }
   
    /** Tests the setAssistantshipRate method. 
   *@throws NegativeValueException Throws exception when value is negative.

    */
   @Test public void setAssistantshipRateFail() throws NegativeValueException {
      Masters pupil = new Masters("1234567890", "Jones, Sam", 16, 1, 0.25);
      pupil.setAssistantshipRate(0.45);
      
   
      Assert.assertEquals("setAssistantshipRateFail",
          pupil.getAssistantshipRate(), 0.45, .001);
   }
   
     /** Tests the toString method. 
     *@throws NegativeValueException Throws exception when necessary.
     */
   @Test public void toStringTest()throws NegativeValueException {
      Masters pupil = new Masters("1234567891", "Smith, Pat", 12, 1, 0.25);
      
           
      Assert.assertTrue("error in first line",
          pupil.toString().contains("Student: 1234567891"
            + " Smith, Pat (Masters)"));
      Assert.assertTrue("error in second line", 
         pupil.toString().contains("Total Cost: $2,160.00 includes $1,800.00"  
            + " Tuition for 12 Credits (In-State)"));
      Assert.assertTrue("error in third line", 
         pupil.toString().contains("with 0.25 Assistantship Rate"));
   
   }
   

}
