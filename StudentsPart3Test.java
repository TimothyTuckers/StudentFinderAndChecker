import org.junit.Before;
import org.junit.Test;


/** 
*
* Tests all the methods in the StudentsPart3 class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class StudentsPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** 
*
*Tests the StudentPart3 main.
*/
   @Test public void mainTest() {
      StudentsPart3 s = new StudentsPart3();
      String[] args = {"school_3.txt"};
      s.main(args);
   }
   
 /** 
*
*Tests the StudentPart3 main.
*/
   @Test public void mainTest2() {
      StudentsPart3 s = new StudentsPart3();
      String[] args = {};
      s.main(args);
   }
   
    /** 
*
*Tests the StudentPart3 main.
*/
   @Test public void mainTest3() {
      StudentsPart3 s = new StudentsPart3();
      String[] args = {"school_7.txt"};
      s.main(args);
   }

   
}
   
