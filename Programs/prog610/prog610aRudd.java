import java.util.*;
import java.io.*;
/**
 * Program: Prog610aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1
 * Desciption: This program read from prog610a.dat, which then calculates the area of a triagle with that and 
 deturmands if or it is not a traingle
 * 
 * What I Learned:How to multiple methods and use those multiple methods to calculate formulas, along with passing variables along with it
 * 
 * Difficulties: The formula was a bit tricky
 * 
 */
public class prog610aRudd
{
    public static void triangleArea( int a, int b, int c )//method for calculating area
{
    double s = (a + b + c)/2.0d;//first step
    double x = (s * (s-a) * (s-b) * (s-c));//second step
    double area= Math.sqrt(x);//final step in formula, dont try and mix these otherwise you risk getting incorrect results
    area=(int)(area*10000.0+.5)/10000.0;//counding
    if(area==0.0)//if not a triangle
    {
        System.out.println(a+"\t"+b+"\t"+c+"\tNot A Triangle!");
    }else{//if it is prints the area to user
    System.out.println(a+"\t"+b+"\t"+c+"\t"+area);
}
}
public static void main (String args[])
{
    Scanner file = null;//need this here, otherwise fails to compile, stuck at the try statment.
    try
        {
            file = new Scanner (new File("prog610a.dat"));//looks for file
        }
        catch (FileNotFoundException e) //only runs when the file is not there
        {
            System.out.println ("404 File Not Found! Please Place prog610a.dat in the same directory as this program");
        }
        System.out.println("A\tB\tC\tArea");
        
        while(file.hasNextLine()){//loop for all numbers in file
            int a = file.nextInt();
            int b = file.nextInt();
            int c = file.nextInt();
            triangleArea(a,b,c);//calls for method
        }
    }
}
/** Sample Output
A	B	C	Area
3	4	5	6.0
3	4	50	Not A Triangle!
7	8	9	26.8328
9	9	12	40.2492
6	5	21	Not A Triangle!
24	7	25	84.0
13	12	5	30.0
50	40	30	600.0
10	10	10	43.3013
82	34	48	Not A Triangle!
4	5	6	9.9216

 */
