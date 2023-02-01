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
      double fahrenheitTemp;
      int celsiusTemp;  // value to convert

      //Recieve input from user
      System.out.println("Please enter a temperature in degrees Celsius: ");
      celsiusTemp = scan.nextInt();
      scan.close();

      // Compute temperature in fahrenheit.
      fahrenheitTemp = (celsiusTemp*(9.0/5.0)) + 32;

      // Print equivalent temperatures in celsius and fahrenheit.
      System.out.println ("\nCelsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
   } // end main

} // end TempConverter

/*

3. The conversion is not correct because of the use of integer division instead of double division. When 9/5 is performed, the output will be truncated which messes up the conversion.

*/