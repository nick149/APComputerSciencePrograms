import java.util.*;
import java.io.*;
/**
 * Program: Prog213cRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in a student id, and number of credits then outputs 
 there grade level and then asks if the user would like to run again 
 * 
 * What I Learned: How to use switch statements and char with them
 * 
 * Difficulties: None
 */
public class prog213cRudd
{
    public static void main (String [] args) throws IOException
    {
        //gets ready to get users input
        Scanner input = new Scanner(System.in);
        //sets up a boolean to see if we want it to run
        boolean run = true;
        //runs while the boolean is set to true
        while(run){
            //asks user for student id/number
            System.out.print("Enter Student Number: ");
            //gets users inout for student id
            int studentNumber = input.nextInt();
            //ask credits from users
            System.out.print("Enter Credits: ");
            //gets credits from user
            double credits = input.nextDouble();
            //sets code to o at each run
            int code = 0;
            if(credits < 30) //runs the folling code when the credits is less than 30
            {
                code = 1;
            }
            else if (credits >= 30 && credits < 70) //runs the following code when the credits is between 30 and less than 70
            {
                code = 2;
            }
            else if (credits >=70 && credits < 90) //runs the code when the credits is between 70 and less than 90
            {
                code = 3;
            }
            else if (credits >= 90) //any credit 90 or above is 4 credits
            {
                code = 4;
            }
            else //anthing else results in a error
            {
                System.out.println("Error");
            }
            //prints output to user
            System.out.println("Grade Code Is " + code);
            System.out.print("Do again (y/n)? ");
            //sees if user would like to do it again
            char yes = (char)System.in.read();
            switch(yes){
                case 'y': //if y then conitues program
                run = true;
                break;
                case 'n': //if n then halts program
                run = false;
            }
            //spacing for next run
            System.out.println(" ");
        }
    }
}
/** Sample Output
Enter Student Number: 2352
Enter Credits: 30
Grade Code Is 2
Do again (y/n)? y

Enter Student Number: 3639
Enter Credits: 29.9
Grade Code Is 1
Do again (y/n)? 4007

Enter Student Number: Enter Credits: 70
Grade Code Is 3
Do again (y/n)? y

Enter Student Number: 4915
Enter Credits: 103.7
Grade Code Is 4
Do again (y/n)? y

Enter Student Number: 950166
Enter Credits: 99
Grade Code Is 4
Do again (y/n)? n

 */



