/*
 * Name: Nikolaos Komninos
 * Date & Version: 1/31/23 Ver. 1
 * Purpose: Compute the sum and average of three user-inputted integers
 */

//Import the java.util package in order to create a Scanner object
import java.util.*;

public class Computation{
    public static void main(String[] args) {
        //Initialize scanner object + variables 
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        //For loop to take three user inputs and add them to the sum
        for(int i = 0; i <= 2; i++){
            System.out.println("Please input a number: ");
            sum += scan.nextInt();
        }

        scan.close();
        //Compute average
        double avg = sum/3.0;

        //Print sum and average
        System.out.println("Sum: " + sum + "\nAverage: " + avg);
    }
}

/*

1. If the sum is not evenly divisble by 3, the numbers after the decimal point will be truncated. 

*/