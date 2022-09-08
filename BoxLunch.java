import java.util.Scanner;
import java.text.DecimalFormat;

/**
* This program will take user input and determine if
* the user is an adult or child and how much 
* they should pay.
*@author Adam Biggs
*@version 9/7/22
*/
public class BoxLunch
{
   /** 
   *Main function. Contatins all functionality.
   *@param args Command line arguments (not used).
   */
   public static void main(String[] args)
   {
   //vars---------------------------------------------------------------
      Scanner userInput = new Scanner(System.in);
      String lunchCode;
      char lunchCodeChar;
      String name;
      String adultMealsNum;
      int adultMealsNumInt;
      String childMealsNum;
      int childMealsNumInt;
      String adultMealsCost;
      int adultMealsCostInt;
      float adultMealsCostFloat;
      String childMealsCost;
      int childMealsCostInt;
      float childMealsCostFloat;
      String total;
      int total1;
      int total2;
      int total3;
      int total4;
      int total5;
      char theme;
      int themeInt;
      String themeTxt = "";
      double luckyNum;
      
   //input-------------------------------------------------------------
      System.out.print("Enter order code: ");
      lunchCode = userInput.nextLine();
      System.out.println();
   //length check------------------------------------------------------
      lunchCodeChar = lunchCode.charAt(0);
      if (lunchCodeChar == ' ') {
         
         lunchCode = lunchCode.replaceFirst(" ", "");
      }
      if (lunchCode.length() < 13)
      {
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      } else {
      //decryption----------------------------------------------------
         theme = lunchCode.charAt(0);
         adultMealsNum = lunchCode.substring(1, 3);
         adultMealsCost = lunchCode.substring(3, 7);
         childMealsNum = lunchCode.substring(7, 9);
         childMealsCost = lunchCode.substring(9, 13);
         name = lunchCode.substring(13);
         luckyNum = Math.random() * 9999;
         total1 = Integer.parseInt(adultMealsNum);
         total2 =  Integer.parseInt(adultMealsCost);
         total3 = Integer.parseInt(childMealsNum);
         total4 = Integer.parseInt(childMealsCost);
         total5 = total1 * total2 + total3 * total4;
         total = Float.toString((float) total5 /  100);
         
      //conversion---------------------------------------------------
         themeInt = theme - '0';
         adultMealsNumInt = Integer.parseInt(adultMealsNum);
         childMealsNumInt = Integer.parseInt(childMealsNum);
         adultMealsCostInt = Integer.parseInt(adultMealsCost);
         childMealsCostInt = Integer.parseInt(childMealsCost);
         adultMealsCostFloat = (float) adultMealsCostInt / 100;
         childMealsCostFloat = (float) childMealsCostInt / 100;
         
      
         if (themeInt == 0)
         { //birthday
            themeTxt = "Birthday";
         } else if (themeInt == 1)
         { //graduation
            themeTxt = "Graduation";
         } else if (themeInt >= 2) 
         { //holiday
            themeTxt = "Holiday";
         }
         
         DecimalFormat formatResult = new DecimalFormat();
         formatResult.setMaximumFractionDigits(0);
         
      //print---------------------------------------------------------
         System.out.println("Name: " + name);
         System.out.println("Adult meals: " 
            + formatResult.format(adultMealsNumInt)
            + " at $" + adultMealsCostFloat);
         System.out.println("Child meals: " 
            + formatResult.format(childMealsNumInt) 
            + " at $" + childMealsCostFloat);
         System.out.println("Total: $" + total);
         System.out.println("Theme: " + themeTxt);
         System.out.println("Lucky Number: " + formatResult.format(luckyNum));
      }
   }
   
}
