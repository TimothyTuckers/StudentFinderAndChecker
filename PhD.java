/** 
*
* Creates an PhD class that extends the Graduate class
* and stores student data and provides methods to access the data. 
*   
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class PhD extends Graduate {

   private double researchFeeRate;
   
   /**
   * 
   *This represents the misellanous PhD fee rate.
   */
   public static final double MISC_PHD_FEE_RATE = 0.30;

  /**
   * The constructor which establishes
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
   * @param researchFeeRateIn The rate the student is recieving for 
   * performing student research.
   *@throws NegativeValueException Throws exception when value is negative.
*
   */
 
   public PhD(String numberIn, String nameIn, int creditsIn,
   int residencyIn, double assistantshipRateIn, double researchFeeRateIn) 
      throws NegativeValueException {
   
      super(numberIn, nameIn, creditsIn, residencyIn, assistantshipRateIn);
       
      if (researchFeeRateIn < 0) {
         throw new NegativeValueException();
      } 
      
      researchFeeRate = researchFeeRateIn;
     
   
   }
   
   
    /**
   * This method gets the research fee rate.
   * @return The research fee rate.
   */
   public double getResearchFeeRate() {
      return researchFeeRate;
   }

   /**
   *
   * This method sets the research fee rate.
   *@param researchFeeRateIn The research fee rate.
   */
   public void setResearchFeeRate(double researchFeeRateIn) {
      researchFeeRate = researchFeeRateIn;
      
   }
   
   /**
   * This method calculates the tuition.
   *@return The tuition calculated
   */
   public double calculateTuition() {
      if (assistantshipRate >= .50) {
         return 0;
      }
      else {
         return credits * GRADUATE_TUITION * 2.0 * residency;
      }
         
   }
   
   /**
   * This method calculates the total cost.
   *@return The calculated total cost for the student.
   */
   public double calculateTotalCost() {
      return calculateTuition() + (calculateTuition() * MISC_PHD_FEE_RATE) 
         + (calculateTuition() * researchFeeRate); 
      
   }
   
   /**
   * This method prints the student's information.
   *@return The student's information.
   */
   
   public String toString() {
      return super.toString() 
         + " and " + researchFeeRate + " Research Fee Rate";
   
   }
   
}
