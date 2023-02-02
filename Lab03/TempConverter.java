//********************************************************************
//  TempConverter.java    Author: Lewis/Loftus, Modified for lab exercise (DC)
//
//  Demonstrates the use of primitive data types and arithmetic
//  expressions.  
//********************************************************************

import java.util.*;
public class TempConverter
{
   //-----------------------------------------------------------------
   //  Computes the Fahrenheit equivalent of a specific Celsius
   //  value using the formula F = (9/5)C + 32.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      // Declare variables.
      Scanner scan = new Scanner(System.in);

      //Prompt user to input temperature in celsius
      System.out.println("Please enter a temperature in degrees Celsius: ");
      //Pass user-inputted temp as parameter for convert method
      convert(scan.nextInt());
      scan.close();


   } // end main

    /*convert()- converts celsius to farenhiet through multiplying by the conversion factor and adding the base difference 
    Parameters - celsiusTemp, which represents the value that the user would like to convert to farenheit
    Precondition - celsiusTemp is a non-negative integer 
    */
   public static void convert(int celsiusTemp){
      final double CONVERSION_FACTOR = (9.0/5.0); //conversion factor between celsius and farenheit
      final int BASE = 32; //base difference between celsius and farenheit

      // Compute temperature in fahrenheit.
      double fahrenheitTemp = (celsiusTemp * CONVERSION_FACTOR) + BASE;

      // Print equivalent temperatures in celsius and fahrenheit.
      System.out.println ("\nCelsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
   }

} // end TempConverter
