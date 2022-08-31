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
      double x = 0.0;
      double y = 0.0;
      double z = 0.0;
   
   //get x y z inputs
      System.out.print("result = (8.5x + 6.1) (10y + 7.9) / z");
      System.out.println();
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
   
   //run calculation
      result = ((8.5 * x + 6.1) * (10 * y + 7.9) / z);
      if (z == 0) {
         System.out.println("result is undefined");
      } else {
         System.out.println("result = " + result);
      }
    
   }
}