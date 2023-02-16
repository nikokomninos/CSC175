/**
 * A program that crafts a sentence comprised of a random subject, verb and predicate, each chosen pseudorandomly from their respective arrays.
 * 
 * @author Nikolaos Komninos
 * @version 1.0
 * @since 2023-02-16
 */

public class SillySentence{

    /**
     * The main method that holds the String arrays, and prints out the randomly chosen words
     * @param args
     */
    public static void main(String[] args) {
        //Declare variables, initialize arrays
        String subject, verb, predicate;
        String[] subjects = {"I", "You", "He", "She", "It", "We", "They"};
        String[] verbs = {"destroy", "arrive", "unite", "devote", "love", "hate", "reckon", "exert", "give", "swear", "ate"};
        String[] predicates = {"life", "the president", "energy", "the professor", "death", "drinking water", "help"};

        //Retrieve random words
        subject = chooseWord(subjects);
        verb = chooseWord(verbs);
        predicate = chooseWord(predicates);
        //Print random words
        System.out.println(subject + " " + verb + " " + predicate + ".");
    }

    /**
     * A method that generates a pseudo-random number between 0 and the length of the array exclusive, and return the String at the random index
     * @param words, an array of Strings
     * @return words[x], a String at the randomly generated index of the array 
     * Precondition: String[] words is not empty and has a length greater than 0
     */
    public static String chooseWord(String[] words){
        //Generates a random number between 0 and the length of the array, exclusive
        int x = (int)(Math.random() * words.length);
        return words[x];
    }
}