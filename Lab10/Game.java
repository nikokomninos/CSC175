import java.util.*;

/**
 * The blueprint class for the Rock-Paper-Scissors game. This class contains methods relating to the game itself
 * 
 * @author Nikolaos Komninos
 * @version 2023-03-02
 */
public class Game {
   
    /**
     * getInstructions: returns the instructions for the game
     * @return String, the instructions for the game
     */ 
    public String getInstructions(){
        return("Welcome to Rock-Paper-Scissors! When prompted, enter a choice out of the following three:\n\nROCK\nPAPER\nSCISSORS\n\nAfter entering your choice, you'll be put up against a CPU.\n");
    }

    /**
     * readAndValidateUserChoice: reads the user choice and compares it to the acceptable choices. If it is invalid, the user will be prompted to re-enter a choice until it is valid
     * @return choice, a String that contains the user's choice
     */
    public String readAndValidateUserChoice(){
        boolean isValid = false;
        Scanner scan = new Scanner(System.in);
        String[] valid = {"ROCK", "PAPER", "SCISSORS"};
        String choice;

        do{
            choice = scan.nextLine().toUpperCase();
            for(int i = 0; i < valid.length; i++){
                //Compares the user's input to each valid choice (stored in an array) and sets a boolean variable to true if it is a valid choice
                if(choice.equals(valid[i])){
                    isValid = true;
                }
            }
            //If the choice is invalid
            if(!isValid){
                System.out.println("Please enter a valid choice.");
            }
        }
        while(!isValid);

        return choice;
        
    }

    /**
     * generateCompChoice: generates a pseudorandom choice for the CPU opponent
     * @return String, the pseudorandom choice for the CPU opponent
     */
    public String generateCompChoice(){
        Random rand = new Random();
        //Generates a random number between 0 and 2
        int rn = rand.nextInt(3);

        //Returns certain choice based on the random number
        if(rn == 0){
            return "ROCK";
        }
        else if(rn == 1){
            return "PAPER";
        }
        else{
            return "SCISSORS";
        }
    }

    /**
     * determineWinner: Determines the winner of the game by comparing the user and computer choices. The winner is determined by a series of comparisons (directly chosen by the rock-paper-scissors combinations)
     * @param user The user's choice
     * @param comp The computer's choice
     * @return String, the result of the game
     */
    public String determineWinner(String user, String comp){
        //If same choice is picked
        if(user.equals(comp)){
            return "TIE"; 
        }
        //If user picks ROCK and computer picks SCISSORS
        else if(user.equals("ROCK") && comp.equals("SCISSORS")){
            return "USER WINS";
        }
        //If user picks SCISSORS and computer picks PAPER 
        else if(user.equals("SCISSORS") && comp.equals("PAPER")){
            return "USER WINS";
        }
        //If user picks PAPER and computer picks ROCK
        else if(user.equals("PAPER") && comp.equals("ROCK")){
            return "USER WINS";
        }
        //If the output is any other combination 
        else{
            return "COMPUTER WINS";
        }
    }


}
