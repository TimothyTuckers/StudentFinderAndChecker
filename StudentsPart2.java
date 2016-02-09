import java.io.IOException;


/** 
*
* Creates a main method for the Student class.
*   
* @author Tim Tucker
* @version 04-25-2014
*/

public class StudentsPart2 {
   
   /**
   * This method provides a student instance to implement in the class.
   * @param args Command line arguments not used.
   */
   public static void main(String [ ] args) {
   
      School school = new School();
      
   
      try {
         school.readStudentFile(args[0]);
      }
      catch (IOException ex) {
         System.out.println(ex.toString());
         System.out.println("Could not find student file" + args[0]);
      }
      
      System.out.println(school.summary() + school.listByNumber()
         + school.listByName() + school.excludedRecordsList()); 
   }
   
}
