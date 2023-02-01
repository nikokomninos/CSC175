/*
 * Name: Nikolaos Komninos
 * Date & Version: 1/31/23 Ver. 1
 * Purpose: Compute the total value of money in dollars based off the amounts of certain coin types  
 */

//Import the java.util package in order to create a Scanner object
import java.util.*;

public class ChangeCounter {
    public static void main(String[] args) {
      //Initalize scanner object, declare variables, constants
      Scanner scan = new Scanner(System.in);
      int sum = 0; //Contains sum in cents
      double DOLLAR = 100.00; //$1.00 = 100 cents

      //Take input from user, utilizing only one variable and multiplying it based off the coin type
      System.out.println("How many quarters you have: ");
      sum += scan.nextInt() * 25;

      System.out.println("How many dimes you have: ");
      sum += scan.nextInt() * 10;

      System.out.println("How many nickels you have: ");
      sum += scan.nextInt() * 5;

      System.out.println("How many pennies you have: ");
      sum += scan.nextInt();

      scan.close();
      //Print total amount of money in dollars
      System.out.println("\nYour total is: $" + (sum/DOLLAR));

    }
}

/*

6. First, the program will ask for user input about the number of quarters the user has. After recieving the input, the input is multiplied by 25 (for $0.25 each quarter) and is added to a variable containing the sum in cents. This is repeated three more times for dimes, nickels and pennies, altered slightly for the different monetary values. Finally, the value in cents is converted to dollars by dividing by 100 and is subsequently printed.

*/