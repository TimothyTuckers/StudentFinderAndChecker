import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
*
* Tests all the methods in the PhD class. 
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class PhDTest {


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
         PhD pupil = new PhD("1234567890", "Jones, Sam", -16,  3, 0.50, 0.10);
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
         PhD pupil = new PhD("1234567890", "Jones, Sam", 16,  3, 0.50, -0.10);
      }
      catch (NegativeValueException e) {
         exceptionThrown = true;
      } 
   
      Assert.assertTrue(exceptionThrown);
   }
   
   
    /** Tests the getResearchFeeRate method. **/
   @Test public void getResearchFeeRateFail() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 12, 3, 0.50, 0.10);
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
   
      Assert.assertEquals("getResearchFeeRateFail", 
         pupil.getResearchFeeRate(), 0.10, .00001);
   }
   
    /** Tests the setResearchFeeRate method. **/
   @Test public void setResearchFeeRateFail() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 12, 3, 0.50, 0.10);
         pupil.setResearchFeeRate(0.45);
      
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
   
   
      Assert.assertEquals("setResearchFeeRateFail",
         pupil.getResearchFeeRate(), 0.45, .001);
   }



      /** Tests the calculateTuition method. **/
   @Test public void calculateTuitionTestFail() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 12, 3, 0.50, 0.10);
         pupil.setResearchFeeRate(0.45);
      
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
   
      Assert.assertEquals("calculateTuitionTestFail", 
         pupil.calculateTuition(), 0.00, .000001);
   }
    /** Tests the calculateTotalCost method. **/
   @Test public void calculateTotalCostFail() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 12, 3, 0.50, 0.10);
         pupil.setResearchFeeRate(0.45);
      
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
   
   
      Assert.assertEquals("calculateTotalTestFail", 
         pupil.calculateTotalCost(), 0.00, .000001);
         
   }
   
       /** Tests the calculateTotalCost2 method. **/
   @Test public void calculateTotalCost2Fail() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 9, 1, 0.33, .1);
      
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
   
   
      Assert.assertEquals("calculateTotalTest2Fail", 
         pupil.calculateTotalCost(), 3780, .000001);
         
   }

 
     /** Tests the toString method. **/
   @Test public void toStringTest() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 12, 3, 0.50, 0.10);
      
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
   
           
      Assert.assertTrue("error in first line", 
         pupil.toString().contains("Student: 1234567892 Williams, Jo (PhD)"));
      Assert.assertTrue("error in second line", 
         pupil.toString().contains("Total Cost: $0.00 includes $0.00"
            + " Tuition for 12 Credits (International)"));
      Assert.assertTrue("error in third line",
         pupil.toString().contains("with 0.5 Assistantship Rate" 
            + " and 0.1 Research Fee Rate"));
   
   }


 
     /** Tests the toString method. **/
   @Test public void toStringTest2() {
      PhD pupil = null;
      try
      {
         pupil = new PhD("1234567892", "Williams, Jo", 12, 2, 0.50, 0.10);
      
      }
        
        
      catch (NegativeValueException e) {
      }
        
   
           
      Assert.assertTrue("error in first line", 
         pupil.toString().contains("Student: 1234567892 Williams, Jo (PhD)"));
      Assert.assertTrue("error in second line", 
         pupil.toString().contains("Total Cost: $0.00 includes $0.00"
            + " Tuition for 12 Credits (Out-of-State)"));
      Assert.assertTrue("error in third line",
         pupil.toString().contains("with 0.5 Assistantship Rate" 
            + " and 0.1 Research Fee Rate"));
   
   }


}
