import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/** 
*
* Tests all the methods in the NegativeValueException class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** This method tests the NegativeValueException. **/
   @Test public void negativeValueExceptionTest1() {
      boolean thrown = false;
      try {
         Undergraduate ugrad1 = new Undergraduate("1234567890",
                                "Jones, Sam", -16, 1);
                           
      }
      catch (NegativeValueException e) {
         thrown = true;
      }
      
      Assert.assertTrue(thrown);
                       
                                
   }
}
