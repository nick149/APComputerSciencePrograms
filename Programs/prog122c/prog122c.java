/**
 * Program: Prog122c
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program runs 50 times, and displays the run number (which is always even), the run number plus 1, the run number times 2, the run number squared

 * What I Learned: How to make the run number every other time
 * Difficulties: None
 * 
 */
public class prog122c
{
    public static void main (String[] args)
    {
        for (int runs=0; runs <=50; runs=runs+2){ //sets up a loop
            System.out.println(runs+"   "+(runs+1)+"    "+(runs*2)+"    "+(runs*runs));//displays results of the equations
    }
}
}
/**
0   1    0    0
2   3    4    4
4   5    8    16
6   7    12    36
8   9    16    64
10   11    20    100
12   13    24    144
14   15    28    196
16   17    32    256
18   19    36    324
20   21    40    400
22   23    44    484
24   25    48    576
26   27    52    676
28   29    56    784
30   31    60    900
32   33    64    1024
34   35    68    1156
36   37    72    1296
38   39    76    1444
40   41    80    1600
42   43    84    1764
44   45    88    1936
46   47    92    2116
48   49    96    2304
50   51    100    2500
 */