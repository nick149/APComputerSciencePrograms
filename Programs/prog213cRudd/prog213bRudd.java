import java.util.*;
/**
 * Program: Prog213bRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes a input of the quantity wanted and then calculates the corrent price 
 and then the total amount due for that quantity. 
 * 
 * What I Learned: How to use if, else if, and else statements 
 * 
 * Difficulties: The decimals will not show the 0 if the decimal ends in a 0 so 7.40 shows as 7.4
 */
public class prog213bRudd
{
    public static void main (String [] args)
    {
        //gets the program ready to take a user input
        Scanner input = new Scanner (System.in);
        //asks user for there input
        System.out.print("Enter quantity: ");
        //gets input from user
        int quantity = input.nextInt();
        //starts some variables that will be changed later
        double price;
        double amount;
        if (quantity >= 0 && quantity < 100) //if the quanity is between 0-99 then the below will run
        {
            price=7.95;//the price is $7.95
            amount = quantity*price; //calculates the total amount
            amount = (int)(amount*100.0+.5)/100.0; //rounding 
            //displays output to user
            System.out.println("Price = $"+price);
            System.out.println("Amount Due = $"+ amount);
        }
        else if (quantity >= 100 && quantity <200)
        {
            price=7.75;//the price is $7.75
            amount = quantity*price;//calculates the total amount
            amount = (int)(amount*100.0+.5)/100.0;//rounding 
            //displays output to user
            System.out.println("Price = $"+price);
            System.out.println("Amount Due = $"+ amount);
        }
        else if (quantity >= 200 && quantity <300)
        {
            price=7.40;//the price is $7.40
            amount = quantity*price;//calculates the total amount
            amount = (int)(amount*100.0+.5)/100.0;//rounding 
            //displays output to user
            System.out.println("Price = $"+price);
            System.out.println("Amount Due = $"+ amount);
        }
        else if (quantity >= 300)
        {
            price=7.15;//the price is $7.15
            amount = quantity*price;//calculates the total amount
            amount = (int)(amount*100.0+.5)/100.0;//rounding 
            //displays output to user
            System.out.println("Price = $"+price);
            System.out.println("Amount Due = $"+ amount);
        }
        else
        {
            //This is when all of the above is false, this results in a error
            System.out.println("Error");
        }
    }
}
/** Sample Output

Enter quantity: 0
Price = $7.95
Amount Due = 0.0

Enter quantity: 375
Price = $7.15
Amount Due = $2681.25

Enter quantity: 199
Price = $7.75
Amount Due = $1542.25

Enter quantity: 200
Price = $7.4
Amount Due = $1480.0

Enter quantity: 475
Price = $7.15
Amount Due = $3396.25

 */
