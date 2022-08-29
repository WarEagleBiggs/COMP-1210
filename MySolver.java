/**
*@author Adam Biggs
*@version 8/28/22
*/
import java.util.Scanner;

/**
*This program asks for input and uses it to solve an equation.
*/
public class MySolver
{
   /**
   *main method.
   * @param args Command line arguments – not used. 
   */
   public static void main(String[] args)
   {
    //establish vars
      Scanner userInput = new Scanner(System.in);
      double result;
      double x;
      double y;
      double z;
   
   //get x y z inputs
      System.out.print("Enter x value: ");
      x = userInput.nextDouble();
      System.out.print("Enter y value: ");
      y = userInput.nextDouble();
      System.out.print("Enter z value: ");
      z = userInput.nextDouble();
   
   //run calculation
      result = ((8.5 * x + 6.1) * (10 * y + 7.9) / z);
      if (z == 0) {
         System.out.println("The result is undefined");
      } else {
         System.out.println("The result is " + result);
      }
    
   }
}