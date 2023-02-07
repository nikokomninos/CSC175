/** 
 * Extract first and last names from a full name, read from the user as "First Last".
 * 
 * @Nikolaos Komninos
 * @Version 1, 2/6/23
 */

import java.util.*;

public class ExtractNames
{
    // Extract (and print to standard output) the first and last names in "First Last" (read from standard input).
    public static void main(String[] args)
    {
        // Set up a Scanner object for reading input from the user (keyboard).
        Scanner scan = new Scanner(System.in);
        
        // Read a full name from the user as "Last, First".
        System.out.println ("Enter your full name as: \"First Last\"");
        String fullName = scan.nextLine();
        scan.close();
        
        // Find the index of the space in the String entered by the user,
        // because the space separates the last name from the first name.
        int positionOfSpace = fullName.indexOf(" ");
        
        // Extract the last and first names based on the index of space
        String firstName = fullName.substring(0, positionOfSpace);
        String lastName = fullName.substring(positionOfSpace + 1, fullName.length());

        // Print the first name and last name, along with username
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        
    } // end main
    
} // end ExtractNames

