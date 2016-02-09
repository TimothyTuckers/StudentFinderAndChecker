   

/** 
*
* Creates an abstract Graduate class that
* extends the student class, stores 
* the student data and provides methods to access the data. 
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public abstract class Graduate extends Student {
   protected double assistantshipRate;
   
/** 
*
* This represents the graduate tuition variable.
*/
   public static final double GRADUATE_TUITION = (BASE_TUITION * 1.5);

   /**
   *  The constructor which establishes
   * parameters for the class.
   *
   *
   *@param numberIn The student ID number.
   *@param nameIn The student's name.
   *@param creditsIn The number of credit hours the
   * student will be taking.
   *@param residencyIn The status of the student's 
   * residency via in-state, out-of-state, or international.
   *@param assistantshipRateIn The rate of the student's 
   * assistantship when as needed to calculate total cost.
      *@throws NegativeValueException Throws exception when value is negative.
   */

   public Graduate(String numberIn, String nameIn, int creditsIn,
    int residencyIn, double assistantshipRateIn)
      throws NegativeValueException {
   
      super(numberIn, nameIn, creditsIn, residencyIn);
      
      if (assistantshipRateIn < 0) {
         throw new NegativeValueException();
      } 
      
      assistantshipRate = assistantshipRateIn;
   
   }
   
   /**
   * This method gets the student assistanship rate.
   *@return The rate of the student's assistantship.
   */
   public double getAssistantshipRate() {
      return assistantshipRate;
   }

   /**
   * This method sets the student assistanship rate.
   * @param assistantshipRateIn The asssistantship rate.
   */
   public void setAssistantshipRate(double assistantshipRateIn) {
      assistantshipRate = assistantshipRateIn;
      
   }
   
   /**
   * This method prints the students information.
   *@return The students information.
   */
   public String toString() {
      String output = super.toString() + "\nwith " + assistantshipRate
         + " Assistantship Rate";
      return output; 
   
   }
   
   
   
   
}
