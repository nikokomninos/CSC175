/**
 * A class that creates multiple Dog objects and calls multiple methods relating to the dog class
 * 
 * @author Nikolaos Komninos
 * @version 2023-02-23
 */

public class Kennel {

    /**
     * The main method, creates Dog objects and calls methods from the Dog class
     * @param args
     */
    public static void main(String[] args) {
        //Declare variables 
        Dog d1, d2, d3, d4;
        String oldName;

        //Initialize Dog objects
        d1 = new Dog("Fido", 4.0);
        d2 = new Dog("Spot", 2.5);
        d3 = new Dog("Spark", 7.0);
        d4 = new Dog("Spark", 7.0);

        //Call toString of the Dog class, printing various pieces of information about the Dog object
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        //Stores the old name of the Dog, changes the name, and prints the old and new name
        oldName = d1.getName();
        d1.setName("Fidonia");
        System.out.println(oldName + "'s new name is " + d1.getName());

        //Changes the age of the Dog and prints the new age
        d1.setAge(3.0);
        System.out.println(d1.getName() + " is now " + d1.getAge() + " years old.");

        //Compares two dogs to check if they have equal attributes
        System.out.println(d1.isEqual(d2));
        System.out.println(d3.isEqual(d4));
    }
}
