import java.io.*;
import java.util.*;
/**
 * Program: prog412a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7
 * Desciption:This program sees how many people make what salaries a year
 * 
 * What I Learned:How to use printf, and how to create a range
 * 
 * Difficulties: Figuring out a easy way to print all the results
 * 
 */
public class prog412aRudd
{
           public static void main(String[] args) throws Exception
           {
               Scanner file = null;
               int length = 0;
               try {
                   file = new Scanner (new File("prog412a.dat"));
                   while(file.hasNextLine())//looks to see how many items are in the file
                   {
                       length++;
                       int temp = file.nextInt();
                    }
                    file = new Scanner (new File("prog412a.dat"));
                } catch(FileNotFoundException e) { 
                        System.out.println("Please place prog412a.dat in the same directory as the program, the rest of the program should be null");
                        System.exit(0);
                }
                int total[] = new int[length-1];//array
               for(int loop=0;loop<=length-1;loop++)
               {
                   double salary = file.nextInt() *0.09+200;//calculates salery
                   int range = (int) (salary / 100);
                   if (range > 10){
                       range = 10;
                   }
                   ++total[range - 2];//keeps a running total
               }
               System.out.println("Range\t\tNumber");
               for (int range = 0; range < total.length - 10; range++)
               {
                   System.out.printf("$%d-$%d\t%d\n", (200 + 100 * range),(299 + 100 * range), total[range]);//prints each range
               }
        }
}
/**Sample Output
Range		Number
$200-$299	5
$300-$399	2
$400-$499	2
$500-$599	1
$600-$699	3
$700-$799	1
$800-$899	2
$900-$999	1
$1000 and over	3

 */