/**
 * The blueprint class for a Dog object, which represents a dog. Contains multiple attributes of the dog and methods used for comparisons
 * 
 * @author Nikolaos Komninos
 * @version 2023-02-23
 */

public class Dog {
   
    private String name;
    private double age;

    /**
     * Default constructor for the Dog class
     * @param name the name of the dog
     * @param age the age of the dog (in dog years)
     */
    public Dog(String name, double age){
        this.name = name;
        this.age = age;
    }

    /**
     * Accessor method, returns name of the dog
     * @return String, the name of the dog
     */
    public String getName(){
        return name;
    }

    /**
     * Mutator method, changes the name of the dog
     * @param newName the new name for the dog that will replace the original name
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * Accessor method, returns age of the dog
     * @return double, the age of the dog
     */
    public double getAge(){
        return age;
    }

    /**
     * Mutator method, changes the name of the dog
     * @param newAge the new age for the dog that will replace the original age
     */
    public void setAge(double newAge){
        age = newAge;
    }

    /**
     * Converts the dog's age to human years 
     * @return double, the age of the dog in human years
     */
    public double getHumanAge(){
        return(age * 7);
    }

    /**
     * Compares the attributes of two dogs and returns true if they are the same, else returns false
     * @param d the other Dog object being used for comparison
     * @return boolean, true if they are the same, false if they are not
     */
    public boolean isEqual(Dog d){
        if((name.equals(d.getName())) && (age == d.getAge())){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns a string containing the main information about a dog
     */
    public String toString(){
        return("This is " + name + "! They are " + age + " years old in dog years and " + getHumanAge() + " in human years.");
    }
}
