import java.util.*;
import java.io.*;
/**
 * Program: Prog505cRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in words from the Prog505c.dat file, then compares those words (animals) to 
 see if they are between Dinosaur and Walrus in the alphabet, if not it will state not between, if so it will 
 state between
 * 
 * What I Learned: How to use the compareTo feature for words
 * 
 * Difficulties: Spacing is not perfect, but is there
 * 
 */
public class prog505cRudd
{
    public static void main (String args[]) 
    {
        //starts some varaibles 
        Scanner file = null; //has to be here otherwise wont compile due to not initulized error
        String animal = null; //same here
        //if we wanted to, we can easily change the words
        String word1 = "Dinosaur";
        String word2 = "Walrus";
        //sees if the file is there
        try
        {
            file = new Scanner (new File("Prog505c.dat"));
        }
        catch (FileNotFoundException e) //only runs when the file is not there
        {
            System.out.println ("404 File Not Found! Please Place Prog505c.dat in the same directory as this program");
        }
        //sees if we have another line, if so we continue
        while(file.hasNextLine())
        {
            //sets the animal = to the current animal that we are testing
            animal = file.nextLine();
            //some ints to compare where the word is at
            int word11 = word1.compareTo(animal);
            int word22 = word2.compareTo(animal);
            //prints out the current animal
            System.out.print(animal);
            //tests if the word is between word 1 or word 2
            if ((word11<=0 && !(word22<=0)) | (word22<=0 && !(word11<=0))) 
            {
                System.out.print("\tBetween");
            }
            //if not, this will run
            else if ((!(word11<=0) && !(word22<=0)) | (word11<=0 && word22<=0))
            {
                System.out.print("\tNot Between");
            }
            else //when all of the above is not true
            {
                System.out.print("Error");
            }
            //spacing
            System.out.println(" ");
        }
    }
}
/** Sample Output
Vampire	Between 
Monkay	Between 
Elephant	Between 
Ape	Not Between 
Lion	Between 
Hippopotamus	Between 
Ant	Not Between 
Zebra	Not Between 
Yak	Not Between 
Antelope	Not Between 
Dingo	Not Between 
Whale	Not Between 
Dog	Between 
Tiger	Between 
Snake	Between 
Snale	Between 
Cat	Not Between 

 */
