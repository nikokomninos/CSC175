/**
 * A source of useless information.
 *
 * @Nikolaos Komninos (your name)
 * @Version 1 (a version number or a date)
 * @Purpose: Print some useless facts
 */
public class Useless
{
    // A source of useless information.
    public static void main(String[] args)
    {
        System.out.print("Some useless facts:\n");
        System.out.println();
        System.out.println("   Your ears never stop growing.");
        System.out.println("   Catsup travels at " + 100/4  + " miles per hour.");
        System.out.println("   I like turtles.");
    } // end of method main
    
} // end of class Useless

/*

7. Changing the call from System.out.println() to System.out.print() causes a new line to not be printed after the string, leading the next print call to be printed on the same line. 

9. The compiler returns a syntax error, since a semicolon is required to end all lines.

11. The output looks the same. This is because although the print statements contains the concatanation of a string and integer, the concatnation promotes the integer to a string and will display it as one. 

12. The output looks the same. Integer division is performed and THEN the result is concatnated and printed, applying the same logic as the previous answer. 

13. When dividing by 0, the program will still compile. However, it will run into a runtime error when attempting to run the line containing division by 0. This is because dividing by 0 is impossible, so the t will return an ArithmeticException error.

*/