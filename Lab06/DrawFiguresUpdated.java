/** 
 * DrawFiguresUpdated draws figures, using multiple static(class) methods in the same class.
 *
 * @author DC
 * @version 2021 February 9
 */
public class DrawFiguresUpdated
{
    
    // Draw figures.
    public static void main (String[] args)
    {
        //Prints a house for the number of times specified in the loop
        for(int i = 0; i < 2; i++){
            drawHouse();
        }

        for(int i = 0; i < 2; i++){
            drawRocket("A rocket\n","US");
        }
    } // end main

    // Draw a diamond.
    public static void drawDiamond()
    {
        drawCone();
        drawV(); 
    }
    
    // Draw an X.
    public static void drawX()
    {
        drawV();
        drawCone();
    }    

    // Draw a house
    public static void drawHouse(){
        drawCone();
        drawBox();
    }
        
    // Draw a rocket.
    // Parameters: label, a String storing something extra to print after drawing the rocket, and country, a String storing two characters to display on the rocket.
    public static void drawRocket(String label, String country)
    {
        drawCone();
        drawBox();
        System.out.println ("| " + country + " |");
        drawBox();
        drawCone();
        System.out.println(label); // Print label (a String received from calling method)
    }
    
    // Draw a cone.
    public static void drawCone()
    {        
        System.out.println ("  /\\ ");
        System.out.println (" /  \\");
    }    
    
    // Draw a V.
    public static void drawV()
    {
        System.out.println (" \\  /");
        System.out.println ("  \\/ ");
    }    
    
    // Draw a box.
    public static void drawBox()
    {
        System.out.println ("+----+");
        System.out.println ("|    |");
        System.out.println ("|    |");
        System.out.println ("+----+"); 
    }
    
} // end DrawFigs


