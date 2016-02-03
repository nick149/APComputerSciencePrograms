
/**
 * Program: testRec
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Mac OS X 10.11.2
 * Desciption: This test out the Rectangle program/java file
 * 
 * What I Learned: How to test out classes in different files
 * 
 * Difficulties: None
 * 
 */
public class testRec
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        box.setHeight(4);
        box.setWidth(5);
        System.out.println("Rectangle height: " + box.getHeight());
        System.out.println("Rectangle area: " + box.area());
        System.out.println("Rectangle perimeter: " + box.perimeter());
    }
}
