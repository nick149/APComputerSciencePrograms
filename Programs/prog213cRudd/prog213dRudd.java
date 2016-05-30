import java.util.*;
/**
 * Program: Prog213dRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in the number of chirps per min and then calculates how cold it is outside to Fahrenhiet or Celsius and then list the recommended condition outside.
 * 
 * What I Learned: How to use try catch (to catch errors) and also how to use a string variable along with how to convert from Fahrenhiet to Celsius.
 * 
 * Difficulties: Orginally I want to make this run multiple times, however that was not part of the program discription so it was not done
 */
public class prog213dRudd
{
   public static void main (String [] args)
   {
       //starts some variables
       int chirps = 0;
       double f_temp;
       double c_temp;
       String condition;
       
       //gets ready to take users input
       Scanner input = new Scanner (System.in);
       
       try{ 
           System.out.print("Enter Cricked Chrips/Min: ");
           chirps = input.nextInt();
        }
        catch (InputMismatchException e){ //if the user enters anything other than a number then the code below will not crash but inform them
            System.out.println("Please enter a number");
        }
        
        //converts from chirps to F and to C
        f_temp = (chirps + 40) /4;
        c_temp = (f_temp - 32) / 1.8;
        //some rounding for F and C
        c_temp = (int)(c_temp*10.0+.5)/10.0;
        f_temp = (int)(f_temp*10.0+.5)/10.0; 
        //displays output to user
        System.out.println("Fahrenheit = "+f_temp);
        System.out.println("Celsius = " + c_temp);
        
        if ( f_temp>=109) //if the temp is or above 109
        {
            condition = "Dead Cricket";
        }
        else if (f_temp >= 81 && f_temp <= 108) //if the temp is between 81 and 108
        {
            condition = "Whew";
        }
        else if (f_temp >= 65 && f_temp <= 80) //if the temp is between 65 and 80
        {
            condition = "Ah-hhh";
        }
        else if (f_temp >= 45 && f_temp <= 64) //if the temp is between 45 and 64
        {
            condition = "Take a Jacket";
        }
        else if (f_temp< 45) //if the temp is less than 45
        {
            condition = "Bur-rrr";
        }
        else //if the temp is basicly not a number, even if the try-catch runs when a number is NOT entered, this still does not run, something has to go VERY wrong for this to run
        {
            condition = "Error, Please try again!";
        }
        //Outputs the condition outside to user
        System.out.println("Condition = " + condition);
    }
}
/** Sample Output
Enter Cricked Chrips/Min: 20
Fahrenheit = 15.0
Celsius = -9.3
Condition = Bur-rrr

Enter Cricked Chrips/Min: 180
Fahrenheit = 55.0
Celsius = 12.8
Condition = Take a Jacket

Enter Cricked Chrips/Min: 240
Fahrenheit = 70.0
Celsius = 21.1
Condition = Ah-hhh

Enter Cricked Chrips/Min: 480
Fahrenheit = 130.0
Celsius = 54.4
Condition = Dead Cricket

 */

