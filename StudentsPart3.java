import java.io.IOException;
               


/** 
*
* Creates a main method for the StudentPart3 class.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class StudentsPart3 {

/** 
*
* The Main method for StudentsPart3.
*@param args Command Line not used.
*   
 */

   public static void main(String [ ] args) {
   
    
      School school = new School();
      if (args.length == 0) {
         System.out.println("*** File name not provided "
            + "by command line argument. \n"
            + "Program ending.");
         return;
      
      }
      
   
      
      try {
         school.readStudentFile(args[0]);
      }
      
      catch (IOException ex) {
         System.out.println("*** File not found. \n" 
            + "Program ending.");
         return;
      }
      
      
      System.out.println(school.summary() + school.listByNumber()
         + school.listByName() + school.excludedRecordsList()); 
   }
   
}
         

