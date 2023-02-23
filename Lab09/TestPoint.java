/**
 * A class that creates Point objects and calls methods from the Point class, making comparisons between points
 * 
 * @author Nikolaos Komninos
 * @version 2023-02-23
 */

public class TestPoint {

    /**
     * The main method, creates Point objects and calls methods from the Point class
     * @param args not used
     */
    public static void main(String[] args) {
        //Declare objects and variables for future use
        Point p1, p2, p3, p4;
        double distance1, distance2, distance3;

        //Instantiate point objects with various coordinates
        p1 = new Point(0, 0);
        p2 = new Point(4, 3);
        p3 = new Point(3, 4);
        p4 = new Point(0, 0);

        //Call toString of the Point object, printing the coordinates of the Point
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        //Perform distance calculations between various points
        distance1 = p1.calcDistance(p2);
        distance2 = p3.calcDistance(p4);
        distance3 = p2.calcDistance(p3); 

        //Manually prints the distance between two points
        System.out.println("The distance between " + p1 + " and " + p2 + " is " + distance1); 
        System.out.println("The distance between " + p3 + " and " + p4 + " is " + distance2); 
        System.out.println("The distance between " + p2 + " and " + p3 + " is " + distance3); 

        System.out.println(p1.isEqual(p2));
        System.out.println(p1.isEqual(p4));

    }
}
