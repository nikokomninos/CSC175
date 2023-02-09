/*
 * Author: Nikolaos Komninos
 * Date: 2/9/23 Ver. 1
 * Purpose: Perform a number of methods related to grade computation, including summation, average, letter grade conversion, and grade search within a certain range
 */

import java.util.*;

/*
 * GradeComputation - contains multiple methods related to grade computation, including sum, avg, etc.
 */
public class GradeComputation{
    public static void main(String[] args) {
        //Create scanner object to recieve user input, declare variables
        Scanner scan = new Scanner(System.in); 
        int j, k, sum, close;
        double avg;
        char letterGrade;

        //Prompts user to input number of grades to be stored for future use
        System.out.println("How many grades are to be included?");
        j = scan.nextInt();
        int[] grades = readGrades(j);

        //Prompts user to input number of grades in order that they wish to summate
        System.out.println("\nHow many grades to summate in order?");
        j = scan.nextInt();
        sum = computeSum(grades, j);
        System.out.println("\nThe sum of the first " + j + " grades is: " + sum);

        //Prompts user to input number of grades in order that they wish to average 
        System.out.println("\nHow many grades to find average of in order?");
        j = scan.nextInt();
        avg = computeAverage(grades, j);
        System.out.println("\nThe average of the first " + j + " grades is: " + avg);

        //Converts the previously found average into a letter grade
        letterGrade = convertToLetterGrade(avg);
        System.out.println("\nThe letter grade of the average is: " + letterGrade);

        //Prompts the user to input the number of grades they wish to look through, and the range in which they wish to compare the grades to the average
        System.out.println("\nHow many grades to look through in order, and the desired range to compare with to the average?");
        j = scan.nextInt(); k = scan.nextInt(); avg = computeAverage(grades, j);
        close = howManyCloseToAvg(grades, j , avg, k);
        System.out.println("\nThere are " + close + " grades in the range of plus or minus " + k + " of the average, " + avg);
    }

    /*
     * readGrades() - recieves input from the user to store the grades in an array of integers
     * Parameters: int j, the number of grades
     * Pre-condition: number of grades inputted is a positive integer
     */
    public static int[] readGrades(int j){
        //Create scanner object to recieve user input
        Scanner scan = new Scanner(System.in);
        //Create array of length j, with j being the number of grades
        int[] grades = new int[j];

        //Iterate through array and store user input in each index
        System.out.println("\nNow enter " + j + " grade(s):");
        for(int i = 0; i < j; i++){
            System.out.println("\nGrade " + (i+1));
            grades[i] = scan.nextInt();
        }

        return grades;

    }

    /*
     * computeSum() - computes the sum of the first n integers in an array
     * Parameters: grades, an array of integers representing grades, and n, an integer used to stop at a certain point in the array
     * Pre-Condition: grades is a length greater than zero, n is a positive integer
     */
    public static int computeSum(int[] grades, int n){
        int sum = 0;

        //Iterate through array and add each element together
        for(int i = 0; i < n; i++){
            sum += grades[i];
        }

        return sum;
    }

     /*
     * computeAverage() - computes the average of the first n integers in an array
     * Parameters: grades, an array of integers representing grades, and n, an integer used to stop at a certain point in the array
     * Pre-Condition: grades is a length greater than zero, n is a positive integer
     */
   public static double computeAverage(int[] grades, int n){
        //Use pre-defined computeSum method to find sum
        int sum = computeSum(grades, n);
        return sum/(double)n;
    }

     /*
     * convertToLetterGrade() - determines the letter grade based on the average of grades 
     * Parameters: avg, a double that stores the average of the grades
     * Pre-Condition: avg is a positive double 
     */
    public static char convertToLetterGrade(double avg){
        char letterGrade = 'U';

        //Runs checks to find the letter grade based on grade range
        if(avg >= 90){letterGrade = 'A';}
        else if(avg >=80 && avg < 90){letterGrade = 'B';}
        else if(avg >=70 && avg < 80){letterGrade = 'C';}
        else if(avg >=60 && avg < 70){letterGrade = 'D';}
        else if(avg < 60 ){letterGrade = 'F';}

        return letterGrade;
    }

    /*
    * howManyCloseToAvg() - determines the number of grades that are close to the average grade by plus or minus k
    * Parameters: grades, an array of integers representing the grades, n, an integer used to stop at a certain point in the array, avg, the average of the grades, and k, the upper and lower bound of determination 
    * Pre-Condition: grades is a length greater than zero, n is a positive integer, avg is a positive double, k is a positive integer
    */
    public static int howManyCloseToAvg(int[] grades, int n, double avg, int k){
        int j = 0;
        for(int i = 0; i < n; i++){
            //Compares current array element to the upper and lower bound of the average based on user inputted value
            if(grades[i] <= avg+k && grades[i] >= avg-k){
                j++;
            }
        }

        return j;
    }
    
}