import java.util.Scanner;
import java.io.*;
/**
 * Program: prog402a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7
 * Desciption:THis program reads 20 pairs of numbers (From file) into two separate arrays.  
Find the average score.  Print a table as shown below of the ID, score and difference (score - average)
for each student, one student per line.  
 * 
 * What I Learned:How to uses arrays, something I have been looking forward to
 * 
 * Difficulties: Getting my head around a array also made some infinate loops
 * 
 */
public class prog402aRudd
{
    static Scanner file = null;
    private static void pullfromfile()
    {
        try {
            file = new Scanner(new File("prog402a.dat"));
        } catch(FileNotFoundException e) { 
            System.out.println("Please place prog402a.dat in the same directory as the program, the rest of the program should be null");
        }
    }
    private static void functions()
    {
         //Arrays that hold input from other file
        int[] id = new int[20];
        int[] score = new int[20];
        double[]difference= new double[20];
        
        //Variables 
        int idCount = 0;
        int scoreCount = 0;
        int sum = 0;
        double avg=0;
        boolean output=true;
        //first loop to put everything in the right array
        for(int i = 0; i < id.length ; i++) {
            int x = file.nextInt();
            id[idCount] = x;
            int y = file.nextInt();
            score[scoreCount] = y;
            idCount++;
            scoreCount++;
        }
        //assign the value for the sum of scores
        for(int i = 0; i < id.length; i++) 
        {
            sum += score[i]; 
        }
        avg = ((double) sum / (id.length )); 
        //first part of the output
        System.out.println("Sum = " + sum);
        //the %.2f is for decimal for the avg
        System.out.printf("Average = %.2f\n", avg);
        System.out.println("Count = " + id.length);
        //assign the values of the difference array
        for(int i = 0; i < id.length  ; i++) 
        {
           difference[i] = (score[i] - avg);
        }
        //lets user know what they are looking at
        System.out.println( "Id\tScore\tDiff");
        int z = 0;
        //final output
        while(file.hasNext()) {
            System.out.print(id[z] + "\t");
            System.out.print(score[z] + "\t");
            System.out.printf("%.2f\n",difference[z]);
            z++;
            if(z == id.length) 
            {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        pullfromfile();
        functions();
    }
}
/**Sample Output
Sum = 4853
Average = 242.65
Count = 20
Id	Score	Diff
115	257	14.35
123	253	10.35
116	246	3.35
113	243	0.35
112	239	-3.65
104	239	-3.65
110	238	-4.65
218	243	0.35
208	242	-0.65
222	223	-19.65
223	230	-12.65
213	229	-13.65
207	228	-14.65
203	224	-18.65
305	265	22.35
306	262	19.35
311	256	13.35
325	246	3.35
321	245	2.35
323	245	2.35

 */