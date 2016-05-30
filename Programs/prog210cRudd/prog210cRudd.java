import java.util.*;
/**
 * Program: Prog210cRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program creates a random number between 1 and 100 and lets the user 
 guess what the number is
 * 
 * What I Learned: How to make a random number generator and then set it equal to a int, 
 plus using if statements to see if one number is higher or lower than another
 * 
 * Difficulties: None
 */
public class prog210cRudd
{
    public static void main (String[] args)
    {
       //gets ready for a random number and a system input 
       Random random = new Random ();
       Scanner input = new Scanner (System.in);
       //lets the user know that the number is between 1 and 100
       System.out.println("The number that I am thinking of is between 1 and 100");
       //creates a random number between 1 and 100
       int number = random.nextInt(101);
       //starts the loop
       boolean notRight = true;
       //initilizes some variables that will be changed later
       int guess;
       int guessnumber=0;
       //System.out.println(number); <<-- Use this to see the number before you guess
       while(notRight)
       {
           //resets the gues at each run
           guess = 0;
           //asks user for a guess
           System.out.print("Please Enter Your Guess : ");
           //takes users input
           guess= input.nextInt();
           //it the guess the number?
           if (guess == number)
           {
               //lets user know they have got the number
               System.out.println("You got it! The number is "+number);
               //adds one last guessnumber before we exit
               guessnumber++;
               //prints the guess number to user
               System.out.println("You got it right in "+guessnumber+" tries");
               //sets the loop not to run anymore
               notRight=false;
            }
            //is the guess higher than the number?
            else if (guess > number)
            {
                System.out.println("Guess is Too High, Please Try Again");
                //counts how many tims it takes the user to get the random number
                guessnumber++;
            }
            //is the guess lower than the number
            else if (guess < number)
            {
                //Lets the user know that the number is too low
                System.out.println("Guess Too Low, Please Try Again!");
                //counts how many times it take the user to get the number
                guessnumber++;
            }
            //this only runs when all of the above is not true, this would result in a error
            else
            { 
                System.out.println("Error");
            }
            
    }
}
}
/** Sample Output
The number that I am thinking of is between 1 and 100
Please Enter Your Guess : 90
Guess is Too High, Please Try Again
Please Enter Your Guess : 50
Guess Too Low, Please Try Again!
Please Enter Your Guess : 60
Guess Too Low, Please Try Again!
Please Enter Your Guess : 70
Guess is Too High, Please Try Again
Please Enter Your Guess : 65
Guess is Too High, Please Try Again
Please Enter Your Guess : 66
Guess is Too High, Please Try Again
Please Enter Your Guess : 67
Guess is Too High, Please Try Again
Please Enter Your Guess : 64
You got it! The number is 64
You got it right in 8 tries

 */
