import java.util.*;
/**
 * Program: Prog214aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: THis program sees how many steps it will take to reach the end of the bridge, this does this 
by a random number generator, and will do this 1000 times to test and recieve a average and will do that 20 times to recive 20 averages.
 * 
 * What I Learned:How to a for loop, a for loop inside that, a while loop inside that (also how to use something other than a boolean for a while)
 and a if loop inside that, in other words alot of loops.
 
 * Difficulties: THis program had a unknown ouput, however this changes in every run becuase it is random!
 */
public class prog214aRudd
{
   public static void main (String [] args)
   {
       //intualize variables 
       int runs = 20;
       int test = 1000;
       int bridge_lenght=7;
       //these variables will be used and reset later, no need to give them a value yet
       double average;
       int max;
       int steps;
       
       //this will produce a random number when called
       Random random = new Random();
       System.out.println("Run   Average    Greatest Number Of Steps");
       for (int run =1; run <=runs; run++)
       {
           //resets the average and the max each run
           average =0;
           max = 0;
           for (int iterations = 1; iterations<= runs; iterations++)
           {
               //reset the steps and startpoint every run of loop
               steps = 0;
               double start_point = bridge_lenght /2; 
               while (start_point > 0 && start_point<7)
               {
                   //produces a number between 0 and 1 
                   if (random.nextInt(2) ==1)
                   {
                       //this only runs when the number is 1
                       start_point++;
                    }
                    else
                    {
                        //this only runs when the number is not 1, so in this case 0
                        start_point--;
                    }
                    //counts how many steps there is
                    steps++;
                }
                average = average + steps;
                if (max < steps)
                {
                    //this only runs when the max is reached
                    max = steps;
                }
            }
            //finds the average
            average = average / runs;
            //keeps it neat
            average = (int)(average*100.0+.5)/100.0;
            //prints output to user
            System.out.println("#"+ run+":  " + average+ "    " + max);
        }
    }
}
/**Sample Output
Run   Average    Greatest Number Of Steps
#1:  11.2    33
#2:  14.15    43
#3:  12.3    38
#4:  13.65    46
#5:  10.55    27
#6:  14.1    41
#7:  11.25    35
#8:  12.9    51
#9:  8.95    30
#10:  8.65    29
#11:  7.3    16
#12:  10.15    25
#13:  15.45    65
#14:  11.2    35
#15:  9.4    29
#16:  12.85    45
#17:  15.0    48
#18:  14.45    51
#19:  12.15    31
#20:  15.15    45

 */

