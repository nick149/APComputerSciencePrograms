
/**
 * Write a description of class prog54c here.
 * Nicholas Rudd 
 * @version (a version number or a date)
 */
public class prog54c
{
    public static void main (String[] args)
    {
        double radius = 3.712;
        double pi = 3.14159;
        double circ = 2*radius*pi;
        double area = pi*(radius*radius);
        area=(int)(area*1000+.5)/1000.0;
        circ=(int)(circ*1000+.5)/1000.0;
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
