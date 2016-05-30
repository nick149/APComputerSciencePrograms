import java.util.*;
/**
 * Program: Mathey
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Was writen on Java 1.7/Mac OS X 10.11.2, however last compiled on Windows 7 Pro with Java 1.8
 * Desciption:This program does math functions 
 * 
 * What I Learned: 
 * 
 * Difficulties:Figuring out what to put in here that wouldnt be impossible with my knowledge
 * 
 */
public class matheyRudd
{
    /**
     * The following class takes in a double and then square roots it, while returning it\
     * Variables: 
     *           number-Double
     */
    public double squareRoot(double number) { 
        return Math.sqrt(number); 
    } 
    /**
     * The following class takes in a double (side), then returns the area of a square using that side
     * Variables:
     *           side-Double
     */
    public double areaSquare(double side)
    {
        double area = side*side;
        return area;
    }
    /**
     * The following class takes in two doubles, side1 and side2, then returns the area of a 
     * rectangle from those two sides
     * 
     * Variables:
     *           side1-double-first side
     *           side2-double-second side
     */
    public double areaRectangle(double side1, double side2){
        double area = side1 * side2;
        return area;
    }
    /**
     * The following class takes in a (double) radius, then returns a area of a circle with that radius
     * 
     * Variables:
     *          radius-double
     */
    public double areaCircle(double radius)
    {
        double area = 3.14*radius*radius;
        return area;
    }
    /**
     * The following class takes in two doubles, bottom and height, then returns the area of a 
     * triangle with that bottom and with that height
     * 
     * Variables:
     *          bottom-double-bottom of the triangle that you have
     *          height-double-the hieght of the triangle that you have
     */
    public double areaTriangle(double bottom, double height)
    {
        double area = .5*bottom*height;
        return area;
    }
        /**
     * The following method takes in a (double) number, then the (int) power
     * 
     * Variables:
     *          number-double-the number that you would like to power
     *          power-int-the number that you would like to power the number by
     */
    public double power(double number, int power) {
        return Math.pow(number, power);
    }
     /**
     * The following method takes in a (double) number, then the (double) power
     * 
     * Variables:
     *          number-double-the number that you would like to power
     *          power-double-the number that you would like to power the number by
     */
    public double power(double number, double power) {
        return Math.pow(number, power);
    }
    public double sine(double n) {
        return Math.sin(n);
    }
    public double sine(int n) {
        return Math.sin(n);
    }
    public double cubeRoot(double n) {
        return Math.pow(n, (1.0/3.0));
    }

}
