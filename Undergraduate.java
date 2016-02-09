/** 
*
* Creates an Undergraduate class that extends 
* the Student class stores data on Undergraduate
* students.
*  
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class Undergraduate extends Student {

   /**
   * 
   * This is the miscellanous fee rate.
   */
   public static final double MISC_FEE_RATE = 0.15;

   /**
   *  The constructor which establishes
   * parameters for the class.
   *
   * @param numberIn The student ID number.
   * @param nameIn The name of the student.
   * @param creditsIn The number of credits the student is taking.
   * @param residencyIn The student's residency status.
   *@throws NegativeValueException Throws exception when value is negative.
*
   */

   public Undergraduate(String numberIn, String nameIn, 
      int creditsIn, int residencyIn)
      throws NegativeValueException {
   
      super(numberIn, nameIn, creditsIn, residencyIn);
   
   }

  /**
   * This method calculates the tuition.
   * @return The tuition as calculated.
   */
   public double calculateTuition() {
      return credits * BASE_TUITION * residency;
   }
   
   /**
   * This method calculates the total cost.
   *@return The calculated total cost for the student.
   */
   public double calculateTotalCost() {
      return this.calculateTuition() + (MISC_FEE_RATE * calculateTuition());
   }



}
