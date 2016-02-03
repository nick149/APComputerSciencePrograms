
/**
 * Program: Circle
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Mac OS X 10.11.2
 * Desciption: This program caulates the area, and circumference of a circle using PI and radius
 * 
 * What I Learned: How to test out classes in different files
 * 
 * Difficulties: None
 * 
 * WARNING:This program contains errors from coping and pasting from adobe reader
 */
public class Circle
{
    private static final double PI = 3.14;
    private double radius;
    /**
    * constructor
    * pre: none
    * post: A Circle object created. Radius initialized to l.
    */
    public Circle()
    {
        radius = 1;
    }
    /** //default radius
    * constructor
    * post: A Circle object created with radius r.
    */
   public Circle(double r)
   { 
       radius = r;
    }
                    /**
                       * Changes the radius of the circle.
* pre: none
* post: Radius has been changed.
*/
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    //Interface
    //The public methods of a class define the interface of an object. The interface is how client code can interact with an object.
    /**
       * Calculates the area of the circle.
* pre: none
* post: The area of the circle has been returned.
*/
    public double area()
    {
        double circleArea;
        circleArea = PI * radius * radius;
        return(circleArea);
    }
/**
* Returns the radius of the circle.
* pre: none
* post: The radius of the circle has been returned.
*/
    public double getRadius()
    {
        return (radius);
    }
    public double circumference()
    {
        double circumference;
        circumference=2*PI*radius;
        return(circumference);
    }
    public static void displayAreaFormula()
    {
        System. out. println("The formula for the area of a circle is a=Pi*r*r");
    }
}