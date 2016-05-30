import java.util.Random;
/**
 * Program: prog410a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7
 * Desciption:This program calculate the number of possible combinations of thr
 * 
 * What I Learned:How to use arrays
 * 
 * Difficulties: What the last part was confusing
 * 
 */
public class prog410aRudd
{
    public static void main(String args[])
        {
        // Remember to -1 because arrays are accessed from 0 to length-1
        int[] counts = new int[18];
        // Dice 1.
        for (int k = 1; k <= 6; k++) {
            // Dice 2.
            for (int i = 1; i <= 6; i++) {
                // Dice 3.
                for (int j = 1; j <= 6; j++) {
                    // Count their sum (-1 as noted above).
                    counts[i + j + k - 1] += 1;
                }
            }
            
        }
        // Print out the array.
        System.out.println("Number\tPossible Combinations");
        for (int i = 0; i < counts.length; i++) {
            System.out.println("" + (i + 1) + "\t" + counts[i]);
        }
    }  
}
/**Sample Output
Number	Possible Combinations
1	0
2	0
3	1
4	3
5	6
6	10
7	15
8	21
9	25
10	27
11	27
12	25
13	21
14	15
15	10
16	6
17	3
18	1

 */