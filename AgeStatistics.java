/**
*@author Adam Biggs
*@version 8/26/22
*/

import java.util.Scanner;
/** 
*This program will show Age Statistics.
*/
public class AgeStatistics
{
   /** 
   *Main method.
   * @param args Command line arguments – not used. 
   */
   public static void main(String[] args)
   {
      //vars
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //prompt user for their name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //prompt user for their age in years
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   
      //prompt user for their gender
      System.out.print("Enter your gender "
         + "(1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age to minutes
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      //convert age to centuries
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100  + " centuries.");
         
      //shows max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) 
      {
         maxHeartRate = 209 - (0.7 * ageInYears);
      } else
      {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
      
   } 


}