/*
 * Name: Nikolaos Komninos
 * Date & Version: 2/6/23, Ver. 1
 * Purpose: Simulate a dice roll
 */

import java.util.*;

public class DiceRoll {
   public static void main(String[] args) {
      //Create new Random object, used to generate random values
      Random random = new Random();
      //Generate integer between 1 and 6 inclusive
      int roll = random.nextInt(6) + 1;

      System.out.println("The dice has rolled: " + roll);
   } 
}
