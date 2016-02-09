import org.junit.Before;
import org.junit.Test;

/** 
*
* Creates a class to test 
* the StudentsPart2 class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class StudentsPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

 /** 
*
*Tests the StudentPart2 class.
*/
   @Test public void mainTest() {
      StudentsPart2 s = new StudentsPart2();
      String[] args = {"school_1.txt"};
      s.main(args);
   }
 
}
