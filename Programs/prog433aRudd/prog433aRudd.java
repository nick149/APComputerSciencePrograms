import java.util.*;
/**
 * Program: prog433a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 Professional x64
 * Desciption:This program produces 20 random numbers between 1-30 and non repeative
 * 
 * What I Learned:How to uses HashSet(found it online), and arrays
 * 
 * Difficulties: Figuring out what i need to use
 * 
 * 
 */
public class prog433aRudd
{
    public static void main(String args[])     
    {
        Random rand = new Random();
        int[] list = new int[20];
        HashSet<Integer> used = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            int add = (int)(Math.random() * 30); //this is the int we are adding
            while (used.contains(add)) { //while we have already used the number
                add = (int) (Math.random() * 30); //generate a new one because it's already used
            }
            //by this time, add will be unique
            used.add(add);
            list[i] = add;
            System.out.println(add);
        }
        
    }
}
/** Sample Output
17
4
25
9
24
1
11
23
12
3
29
5
28
6
21
19
18
10
7
27

25
8
2
15
13
3
18
28
10
14
23
11
9
6
0
22
12
7
21
19

15
2
16
25
4
27
12
17
28
6
18
21
24
20
7
9
11
13
8
23

 */


