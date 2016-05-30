import java.util.*;
/**
 * Program: Prog507aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: THis program surronds a word with *'s and has the same space on all sides.
 * 
 * What I Learned: How to use .length function for a changing length of a string
 * 
 * Difficulties: None
 * 
 */
public class prog507aRudd
{
    public static void main (String [] args)
    {
        //gets input from user
        Scanner input = new Scanner(System.in);
        //asks user for the string
        System.out.print("Please Enter A String: \t");
        //gets the string from user
        String word = input.nextLine();
        //creats a loop for the first stars
        for (int stars1 = 1 ; stars1<=(word.length())+6; stars1++)
        {
            System.out.print("*");
        }
        //new line and a star
        System.out.print("\n*");
        //loop for spaces
        for (int space1 = 1 ; space1<=(word.length())+4; space1++)
        {
            System.out.print(" ");
        }
        //and a star
        System.out.print("*");
        //prints the word and then stars along with spaces
        System.out.print("\n*  "+word+"  *");
        //new line and a star
        System.out.print("\n*");
        //loop for spaces
        for (int space2 = 1 ; space2<=(word.length())+4; space2++)
        {
            System.out.print(" ");
        }
        //amd a star
        System.out.print("*");
        //a new line
        System.out.print("\n");
        // a final loop for the bottom stars
        for (int stars2 = 2 ; stars2<=(word.length())+7; stars2++)
        {
            System.out.print("*");
        }
    }
}
/** Sample Output
Please Enter A String: 	Thinking
**************
*            *
*  Thinking  *
*            *
**************
Please Enter A String: 	Ms. Holmes is my cool teacher!
************************************
*                                  *
*  Ms. Holmes is my cool teacher!  *
*                                  *
************************************

Please Enter A String: 	I
*******
*     *
*  I  *
*     *
*******

Please Enter A String: 	Nick
**********
*        *
*  Nick  *
*        *
**********

Please Enter A String: 	Apple Macbook 2010 2.4 2GB RAM
************************************
*                                  *
*  Apple Macbook 2010 2.4 2GB RAM  *
*                                  *
************************************
**/
