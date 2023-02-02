/*
 * Name: Nikolaos Komninos
 * Date & Version: 2/2/23 Ver. 2
 * Purpose: Convert a user-inputted double value from pound-force to newtons
 */

//Import the java.util package in order to create a Scanner object
import java.util.*;

public class ForceConverter{
    public static void main(String[] args) {
        //Initalize scanner object, declare variables, constants
        Scanner scan = new Scanner(System.in);

        //Prompt the user to input a value in pound-force
        System.out.println("Please enter a value in pound-force to convert to newtons: ");

        //Pass user input as parameter to convert method
        convert(scan.nextDouble());
        scan.close();

    }

    /*convert()- converts pound-force to newtons through multiplying by the newton constant
    Parameters - poundForce, which represents the value that the user would like to convert to Newtons 
    Precondition: poundForce is a non-negative floating point number
    */
    public static void convert(double poundForce){
        final double NEWTON = 4.44822162; //constant
        double convertedPoundForce = NEWTON * poundForce; //conversion

        //Print the original and converted value
        System.out.println("\nValue (Pound-force): " + poundForce + "\nValue (Newtons): " + convertedPoundForce);

    }
}
