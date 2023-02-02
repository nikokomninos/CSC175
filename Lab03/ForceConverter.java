/*
 * Name: Nikolaos Komninos
 * Date & Version: 2/2/23 Ver. 2
 * Purpose: Convert a user-inputted double value from pound-force to newtons
 */

//Import the java.util package in order to create a Scanner object
import java.util.*;

public class ForceConverter{
    public static void main(String[] args) {
        double poundForce = readLbf();
        double convertedPoundForce = convert(poundForce);
        printConversion(poundForce, convertedPoundForce);

    }

    /*readLbf()- recieves value in pound-force to be converted to newtons from user 
    Parameters - N/A 
    */
    public static double readLbf(){
        //Initalize scanner object, declare variables, constants
        Scanner scan = new Scanner(System.in);

        //Prompt the user to input a value in pound-force
        System.out.println("Please enter a value in pound-force to convert to newtons: ");
        return scan.nextDouble();
    }

    /*convert()- converts pound-force to newtons through multiplying by the newton constant
    Parameters - poundForce, which represents the value that the user would like to convert to Newtons 
    Precondition: poundForce is a non-negative floating point number
    */
    public static double convert(double poundForce){
        final double NEWTON = 4.44822162; //constant
        return NEWTON * poundForce; //return conversion
    }

    /*printConversion()- prints the original and converted values of weight 
    Parameters - poundForce, the original value, and convertedPoundForce, the converted value 
    Precondition: poundForce and convertedPoundForce are non-negative floating point numbers
    */
    public static void printConversion(double poundForce, double convertedPoundForce){
        //Print the original and converted value
        System.out.println("\nValue (Pound-force): " + poundForce + "\nValue (Newtons): " + convertedPoundForce);
    }
}
