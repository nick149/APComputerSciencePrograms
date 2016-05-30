import java.util.*;
/**
 * Program: Prog162aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: THis program takes a number then takes and multiples it a few times, then asks the user if they would like to enter another number,
 and if so gives them the option to enter another number while if they choose not to termintes the program 

 * What I Learned: How to use while loops and also how to end them when the user tells them to
 * Difficulties: Forgot to add a } and made the program a endless  loop, also could not figure out how to get the users input to end the program
 * 
 */
public class prog162aRudd
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        int continue_loop=1;
        while (continue_loop==1)
        {
            System.out.print("Enter number: ");
            int total = 1;
            int number = input.nextInt();
                for(int runs = 1; runs<=number; runs++){
                    total = total * runs;
                }
                System.out.println("The factorial is " + total);
                System.out.println("\nDo you wish to enter another number? 1=Yes and 2=No");
                continue_loop=input.nextInt();
            }
        }
        
    }
/** Sample Output
 * Enter number: 6
The factorial is 720

Do you wish to enter another number? 1=Yes and 2=No
1
Enter number: 9
The factorial is 362880

Do you wish to enter another number? 1=Yes and 2=No
1
Enter number: 12
The factorial is 479001600

Do you wish to enter another number? 1=Yes and 2=No
1
Enter number: 4
The factorial is 24

Do you wish to enter another number? 1=Yes and 2=No
1
Enter number: 7
The factorial is 5040

Do you wish to enter another number? 1=Yes and 2=No
1
Enter number: 10
The factorial is 3628800

Do you wish to enter another number? 1=Yes and 2=No
2
 * 
 */

