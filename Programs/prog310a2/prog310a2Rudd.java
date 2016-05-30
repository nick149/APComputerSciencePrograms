import java.io.*;
import java.util.*;
/**
 * Program: Prog310a2Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1
 * Desciption: This program takes in a value, and the option of a graphing character (such as $ or @) and
 then print that character that value amount of times, before printing the value itself
 * 
 * What I Learned: How to use methods and pass variables throught different methods
 * 
 * Difficulties: None
 * 
 */
public class prog310a2Rudd
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in); // creates a scanner class
        System.out.print("Enter a value to chart: ");
        double value = input.nextDouble();
        System.out.print("Do you wish to supply the graphing character? (Y/N) ");
        input.nextLine();
        String yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase("y")){
            newCharacter(value);
        }
        else if(yesNo.equalsIgnoreCase("n")){
            chartValue(value);
        }
}
 
        public static void chartValue(double value)
        {
            if (value==0)//if zero, should only print 0
            {}else{//anything else
                for(int x = 0; x <= value; x++)
                {
                    System.out.print("*"); 
                }
            }
            System.out.print(value); // prints the value 
        
        }
        public static void newCharacter(double value)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a new character: ");
            String newChar = input.nextLine();
            for(int x = 1; x <= value; x++)
            {
                System.out.print(newChar);            
            }
            System.out.print(value); // prints the value
        }
 
}
/** Sample Output
Enter a value to chart: 3.2
Do you wish to supply the graphing character? (Y/N) y
Enter a new character: $
$$$3.2

Enter a value to chart: 16.1
Do you wish to supply the graphing character? (Y/N) y
Enter a new character: @
@@@@@@@@@@@@@@@@16.1

Enter a value to chart: 0.0
Do you wish to supply the graphing character? (Y/N) n
0.0

Enter a value to chart: 13.5
Do you wish to supply the graphing character? (Y/N) n
**************13.5

Enter a value to chart: 20
Do you wish to supply the graphing character? (Y/N) y
Enter a new character: &
&&&&&&&&&&&&&&&&&&&&20.0
 */

