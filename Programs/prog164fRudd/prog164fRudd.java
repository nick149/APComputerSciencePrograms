/**
 * Program: Prog164fRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program useds the For, While, and Do WHile loop to print the sqaures of numbers 1-10  

 * What I Learned: How to use all the loops 
 * Difficulties: Forgot to count up on the DO_While Loop and caused a inifit loop, this was easly fixed
 * 
 */
public class prog164fRudd
{
    public static void main (String [] args)
    {
        //the following code is for the For Loop
        System.out.println("For Loop");//lets user know that the below is a For Loop
        for(int for_loop=1; for_loop<=10; for_loop++) //begins the For Loop
        {
            //calculates the square of the current number
            int product=for_loop*for_loop;
            
            //displays the answer to the user
            System.out.print(product+" ");
        }
        
        //once the loop above stops, we print a new line so we dont have a squished answer
        System.out.println(" ");
        
        //prints on a new line to keep things seperated and neat
        System.out.println(" ");
        
        //the following is needed for the While Loop
        boolean while_loop=true;//this sets the while loop to run
        int loop_number=10;//sets the starting number to be 10, this will count down to one
        System.out.println("While Loop");//prints While Loop to let the user know that this is a WHile Loop
        
        while(while_loop)//this is the while loop
        {
            //calculates the square of the current number
            int product_while=loop_number*loop_number;
            
            //prints the answer to user
            System.out.print(product_while+" ");
            
            //counts down a number at a time
            loop_number--;
            
            if (loop_number==0)//the following code only runs when we have reached 0
            {
                while_loop=false; //sets the loop to false so we do not run any longer
            }
        }
        
        //once the loop above stops, we print a new line so we dont have a squished answer
        System.out.println(" ");
        
        //prints a new line to keep things neat
        System.out.println(" ");
        
        //the bellow code is for the Do While Loop
        System.out.println("Do While Loop"); //prints to let user know what they are looking at
        int do_while=1;//starts from 1 then works up to 10
        
        do
        {
            //calculates the square of the current number
            int product_do_while=do_while*do_while;
            
            //prints the answer to user leaving a space between each run
            System.out.print(product_do_while+" ");
            
            //goes to the next number
            do_while++;
        } while (do_while<=10); //when the number reaches 10 the loop will stop
}
}
/** Sample Output
For Loop
1 4 9 16 25 36 49 64 81 100  
 
While Loop
100 81 64 49 36 25 16 9 4 1  
 
Do While Loop
1 4 9 16 25 36 49 64 81 100 
 */
