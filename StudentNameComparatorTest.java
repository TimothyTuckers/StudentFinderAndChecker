import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
*
* Tests all the methods in the Comparator class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class StudentNameComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

 /**
 * Tests the Comparator.
 *@throws NegativeValueException when a negative number
 * is used.
 * 
 **/
   @Test public void comparatorTest() throws NegativeValueException {
      Undergraduate u1 = new Undergraduate("1234567", "Eric", 19, 2);
      Undergraduate u2 = new Undergraduate("1234567", "Jon", 19, 2);
      
      StudentNameComparator c = new StudentNameComparator();
      Assert.assertEquals("", -5, c.compare(u1, u2));
   }
   
}
