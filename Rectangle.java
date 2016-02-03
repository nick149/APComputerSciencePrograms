/**
 * Program: Rectangle
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Mac OS X 10.11.2
 * Desciption: This caulcates the area of the rectangle with width and height
 * 
 * What I Learned: How to test out classes in different files
 * 
 * Difficulties: None
 * 
 */
public class Rectangle
{
    private double width;
    private double height;

    public Rectangle()
    {
        height = 1;
        width = 1;
    }
    public Rectangle(double wid, double hieg)
    {
        height = hieg;
        width = wid;
    }
    public void setWidth(double newWidth)
    {
        width = newWidth;
    }
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }
    public double getHeight()
    {
        return(height);
    }
    public double getWidth()
    {
        return(width);
    }
    public double area()
    {
        double area;
        area = width * height;
        return(area);
    }
    public double perimeter()
    {
        double perimeter;
        perimeter = width + width + height + height;
        return(perimeter);
    }
}