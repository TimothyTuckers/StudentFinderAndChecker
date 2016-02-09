/** 
*
* Creates an Masters class that extends 
* the Graduate class and stores data on Masters 
* students. 
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class Masters extends Graduate {

/** 
*
* This represents the misellanous masters 
* fee rate. 
*/

   public static final double MISC_MASTERS_FEE_RATE = 0.20;

 
 /**
 * The constructor which establishes
 * parameters for the class.
 *
 * @param numberIn The student ID Number.
 * @param nameIn The name of the student.
 * @param creditsIn The number of credits the student is taking.
 * @param residencyIn The status of the student's 
 *    residency via in-state, out-of-state, or international.
 * @param assistantshipRateIn The rate of the assistantship.
 *@throws NegativeValueException Throws exception when value is negative.
*@throws NegativeValueException Throws exception when value is negative.
*
 */
   public Masters(String numberIn, String nameIn, int creditsIn, 
      int residencyIn, double assistantshipRateIn) 
      throws NegativeValueException {
   
   
      super(numberIn, nameIn, creditsIn, residencyIn, assistantshipRateIn);
   
    
   }

  /**
  *This method returns the student's tuition when calculated 
  * alongside other variables.
  *@return The cost of tuition.
  */
   public double calculateTuition() {
      if (assistantshipRate >= 0.33) {
         return 0;
      }
      else {
         return credits * GRADUATE_TUITION * residency;
      }
   
   }
   
  /**
  *This method returns the student's total cost when calculated 
  * alongside other variables.
  *@return The total cost.
  */
   public double calculateTotalCost() {
      return calculateTuition() * (1 + MISC_MASTERS_FEE_RATE);
   }
   


}
