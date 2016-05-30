import java.util.*;
/**
 * Program: Prog165aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption:This program takes the input from the user about how many *'s that they would like at first, 
 then on each line after the first counts back one * eventually having no stars at the end.

 * What I Learned: How to use a loop that counts backwards 
 * Difficulties: Not making a infinate loop, figuring out how to have one less * each time the program runs
 * 
 */
public class prog165aRudd
{
    public static void main (String [] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting size : ");
        int startingsize = input.nextInt();
        System.out.println();
        for (int lines=startingsize; lines>=0;)
        {
            for (int star=lines-1; star>=0;star=star-1)
            {
                System.out.print("*");
            }
            System.out.println();
            lines=lines-1;
        }
}       
}
/**Sample Output
Enter the starting size : 7

*******
******
*****
****
***
**
*

 */