/**
*@author Adam Biggs
*@version 8/28/22
*/
import java.util.Scanner;

/**
* This program will convert raw distance to differnt formats and find 
* remainders.
*/
public class LaserMeasure
{
   /**
   * Uses input (distance in inches) and prints how long
   * it is miles, yards, feet, and inches.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args)
   {
      //vars
      Scanner userInput = new Scanner(System.in);
      int raw = 0;
      int miles = 0;
      int yards = 0;
      int feet = 0;
      int inches = 0;
      int og = 0;
      
      //prompts and assignment
      System.out.print("Enter the raw distance measurement in inches: ");
      raw = userInput.nextInt();
      og = raw;
      miles = raw / 63360;
      raw = raw - miles * 63360;
      yards = raw / 36;
      raw = raw - yards * 36;
      feet = raw / 12;
      raw = raw - feet * 12;
      inches = raw;
      
      //funcionality
      if (raw <= -1) {
         System.out.print("Measurement must be non-negative!");
      } else {
         System.out.println();
         System.out.println("Measurement by combined miles,"
            + " yards, feet, inches: ");
         System.out.printf("\tmiles: " + miles);
         System.out.println();
         System.out.printf("\tyards: " + yards);
         System.out.println();
         System.out.printf("\tfeet: " + feet);
         System.out.println();
         System.out.printf("\tinches: " + inches);
         System.out.println();
         System.out.println();
         System.out.printf(og + " in = " + miles + " mi, " 
            +  yards + " yd, " + feet + " ft, " 
            +  inches + " in");
      }
   }
}
