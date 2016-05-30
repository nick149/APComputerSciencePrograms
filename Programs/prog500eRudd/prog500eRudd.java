import java.util.*;
/**
 * Program: Prog500eRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in a page number and a chapter then output it with 50 dots between the two
 * 
 * What I Learned: How to take in a String and then output later 
 * 
 * Difficulties: Knowing which error happens when you dont enter the required scan type   
 * 
 */
public class prog500eRudd
{
   public static void main (String [] args)
   {
       //starts a variable for later
       int pagenumber = 0;
       //gets ready for input
       Scanner input = new Scanner (System.in);
       //asks user for title of chapter
       System.out.print("Please Enter the Title: ");
       //gets input from user
       String chapter = input.nextLine();
       //asks user for page number
       System.out.print("Enter the Page Number: ");
       try//if something goes wrong this will help tell the user why
       {
           //gets page number input from user.
           pagenumber = input.nextInt();
        }catch(java.util.InputMismatchException e )
        {
            //Lets user know that what they entered is not a number but it needs to be
            System.out.println("Please enter a Number!");
        }
       //spacing
        System.out.println(" ");
        //ouput to user
       System.out.print(chapter+" ");
       //loop
       for(int dots = 1; dots<=50; dots++)
       {
           //prints out 50 .'s
           System.out.print(".");
        }
        //prints output to user
        System.out.print(" "+pagenumber);
    }
}
/**Sample Output
Please Enter the Title: An Intoduction to Java
Enter the Page Number: 5
 
An Intoduction to Java..................................................5

Please Enter the Title: Simple Data Types
Enter the Page Number: 27
 
Simple Data Types..................................................27

Please Enter the Title: Strings
Enter the Page Number: 50
 
Strings..................................................50
 */