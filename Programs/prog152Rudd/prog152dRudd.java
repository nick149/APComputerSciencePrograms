import java.util.*;
/**
 * Program: Prog152dRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes a starting and ending value and then calculates the sum and the average of those numbers

 * What I Learned: How to use other variables to start and end the for while loop
 * Difficulties: Getting the rounding correcy
 * 
 */
public class prog152dRudd
{
   public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Starting Value : ");
        int startingval = input.nextInt();
        System.out.print("Enter Ending Value : ");
        int endval = input.nextInt();
        int sum=0;
        for (int runs=startingval;runs<=endval;runs=runs+1){
            System.out.println(runs);
            sum=sum+runs;
        }
        System.out.println("Sum of the numbers " + startingval + "..." +endval + " is "+sum); 
        int difference =endval-startingval;
        double avg = (double)sum/difference;
        avg=(int)(avg*100.0+.5)/100.0;
        System.out.println("The average of the numbers " + startingval +"..."+endval+" is "+avg);
    }
}
/**Sample Output
Enter Starting Value : 5
Enter Ending Value : 8
5
6
7
8
Sum of the numbers 5...8 is 26
The average of the numbers 5...8 is 8.67
--------------------------------------------------
Enter Starting Value : 1
Enter Ending Value : 20
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
Sum of the numbers 1...20 is 210
The average of the numbers 1...20 is 11.05
--------------------------------------------------
Enter Starting Value : 7
Enter Ending Value : 26
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
Sum of the numbers 7...26 is 330
The average of the numbers 7...26 is 17.37
--------------------------------------------------
Enter Starting Value : 2
Enter Ending Value : 3
2
3
Sum of the numbers 2...3 is 5
The average of the numbers 2...3 is 5.0
--------------------------------------------------
Enter Starting Value : 3
Enter Ending Value : 9
3
4
5
6
7
8
9
Sum of the numbers 3...9 is 42
The average of the numbers 3...9 is 7.0

 */