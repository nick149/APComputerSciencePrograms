/**
 * Program: Prog230aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program lists all the divisable numbers between 1 and 100 that are dividable by 3 or 7
 * 
 * What I Learned:How to divide with if statements to see if a number is dividable by a number
 * Difficulties: None
 * 
 */
public class prog230aRudd
{
    public static void main (String args[])
    {
        //starts a loop that counts up to 100
        for(int number =1; number <=100; number++)
        {
            //sees if the number is dividable by 3
            if (number%3 ==0)
            {
                //prints the number to user
                System.out.println(number);
            }
            
            //sees if the number is dividable by 7
            if(number%7==0)
            {
                System.out.println(number);
            }
        }
    }
}
/**Sample Output
3
6
7
9
12
14
15
18
21
21
24
27
28
30
33
35
36
39
42
42
45
48
49
51
54
56
57
60
63
63
66
69
70
72
75
77
78
81
84
84
87
90
91
93
96
98
99

 */
