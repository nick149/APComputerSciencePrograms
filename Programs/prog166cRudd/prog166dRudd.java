/**
 * Program: Prog162dRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program find the amount that a employer pays to 3-7 employees and 10-40 hours 
 * 
 * What I Learned: How to use nested loops 
 * Difficulties: None
 * 
 */
public class prog166dRudd
{
    public static void main (String [] args)
    {
        //  Uses a constant variable for the wage (or pay per hour), therefore if the variable ever needed to be changed it is quick and easy
        double wage = 8.00;
        
        //Starts the loop for a total of 3-7 employeees
        for (int employees = 3; employees<=7;employees++){
           
            //Seperates the output each time it runs and then displays the number of employees
            System.out.println("");
            System.out.println("Wages for "+employees+" employees");
            System.out.println("");
            
            //starts another loop for the number of hours worked
            for (int hours = 10; hours<=40; hours=hours+10){
                
                //sets the wage_total to 0, so there is no weird numbers
                int wage_total= 0;
                //calculate wages
                wage_total=(int)(wage*employees*hours);
                //displays output to the end-user
                System.out.println("For "+hours+" hours works, the wages are "+wage_total+ " dollars");
            
            }
        }
        
    }
}
/**
Sample Output

Wages for 3 employees

For 10 hours works, the wages are 240 dollars
For 20 hours works, the wages are 480 dollars
For 30 hours works, the wages are 720 dollars
For 40 hours works, the wages are 960 dollars

Wages for 4 employees

For 10 hours works, the wages are 320 dollars
For 20 hours works, the wages are 640 dollars
For 30 hours works, the wages are 960 dollars
For 40 hours works, the wages are 1280 dollars

Wages for 5 employees

For 10 hours works, the wages are 400 dollars
For 20 hours works, the wages are 800 dollars
For 30 hours works, the wages are 1200 dollars
For 40 hours works, the wages are 1600 dollars

Wages for 6 employees

For 10 hours works, the wages are 480 dollars
For 20 hours works, the wages are 960 dollars
For 30 hours works, the wages are 1440 dollars
For 40 hours works, the wages are 1920 dollars

Wages for 7 employees

For 10 hours works, the wages are 560 dollars
For 20 hours works, the wages are 1120 dollars
For 30 hours works, the wages are 1680 dollars
For 40 hours works, the wages are 2240 dollars

 */