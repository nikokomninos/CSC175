/** 
 * Extract first and last names from a full name, read from the user as "Last, First".
 * 
 * @Nikolaos Komninos (your name) 
 * @Version 1, 2/6/23(a version number or a date)
 */

import java.util.*;

public class ExtractNames
{
    // Extract (and print to standard output) the first and last names in "Last, First" (read from standard input).
    public static void main(String[] args)
    {
        // Set up a Scanner object for reading input from the user (keyboard).
        Scanner scan = new Scanner(System.in);
        //Create a Random object for generating random numbers
        Random generator = new Random();
        
        // Read a full name from the user as "Last, First".
        System.out.println ("Enter your full name as: \"First Last\"");
        String fullName = scan.nextLine();
        scan.close();
        
        // Find the index of the comma in the String entered by the user,
        // because the comma separates the last name from the first name.
        int positionOfSpace = fullName.indexOf(" ");
        
        // Extract the last and first names based on the index of space
        String firstName = fullName.substring(0, positionOfSpace);
        String lastName = fullName.substring(positionOfSpace + 1, fullName.length());
        //Generate random integer between 10 and 99 inclusive
        int random = generator.nextInt(98) + 10;

        //Generate username string
        String username = "" + firstName.substring(0,1) + lastName.substring(0,5) + random;
        
        // Print the first name and last name, along with username
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Username: " + username);
        
    } // end main
    
} // end ExtractNames

