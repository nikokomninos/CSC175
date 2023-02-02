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
      int celsiusTemp = readCelsius();
      double fahrenheitTemp = convert(celsiusTemp);
      printConversion(celsiusTemp, fahrenheitTemp);


   } // end main

    /*readCelsius()- recieves value in celsius to be converted to fahrenheit from user
    Parameters - N/A 
    */
   public static int readCelsius(){
      Scanner scan = new Scanner(System.in);
      //Prompt user to input temperature in celsius
      System.out.println("Please enter a temperature in degrees Celsius: ");
      return scan.nextInt();

   }

    /*convert()- converts celsius to farenhiet through multiplying by the conversion factor and adding the base difference 
    Parameters - celsiusTemp, which represents the value that the user would like to convert to farenheit
    Precondition - celsiusTemp is a non-negative integer 
    */
   public static double convert(int celsiusTemp){
      final double CONVERSION_FACTOR = (9.0/5.0); //conversion factor between celsius and farenheit
      final int BASE = 32; //base difference between celsius and farenheit

      // Compute temperature in fahrenheit.
      return (celsiusTemp * CONVERSION_FACTOR) + BASE;

   }

    /*printConversion()- prints the original and converted temperature values
    Parameters - celsiusTemp, which represents the value that the user would like to convert to farenheit, and fahrenheitTemp, the converted value
    Precondition - celsiusTemp and fahrenheitTemp are non-negative integers
    */
   public static void printConversion(int celsiusTemp, double fahrenheitTemp){
      // Print equivalent temperatures in celsius and fahrenheit.
      System.out.println ("\nCelsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);

   }
} // end TempConverter
