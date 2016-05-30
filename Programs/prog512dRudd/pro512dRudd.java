import java.util.*;
import java.io.*;
/**
 * Program: Prog512dRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in UPC codes from a file (prog512.dat) and then states if the UPC 
 code is valid or not
 * 
 * What I Learned: How to use charAt to get a number with the number where its at in 
 * 
 * Difficulties: Figuring out how to take in the series of numbers without using crazy loops
 * 
 */
public class pro512dRudd
{
    public static void main (String [] args)
    {
        //starts some varaibles 
        Scanner file = null; //has to be here otherwise wont compile due to not initulized error
        int even = 0;
        int odd = 0;
        int number;
        int finalValid;
        //sees if the file is there
        try
        {
            file = new Scanner (new File("prog512.dat"));
        }
        catch (FileNotFoundException e) //only runs when the file is not there
        {
            System.out.println ("404 File Not Found! Please Place Prog512.dat in the same directory as this program");
        }
        while (file.hasNext())
        {
            //takes in the UPC code
            String code = file.nextLine();
            //resets the even and odd
            even = 0;
            odd = 0;
            //lets the user know what they are looking at
            System.out.print("UPC Code\tValidity\n");
            System.out.print(code+"\t");
            //loop to get all the numbers
            for (int count = 0; count<=11; count++)
            {
                number = code.charAt(count);//takes in the next int
                number = number - 48;//converts it back to its orginal state
                if(count%2==0)
                {
                    //adds to the even numbers
                    even+=number;
                }
                else
                {
                    //adds to the odd numbers
                    odd+=number;
                }
            }
            finalValid = (3*even)+odd;//adds all the numbers together the required way
            if (finalValid%10==0) //if we can divid the number by 10
            {
                System.out.print("Valid\n");
                System.out.print("\n");
            }
            else if (!(finalValid%10==0))//everything else
            {
                System.out.print("Invalid\n");
                System.out.print("\n");
            }
            else //if we recieve a crazy error
            {
                System.out.println("Somehow "+finalValid+" is not dividable 10 but at the same time it is..");
                System.out.println("Error! Please correct the following errors");
            }
        }
    }
}
/**Sample Output
UPC Code	Validity
016499215511	Valid

UPC Code	Validity
372415613274	Invalid

UPC Code	Validity
155512994610	Valid

UPC Code	Validity
011165459192	Invalid

UPC Code	Validity
838241762110	Invalid
 */