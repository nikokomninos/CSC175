import java.util.*;

/**
 * The driver class for the Rock-Paper-Scissors game program. This class calls methods from the Game class to simulate a game of Rock-Paper-Scissors.
 * 
 * @author Nikolaos Komninos
 * @version 2023-03-02
 */
public class RPS{
   
    //Variables storing the overall stats
    public static int ties, wins, losses = 0;

    /**
     * main: The main method of the class, contains method calls to methods in both this class and the Game class
     * @param args Unused
     */
    public static void main(String[] args){
        Game game = new Game();
        //User choice, computer choice, most recent game result, and play again response respectively
        String choice, compChoice, result, playAgain;
        Scanner scan = new Scanner(System.in);
        //Boolean that tracks if the user is continuing to play the game
        boolean play = true;
        //Boolean that tracks if the user's input choice to play or not play again is valid
        boolean valid = false;

        //Prints the game instructions
        System.out.println(game.getInstructions());

        //Loops while the variable play is true
        do{
            System.out.println("Please enter your choice (ROCK, PAPER, SCISSORS):");

            //Stores the user choice
            choice = game.readAndValidateUserChoice();

            //Stores the computer choice
            compChoice = game.generateCompChoice();

            //Stores the result of the most recent game based on the String returned by the determineWinner method
            result = (game.determineWinner(choice, compChoice));
            System.out.println("Result: " + result);

            //Updates the overall stats between games
            updateStats(result);

            //Prompts the user to choose whether or not they would like to play again
            System.out.println("Play Again? (Y/N)");

            //Loops while the valid variable is false (if the input for playing again is not Yes or No)
            do{
                playAgain = scan.nextLine().toUpperCase();

                //If yes, restart the original do-while loop
                if(playAgain.equals("Y")){
                    valid = true;
                }
                //If no, end the original and nested do-while loops
                if(playAgain.equals("N")){
                    valid = true;
                    play = false;
                }
                //If the user input is invalid
                else if(!(playAgain.equals("Y") || (playAgain.equals("N")))){
                    System.out.println("Please enter a valid option");
                }
                
            }
            while(!valid);

        }
        while(play);

        //Prints the overall stats
        System.out.println("\nOverall Results:\n\nWins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

    }

    /**
     * Updates the overall stats for the game (ties, wins, losses) based off of the result from the most recent game
     * @param result the result of the most recent game
     */
    public static void updateStats(String result){
        if(result.equals("TIE")){
            ties++;
        }
        else if(result.equals("USER WINS")){
            wins++;
        }
        else{
            losses++;
        }
    }
    
}
