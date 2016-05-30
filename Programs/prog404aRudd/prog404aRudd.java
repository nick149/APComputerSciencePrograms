import java.util.*;
import java.io.*;

/**
 * Program: prog404a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7 SP1 Professional x64
 * Desciption:This program reads a list of numbers from an external file then places the positive 
 numbers into an array PosNumbers  and the negative numbers into a array NegNumbers.   Display the numbers
 in both PosNumbers and NegNumbers in table form.
 * 
 * What I Learned:How to read two files at once and use arrays
 * 
 * Difficulties: Ordering numbers
 * 
 * WARNING: Program will not work correctly if arrays are over 500
 * 
 */
public class prog404aRudd
{
    static Scanner input = null;
    static Scanner input2 = null;
    private static void pullFromFile()
    {
        try{
            input=new Scanner (new File ("prog404a1.dat"));
            input2=new Scanner (new File ("prog404a2.dat"));
           }catch(FileNotFoundException e)
           {
               System.out.println("404, File Not Found, please place prog404a1.dat and \nprog404a2.dat in the same directory as the program");
           }
    }private static void PositiveNegative()
    {
        int IndxPos = 0;//index of pos or neg num
        int IndxNeg = 0;
        int Indx1=0;
        int Indx2=0;
        //arrays
        int PosNum1[] = new int[500];
        int NegNum1[] = new int[500];
        int PosNum2[] = new int[500];
        int NegNum2[] = new int[500];
        while (input.hasNext())//first file
        {
           int tempNum=input.nextInt();//temp number 
           if (tempNum < 0) {//if negative
               NegNum1[IndxNeg] = tempNum;
               IndxNeg++;//numuber of negative numbers
           } else {//if postive
               PosNum1[IndxPos] = tempNum;
               IndxPos++;//numuber of postive numbers
           }
           Indx1++;//counter
        }
        //resets the number of negative and postive numbers
        IndxPos = 0;
        IndxNeg = 0;
        while (input2.hasNext())//second file
        {
            int tempNum=input2.nextInt();//temp number 
            if (tempNum < 0) {//if negative
                NegNum2[IndxNeg] = tempNum;
                IndxNeg++;
            } else {//if postive
                PosNum2[IndxPos] =tempNum;
                IndxPos++;
            }
            Indx2++;//counter
        }
        
        System.out.println("    Positive\tNegative");//prints the first set of data
        for(int x=0;x<Indx1/2;x++)
        {
            System.out.println("\t"+PosNum1[x]+"\t"+NegNum1[x]);
        }
        
        System.out.println("\n\n\n\n    Positive    Negative");//prints second set of data
        for(int x=0;x<Indx1/2;x++)
        {
            System.out.println("\t"+PosNum2[x]+"\t"+NegNum2[x]);
        }
 
    }public static void main(String[] args) {
        pullFromFile();
        PositiveNegative(); 
    }
}
/**Sample Output
Positive    Negative
3            -8
66            -16
54            -56
22            -34
19            -22
21            -55
34            -3
64            -55
55            -76
9            -45
39            0




Positive    Negative
8            -3
10            -66
56            -54
34            -22
22            -19
55            -21
3            -34
55            -64
76            -55
45            -9
0            -89

 */