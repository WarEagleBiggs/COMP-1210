import java.util.Scanner;

/** Comment.
*@author Adam Biggs
*@version 9/2/22
* This program will convert text the user inputs to differnt output types.
*/
public class MessageConverter
{

   /**
   * Main Method.
   *@param args Command line arguments (not used).
   */
   public static void main(String[] args)
   {
      //vars--------------------------------------
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
   
      //init functionality------------------------
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
     
      //convert functionality----------------------
      if (outputType == 0) { //as is
         result = message;
      } else if (outputType == 1) { //trimmed
         result = message.trim();
      } else if (outputType == 2) { //lower case
         result = message.toLowerCase();
      } else if (outputType == 3) { //upper case
         result = message.toUpperCase();
      } else if (outputType == 4) { //replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      } else if (outputType == 5) { //remove first and last char
         result = message.substring(1, message.length() - 1);
      } else { //invalid
         result = "Error: invalid choice input.";
      }
      
      //print functionality pt2-----------------------
      System.out.println("\n" + result);
   
   
   }

}