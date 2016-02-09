
/** 
*
* This creates a Negative Value
* Exception.
*   
* @author Timothy Tucker
* @version 04-25-2014
*/

public class NegativeValueException extends Exception {


 /** 
*
*  The constructor which establishes
* parameters for the class.
*
*
*/

   public NegativeValueException() {
   
      super("Numeric values must be nonnegative");
      
      
   }
}
