/*
 * Name: Nikolaos Komninos
 * Date & Version: 2/5/23, Ver. 1
 * Purpose: Compute the values of sine and cosine squared (in radians) based off a user-inputted angle (in degrees)
 */

import java.util.*;

public class TrigFunctions {
    public static void main(String[] args) {
       //Create new scanner object to recieve user input, declare variables
       Scanner scan = new Scanner(System.in);
       double angle, sineSquared, cosineSquared;

       //Recieve user-inputted degree value, convert it to radians
       System.out.println("Enter an angle value (in degrees): ");
       angle = Math.toRadians(scan.nextInt());
       scan.close();

       //Computes and rounds the values of sine and cosine squared based off the user-inputted angle
       sineSquared = Math.round(Math.pow(Math.sin(angle), 2));
       cosineSquared = Math.round(Math.pow(Math.cos(angle), 2));

       System.out.println("Sine^2: " + sineSquared + "\nCos^2: " + cosineSquared);

    }    
}
