/**
 * LbsToKgsWithMethods converts a weight in pounds to a weight in kilograms.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class LbsToKgsWithMethods
{
   /**
    * Input (from the user): weight in pounds.
    * Output (to the screen): weight in kilograms.
    * Assumptions: The user will enter valid input, i.e. a positive value for pounds.
    */
   public static void main (String[] args)
   {
      // Declare variables
      double lbs, kgs;

      // Read the weight in pounds from the user.
      lbs = readLbs ();
      
      // Calculate the weight in kilograms.
      kgs = convertToKgs (lbs);
                   
      // Print the weight in pounds and kilograms.
      printWeight (lbs, kgs);
   } // end main
   
   // Read the weight in pounds from the user, and return it (data type: double).
   public static double readLbs ()
   {      
      // Set up Scanner object
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a weight in pounds: ");
      double lbs = scan.nextDouble();
      scan.close();

      return lbs;
   } // end readLbs
   
   // convertToKgs receives a weight in lbs (of type double) and returns the equivalent weight in kgs (of type double).
   public static double convertToKgs (double pounds)
   {
       // Declare constant
       final double LBS_PER_KG = 2.2;
       
       double result = pounds / LBS_PER_KG;
       
       return result;
   } // end convertToKgs
   
   // Print the specified weights in pounds and kilograms, both of type double.
   public static void printWeight (double lbs, double kgs)
   {
      // Round the output to three decimal places
      DecimalFormat fmt = new DecimalFormat ("0.###");
      
      System.out.println("The given weight in pounds is " + fmt.format (lbs));
      System.out.println("The equivalent weight in kilograms is " + fmt.format (kgs));
   } // end printWeight
   
} // end LbsToKgsWithMethods
