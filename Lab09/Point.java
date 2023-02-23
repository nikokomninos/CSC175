/**
 * A blueprint class for a Point object, which represents a point on the coordinate plane. The Point class contains methods relating to the retrieval and comparison of x and y coordinates.
 * 
 * @author Nikolaos Komninos
 * @version 2023-02-23
 */

public class Point {
   
    private int x, y;

    /**
     * Default constructor for Point
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Accessor, returns the x coordinate of the point
     * @return int x, the x coordinate of the point
     */
    public int getX(){
        return x;
    }
    

    /**
     * Accessor, returns the y coordinate of the point
     * @return int y, the y coordinate of the point
     */
    public int getY(){
        return y;
    }

    /**
     * Calculates the distance between one point and another, with said second point being recieved as a parameter.
     * @param p the second point that will be used as a comparison
     * @return double, distance between the two points computed using the distance formula
     */
    public double calcDistance(Point p){
        double xdist = Math.pow(p.getX() - x, 2);
        double ydist = Math.pow(p.getY() - y, 2);

        return(Math.sqrt(xdist + ydist));
    }

    /**
     * Compares two points and returns whether or not they have equal attributes
     * @param p the second point that will be used as a comparison
     * @return boolean, true (if the points are equals), false (if the points are not equal)
     */
    public boolean isEqual(Point p){
        if((x == p.getX()) && (y == p.getY())){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns a coordinate plane formatted representation of the x and y coordinate of the point
     */
    public String toString(){
        return("(" + x + "," + y + ")");
    }
}
