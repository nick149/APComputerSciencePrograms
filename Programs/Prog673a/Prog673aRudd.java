import java.util.*;
/**
 * Program: Prog673aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1
 * Desciption:This program asjs the user how many rows and what type of trangle to make then prints the output to the user
 * 
 * What I Learned: How to use multiple methods with multiple loops in each, also setting up a menu to call for those methods
 * 
 * Difficulties: The loops for the center triangle was tricky(completly forgot how to make the triangle)
 * 
 * WARNING:This program can make your system unresponsive if the number of rows is too high, maxing out CPU and ram if on a old system!
 */
public class Prog673aRudd
{
    public static void leftTriangle()//this creates a left angled trangle
    {
        Scanner input = new Scanner (System.in);//configure the input
        System.out.print("How many rows: ");
        int rows = input.nextInt();//takes in the input
        for (int rowscont = 1; rowscont <= rows; rowscont++)//loops for the rows
        {
            for (int star = 1; star <= rowscont; star++)//loops for sar
            {
                System.out.print("*");
            }
            System.out.println("");//spacing
        }
    }
    public static void rightTriangle()//this creates a right angled triangle
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int rowscount = 1; rowscount <= rows; rowscount++)
        {
            for (int star = 1; star <= rowscount; star++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void centerTriangle()//creates a center alligned triangle
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int num=0;
        num=Integer.parseInt( input.nextLine() );
        for(int rows=1;rows<=num;rows++){
            for(int spaces=1;spaces<num-(rows-1);spaces++){
                System.out.print(" ");
            }
            for(int firststar=1;firststar<=rows;firststar++){
                System.out.print("*");
                for(int stars=1;stars<firststar;stars+=firststar)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args [])//this is the method that starts up my defualt
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Types of Triangles");//a menu with all the options
        System.out.println("1. Left");
        System.out.println("2. Right");
        System.out.println("3. Center");
        System.out.print("Enter a number(1-3): ");//asks what the user wants
        int menu = input.nextInt();//gets input
        if (menu == 1)//menu
        {
            leftTriangle();
        }
        else if (menu == 2)
        {
            rightTriangle();
        }
        else if (menu == 3)
        {
            centerTriangle();
        }else{//when the user enters anything else other than 1-3
            System.out.println("You have chosen to quit the program! Goodbye");
        }
    }
}
/** Sample Output
Types of Triangles
1. Left
2. Right
3. Center
Enter a number(1-3): 3
Enter Triangle Size : 4
   *
  ***
 *****
*******

Types of Triangles
1. Left
2. Right
3. Center
Enter a number(1-3): 1
How many rows: 4
*
**
***
****

Types of Triangles
1. Left
2. Right
3. Center
Enter a number(1-3): 2
How many rows: 4
*
**
***
****

 */