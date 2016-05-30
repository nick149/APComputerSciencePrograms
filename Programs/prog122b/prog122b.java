/**
 * Program: Prog122b
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program runs 40 times, and calculates the number of runs times 4, which is the pay 

 * What I Learned: How to use the same loop variables to calculate more numbers in the same loop
 * Difficulties: Lining the numbers up with "Hours Pay"
 * 
 */
public class prog122b
{
    public static void main (String[] args)
    {
        System.out.println("Hours   Pay"); //displays to let the user know what they are looking at 
        for (int runs=1; runs <=40; runs++){ //sets up a loop
            int pay=runs*4;//calculates pay
            System.out.println(runs+"      "+pay);//displays output
    }
}
}
/**
Hours   Pay
1      4
2      8
3      12
4      16
5      20
6      24
7      28
8      32
9      36
10      40
11      44
12      48
13      52
14      56
15      60
16      64
17      68
18      72
19      76
20      80
21      84
22      88
23      92
24      96
25      100
26      104
27      108
28      112
29      116
30      120
31      124
32      128
33      132
34      136
35      140
36      144
37      148
38      152
39      156
40      160
 */