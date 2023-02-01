/*
 * Name: Nikolaos Komninos
 * Date & Version: 1/31/23 Ver. 1
 * Purpose: Convert a user-inputted double value from pound-force to newtons
 */

//Import the java.util package in order to create a Scanner object
import java.util.*;

public class ForceConverter{
    public static void main(String[] args) {
        //Initalize scanner object, declare variables, constants
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

/*

5. First, the prgoram will take input from the user, requiring them to input the value in pound-force that they would like to convert to newtons. Then, the inputted value will be multipied by the newton constant and be assigned to a new variable that will be used to contain the converted value. Finally, the newly converted value will be printed.

*/
