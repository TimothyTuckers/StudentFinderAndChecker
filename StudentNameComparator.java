import java.util.Comparator;

/** 
*
* Creates an class which implements the Comparator
* interface to allow a comparison of students. 
*   
* @author Tim Tucker
* @version 04-25-2014
*/

public class StudentNameComparator implements Comparator<Student> {



 /**
   * This method provides a student to implement in the class.
   * @return The students after compared
   * @param s1 The student's name.
   * @param s2 The student's name.
   */
   
   public int compare(Student s1, Student s2) {
      return s1.getName().compareTo(s2.getName());
   }



}
