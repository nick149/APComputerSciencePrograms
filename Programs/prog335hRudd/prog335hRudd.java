import java.util.*;
/**
 * Program: Prog335Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in P and Q and then outputs value
 * 
 * What I Learned: How to use multiple if and else if statements
 * 
 * Difficulties: None
 */
public class prog335hRudd
{
   public static void main (String [] args)
   {
       int P=0;
       int Q=0;
       int value=0;
       Scanner input = new Scanner (System.in);
       try 
       {
           System.out.print("Enter P:   ");
           P = input.nextInt();
           System.out.print("Enter Q:   ");
           Q = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        if (P%2==0 && Q%2==1)
        {
            value = 2*P + Q;
        }
        else if (P%2==1 && Q%2==0)
        {
            value = P + 2*Q;
        }
        else if (P%2==0 && Q%2==0 && !(P==Q))
        {
            value = P + Q;
        }
        else if (P%2==0 && Q%2==0 && (P==Q))
        {
            value = 3*P;
        }
        else if (P%2==1 && Q%2==1 && !(P==Q))
        {
            value = P + Q;
        }
        else if (P%2==1 && Q%2==1 && (P==Q))
        {
            value = 3*Q;
        }
        else
        { 
            System.out.println("error");
        }
        System.out.println ("Value = "+value);
    }
}
/** Sample Output
Enter P:   6
Enter Q:   2
Value = 8

Enter P:   2
Enter Q:   5
Value = 9

Enter P:   1
Enter Q:   3
Value = 4

 */
