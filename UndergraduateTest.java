import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
*
* Tests all the methods in the Undergraduate class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class UndergraduateTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   
    /** Tests the calculateTuition method. **/
   @Test public void calculateTuitionTestFail() {
      Undergraduate pupil = null;
   
      try {
         pupil = new Undergraduate("1234567890", 
            "Jones, Sam", 16, 1);
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
      Assert.assertEquals("calculateTuitionTestFail",
         pupil.calculateTuition(), 1600.00, .000001);
   }
   
    /** Tests the calculateTotalCost method. **/
   @Test public void calculateTotalCostFail() {
      Undergraduate pupil = null;
   
      try {
         pupil = new Undergraduate("1234567890", 
            "Jones, Sam", 16, 1);
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
      Assert.assertEquals("calculateTotalTestFail", 
         pupil.calculateTotalCost(), 1840.00, .000001);
   }
   
}
