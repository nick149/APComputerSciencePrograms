import java.util.*;
/**
 * Program: Prog215cRudd
 * @Version: 2.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program finds the lenght of each side and the area of a rectangle without one side included
 * 
 * What I Learned: How to find the lenght of the sides with a for loop
 * Difficulties: Running the program with loop
 * 
 * ChangeLog: Added a input option to input amount of materials
 */
public class prog215cRudd
{
    public static void main (String [] args)
    {
        //asks user for input
        
        System.out.print("Please enter amount of materials :");
        //starting some variables
        Scanner input = new Scanner(System.in);
        int material = input.nextInt();
        int area = 0;
        int parimeter=0;
        int X = 0;
        
        //sets x to the amount of material, this way we can just divide and set the result equal to X, not the material, later
        X = material;
        
        //starts a loop for dividing
        for(int runs =1; runs<=2; runs++)
        {
            //divides the amount of materials twice
            X = X / 2;
        }
        
        //finds the long side or the side that is 2x
        int backside =2*X;
        
        //finds area
        area = X*(100-backside);
        
        //prints output
        System.out.println("With "+material+" yards of fencing material:");
        System.out.println("A rectangle "+X+ "X" + backside+" yards produce the maximum area of "+area+" square yards.");
    }
}
/** Sample Output
Please enter amount of materials :67
With 67 yards of fencing material:
A rectangle 16X32 yards produce the maximum area of 1088 square yards.


 */

