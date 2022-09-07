import java.util.Scanner;
import java.text.DecimalFormat;
  
/**
* This program will solve an expression using input.
*@author Adam Biggs
*@version 9/6/22
*/
public class RadicalFormula
{
   /** 
   * Main function. Contatins all functionality.
   *@param args Command line arguments (not used).
   */
   public static void main(String[] args)
   {
   
   //vars----------------------------------------------
      Scanner userInput = new Scanner(System.in);
      double xValue = 0;
      double leftResult;
      double rightResult;
      double leftResult2;
      double rightResult2;
      double result = 0;
     
   
   //Num input functionality-----------------------------
      System.out.print("Enter a value for X: ");
      xValue = userInput.nextDouble();
   
   //Num output functionality----------------------------
      leftResult = Math.pow((3 * Math.pow(xValue, 8)) - (2 * Math.pow(xValue, 3)), 2);
      rightResult = Math.abs((3 * Math.pow(xValue, 5)) - (2 * Math.pow(xValue, 3)));

      result = Math.sqrt(leftResult + rightResult);
      
      
   //Conversion from double to string---------------------
      String resultStr = Double.toString(result);
      
   //Measurement Functionality----------------------------
    
      int index = resultStr.indexOf('.');
      int leftInt = index;
      int rightInt = resultStr.length() - index - 1;
       
      DecimalFormat formatResult = new DecimalFormat();
      formatResult.setMaximumFractionDigits(5);
   //Print-------------------------------------------------
      System.out.println("Result: " + result);
      System.out.println("# digits to left of decimal point: " + leftInt);
      System.out.println("# digits to right of decimal point: " + rightInt);
      System.out.println("Formatted Result: " + formatResult.format(result));
   }

}