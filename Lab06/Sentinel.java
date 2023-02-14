import java.util.*;

/**
 * Sentinel program reads grades from the user in an infinite loop until broken, and computes the average of the inputted grades
 * 
 * @author Nikolaos Komninos
 * @version 1.0
 * @since 2023-02-14
 */

public class Sentinel{

    /**
     * The main method which reads grades from the user and computes their averaege
     * @param args Unused
     */
    public static void main(String[] args) {
        //Decleare variable, initialize scanner object to recieve user input
        Scanner scan = new Scanner(System.in);
        int sum = 0, count = 0;
        final int SENTINEL = -1;

        //Infinite loop that recieves grades from user, until broken by inputting -1
        while(true){
            int x;
            System.out.println("Please enter a grade (or -1 to terminate)");
            x = scan.nextInt();
            //If -1 is inputted
            if(x == SENTINEL){
                break;
            }
            //Checks if the inputted grade is valid, and only adds to sum and count if it is
            else if(checkGrade(x)){
                sum += x;
                count += 1;
            }
        }
        scan.close();

        if(count == 0){
            System.out.println("No grades entered.");
        }
        else{
            System.out.println("Average: " + ((double)sum/count));
        }
    }

    /**
     * A method that checks if the grade is a valid positive integer between 0 and 100
     * @param grade The grade being checked
     * @return boolean value
     */
    public static boolean checkGrade(int grade){
        if(grade >= 0 && grade <= 100){
            return true;
        }
        else{
            return false;
        }
    }

}