import java.util.*;
/**
 *This program (Prog54c) takes the radius of a circle and gives you the area nd the cicumference of that circle
 * Nicholas Rudd 
 * @Prog54c
 * What Ive Learned: How to get input from the user
 * Difficults: Nothing happened until I set the system to print something before it gets the radius
 */
public class prog54c
{
    public static void main (String[] args)
    {
        System.out.print("Enter a radius:"); //starts the program
        Scanner input=new Scanner(System.in); 
        double radius = input.nextDouble(); //gets the radius from the user
        //formulas below
        double pi = 3.14159;
        double circ = 2*radius*pi;
        double area = pi*(radius*radius);
        //keeps the decimal to the 1000th place
        area=(int)(area*1000+.5)/1000.0;
        circ=(int)(circ*1000+.5)/1000.0;
        //prints the results to the user
        System.out.println("The Radius Of the circle =    " + radius);
        System.out.println("The Area of the circle =  " + area);
        System.out.println("The Circumference of the circle =   " +circ);
    }
} 
/**Sample Output
 * The Radius Of the circle =    3.712
 * The Area of the circle =  43.288
 * The Circumference of the circle =  23.323
 */
