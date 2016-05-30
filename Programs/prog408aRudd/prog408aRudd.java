import java.util.*;
import java.io.*;
/**
 * Program: prog408a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7 SP1 Professional x64
 * Desciption:This program reads :  Read 25 ID numbers and scores (in that order) 
 into two separate arrays. The numbers ranked by score from high to low
 * 
 * What I Learned:How to automaticly count how many lines are in a file
 * 
 * Difficulties: Getting variables to play nice with the methods
 * 
 * 
 */
public class prog408aRudd
{
    static Scanner File = null;
    static int count = 1;
    private static void PullFromFile()
    {
        try {
            File = new Scanner(new File ("prog408a.dat"));
            //this counts how many lines are in the file
            while (File.hasNextLine()) {
                count++;
                File.nextLine();
            }
            File = new Scanner(new File ("prog408a.dat")); //sets file
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }
        
    }
    private static void getScores()
    {
        //arrays
        int [] ids = new int[count];
        int [] scores = new int[count];
        //variables
        int max = scores[0];
        int ID = 0;
        int IDScore = 0;
        int maxid = ids[0];
        //get all ids and scores
        do {
            ids [ID] = File.nextInt();
            scores [IDScore] = File.nextInt(); 
            ID++;
            IDScore++;
        } while (File.hasNextInt());
        int counter = 0;
        int index=0;
        //organize and print outputs to user
        System.out.println("ID\tScore");
        while (counter < scores.length - 1) 
        {
            for (int x = 0; x < scores.length - 1; x++) { // scroll through the indexes.
                if (scores[x] > max) {
                    max = scores[x];
                    index = x; // keep the index of the biggest number.
                } 
            }
        System.out.println(ids[index] + "\t" + scores[index]);
        max = -1 * (scores[index]);
        scores[index] = -1 * (scores[index]); // change the value in the original array so it won't find the same max again
        counter++;
       }
    
    }
    public static void main (String[]args) {
        PullFromFile();
        getScores();
    }
}
/**Sample Output
 * ID	Score
1	599
4	560
3	559
2	513
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223
/**
 */