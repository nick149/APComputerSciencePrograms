import java.util.*;
import java.io.*;
/**
 * Program: Prog162aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes the numbers found in ini.dat and spaces them out line by 
 line, then counts how many numbers there, and then finds the sum of the numbers, and finally 
 finding the average.
 * 
 * What I Learned: How to pull information from a seperate file
 * Difficulties: Java would not find the file at first, however this was fixed by adding a IOException
 * 
 */
public class prog155tRudd
{
    public static void main (String[] args) throws IOException
    {
        Scanner file = new Scanner(new File( "ini.dat") ); //gets the information external file 
        int maxIndx =-1;
        String text[] = new String[100];
        System.out.println("Scores");
        //Puts the information from the file into a variable
        while (file.hasNext()) 
        {
            maxIndx++;
            text[maxIndx]=file.nextLine();
        
    }
    file.close();//Closes the ini.dat file
    int sum=0;//prepares to calculates the sum
    int runs=0; //prepares to calculate the number of numbers in the file
    for(int decode=0; decode <= maxIndx; decode++)
    {
        Scanner file_decode = new Scanner(text[decode]);
        while (file_decode.hasNext())
        {
            int number = file_decode.nextInt();
            System.out.println(number);//prints all the numbers seperate on different lines
            sum = sum+number;//calculates the sum
            runs= runs+1;//calculates how many numbers there are
        }
    }
    //Prints the outputs
    System.out.println("The sum of the numbers = "+sum);
    System.out.println("The number of scores = " + runs);
    double avg = sum/runs;
    System.out.println("The average of the numbers = " + avg);
}
}
/** Sample Output
Scores
3
8
1
13
18
15
7
17
1
14
0
12
3
2
5
4
The sum of the numbers = 123
The number of scores = 16
The average of the numbers = 7.0

 */