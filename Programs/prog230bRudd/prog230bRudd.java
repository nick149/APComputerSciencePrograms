
/**
 * Program: Prog230bRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program displays numbers 1-25 with the thoery that if a number is odd (multiply it by 3 and then add 1) you should go back to one in time
 or if the number is even just divide it by 2. 
 * 
 * What I Learned: How to if statements before and in a loop
 * 
 * Difficulties: If i where to use number++ then it would not add one, so after I multiple by 3 I just add one.
 */
public class prog230bRudd
{
   public static void main (String args [])
   {
       //starts a loop for numbers 1 through 25
       for(int num =1; num<=25; num++)
       {
           //sets the current number to one we can work with
           int number = num;
           //lets user know what number we are on
           System.out.print(number+": ");
           
           //if the number is 1 at the current point (so at first)then run the script below
           if (number==1)
           {
               //this multiples the current number by three and then adds one
               number= number*3+1;
               //prints output to user
               System.out.print(" "+number);
            }
           while(number>1)
           {
               if(number%2==0)
               {
                   //this divides the current number by 2 and then outputs to user
                   number= number /2;
                   System.out.print(" "+number);
                }
                else
                {
                    //this multiples the number by 3 and then adds one
                    number = number*3+1;
                    System.out.print(" "+number);
                }
                
            }
            //gets ready for a new line
            System.out.println(" ");
        }
    }    
}
/** Sample Output
1:  4 2 1 
2:  1 
3:  10 5 16 8 4 2 1 
4:  2 1 
5:  16 8 4 2 1 
6:  3 10 5 16 8 4 2 1 
7:  22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
8:  4 2 1 
9:  28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
10:  5 16 8 4 2 1 
11:  34 17 52 26 13 40 20 10 5 16 8 4 2 1 
12:  6 3 10 5 16 8 4 2 1 
13:  40 20 10 5 16 8 4 2 1 
14:  7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
15:  46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
16:  8 4 2 1 
17:  52 26 13 40 20 10 5 16 8 4 2 1 
18:  9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
19:  58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
20:  10 5 16 8 4 2 1 
21:  64 32 16 8 4 2 1 
22:  11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
23:  70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
24:  12 6 3 10 5 16 8 4 2 1 
25:  76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 

 */