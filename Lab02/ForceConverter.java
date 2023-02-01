/*
 * Name: Nikolaos Komninos
 * Date & Version: 1/31/23 Ver. 1
 * Purpose: Convert a user-inputted double value from pound-force to newtons
 */

//Import the java.util package in order to create a Scanner object
import java.util.*;

public class ForceConverter{
    public static void main(String[] args) {
        //Initalize scanner object, variables
        Scanner scan = new Scanner(System.in);
        double NEWTON = 4.44822162; //constant
        double poundForce, convertedPoundForce;

        //Prompt the user to input a value in pound-force
        System.out.println("Please enter a value in pound-force to convert to newtons: ");

        //Recieve user input
        poundForce = scan.nextDouble();
        scan.close();
        convertedPoundForce = poundForce * NEWTON; 

        //Print the original and converted value
        System.out.println("\nValue (Pound-force): " + poundForce + "\nValue (Newtons): " + convertedPoundForce);
    }
}