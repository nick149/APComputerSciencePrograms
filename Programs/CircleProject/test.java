/**
 * Program: testCircle
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Mac OS X 10.11.2
 * Desciption: This test out the Circle program/java file
 * 
 * What I Learned: How to test out classes in different files
 * 
 * Difficulties: None
 * 
 */
public class test
{
    public static void main(String[] args)
{
    Circle spot = new Circle();
    spot. setRadius(3);
    System.out.println("Circle radius: " + spot. getRadius());
    System.out.println("Circle area: "+spot.area());
    System.out.println("Circle circumference: " + spot.circumference());
}
}
