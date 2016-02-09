
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
*
* Tests all the methods in the Masters class.
*   
* @author Tim Tucker
* @version 04-25-2014
*/
public class MastersTest {


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


  /** Tests the calculateTuition method. **/
   @Test public void calculateTuitionTestFail() {
   
      Masters pupil = null;
      boolean n = false;
    
      try {
         pupil = new Masters("1234567890", 
            "Jones, Sam", 16, 1, .32);
      }
      catch (NegativeValueException e) {
         n = true;
      }
        
      Assert.assertFalse(n);
      
      Assert.assertEquals("calculateTuitionTestFail",
         pupil.calculateTuition(), 2400.00, .000001);
   }
   
    /** Tests the calculateTotalCost method. **/
   @Test public void calculateTotalCostFail() {
      Masters pupil = null;
      boolean n = false;
   
      try {
         pupil = new Masters("1234567890", 
            "Jones, Sam", 16, 1, .34);
      }
      catch (NegativeValueException e) {
         n = true;
      
      }
        
      Assert.assertFalse(n);
      
      Assert.assertEquals("calculateTotalTestFail", 
         pupil.calculateTotalCost(), 0, .000001);
   }
   
  /** Tests the calculateTotalCost2 method. **/
   @Test public void calculateTotalCost2Fail() {
      Masters pupil = null;
      boolean n = false;
   
      try {
         pupil = new Masters("1234567890", 
            "Jones, Sam", 16, 1, .32);
      }
      catch (NegativeValueException e) {
         n = true;
      
      }
        
              
      Assert.assertEquals("calculateTotalTest2Fail", 
         pupil.calculateTotalCost(), 2880, .000001);
         
   }


}
