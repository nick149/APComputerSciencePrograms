import java.util.*;
import java.io.*;
/**
 * Program: Prog512hRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in words from a file (prog512h) and then caculates the amount of words, how many three letter words there are, and 
 finally the precent in which three letter words have a chance of happening
 * 
 * What I Learned: How to crop spaces out of strings using StringTokenizer tool/function
 * 
 * Difficulties: Figuring out how to crop and count the words and getting it to recronize which words have three characters and which ones do not
 * 
 */
public class prog512hRudd
{
    public static void main (String [] args)
    {
        //starts some variables
        Scanner file = null;
        int totalwords = 0; 
        int threeCharacters=0;
        double occurrence=0;
        //pulls info from file
        try
        {
            file = new Scanner (new File("prog512h.dat"));//looks for file
        }
        catch (FileNotFoundException e) //only runs when the file is not there
        {
            System.out.println ("404 File Not Found! Please Place Prog512h.dat in the same directory as this program");
        }
        while (file.hasNext()) //when there is a next line
        {
            //takes the line from file
            String sentence = file.nextLine();
            //prints out the line
            System.out.println(sentence);
            //crops the spaces out of the sentence
            StringTokenizer crop = new StringTokenizer(sentence," "); 
            while(crop.hasMoreTokens()){ //crops to jsut the words
                String token=crop.nextToken();//takes in all the words
                if(token.length()==3) //sees if the current word is 3 characters
                {
                    threeCharacters++; //counter to see if the word is 3 characters
                }
                totalwords++;//counts how many word there are
            }
        }
        //calculates the occurrence of the three letter words
        occurrence=(double)threeCharacters/totalwords;
        //to a precent
        occurrence=occurrence*100;
        //rounding
        occurrence=Math.round(occurrence*100.0)/100.0;
        //Prints output to user 
        System.out.println("Total Words = "+totalwords);
        System.out.println("Three Letter Words = "+threeCharacters);
        System.out.println("Percentage of Occurrence = "+occurrence+"%");
    }
}
/** Sample Output
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful
Total Words = 93
Three Letter Words = 20
Percentage of Occurrence = 21.51%

 */
