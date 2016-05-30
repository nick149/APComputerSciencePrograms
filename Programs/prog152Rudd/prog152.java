/**
 * Program: Prog152a
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program runs 9669 times, calculates the sum of all the multiples between 3-9669 and then displays the total.

 * What I Learned: How to keep a running total when using a loop
 * Difficulties: Figuring out that the variable must be started before the loop, adds the variable in the loop, and then prints it out after the loop
 * 
 */
public class prog152
{
       public static void main (String[] args)
    {
        int sumruns = 0;//sets the sum equal to zero, later the program will add to this later
        for (int runs=0; runs <=9669; runs=runs+3){ //sets up a loop
            sumruns+=runs;//Adds the multiple to the running sum
    }
    System.out.println("The sum of the all multiples of 3, between 3 and 9669 is "+ sumruns); //displays output
}
}
/**
The sum of the all multiples of 3, between 3 and 9669 is 15586428

 */