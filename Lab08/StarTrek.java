/**
 * Driver class = main class
 * 
 * @author Dr. Chays, revised by Nikolaos Komninos
 * @version 2023 February 21 
 */
public class StarTrek
{
    public static void main (String[] args) {
        // Create a spaceship.
        Spaceship enterprise = new Spaceship (40, 50, "Enterprise", "Kirk"); 
        // enterprise is an object of type Spaceship, i.e. enterprise is an instance of the Spaceship class.
        
        // Print enterprise's data.
        System.out.println (enterprise.toString()); // OR System.out.println (enterprise);
        
        // Change captain to Picard.
        enterprise.setCaptain ("Picard");
        
        // Print new captain.
        System.out.println("The new captain is " + enterprise.getCaptain());

        //Create new spaceship
        Spaceship klingonShip = new Spaceship(40, 70, "The Diviner", "Drednok");

        //Print klingonShip's data
        System.out.println(klingonShip);

        //Change captain to Niko
        klingonShip.setCaptain("Niko");

        //Print new captain
        System.out.println("The new captain is " + klingonShip.getCaptain());
    } // end main
} // end class

