import java.io.*;  
import java.util.*;
/**
 * Program: Prog209aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in values from a file (p209a.dat) and then calculates all the values and sees which ones are below 500 and which ones are above or equal
to 500, then prints output to user
 * 
 * What I Learned: How to use try-catch with importing a file and using the FileNotFOundException error also how to set a scanner = to null
 * 
 * Difficulties: How to start and keep a loop running when there are a unknown amount of values, and had to figure out how to set the file = to a null value otherwise Java
 complained that the file variable was not initualized
 * 
 */
public class prog209aRudd
{
    public static void main (String args[])
    {
        //starts some varaibles 
        Scanner file = null; //has to be here otherwise wont compile due to not initulized error
        int number; 
        int numbersless=0; 
        int numbersGreater=0;
        int count=0;
        
        try
        {
            file = new Scanner (new File("p209a.dat"));
        }
        catch (FileNotFoundException e) //only runs when the file is not there
        {
            System.out.println ("404 File Not Found! Please Place p209a.dat in the same directory as this program");
        }
        
        //starts a loop to get all the values in the file
        while(file.hasNextLine())
        {
            number = file.nextInt(); //makes sure the file is an int
            if (number < 500) //sees if the number is less than 500
            {
                numbersless++; //creates a counting variable
            }
            else if (number >= 500)
            {
                numbersGreater++;
            }
            else //this is when the number is not a int
            {
                System.out.println("Error on Line " + count);
            }
            count ++; //counts up by one    
        }
        
        //Prints output to user
        System.out.print("The Number of Numbers less than 500 is ");
        System.out.print(numbersless);
        System.out.println(" ");
        System.out.print("The Number of Numbers Greater than or Equal to 500 is ");
        System.out.print(numbersGreater);
        System.out.println(" ");
        System.out.print("The total number of numbers is ");
        System.out.print(count);
    }
}
/** Sample Output
The Number of Numbers less than 500 is 263 
The Number of Numbers Greater than or Equal to 500 is 237 
The total number of numbers is 500
 */