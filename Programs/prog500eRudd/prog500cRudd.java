import java.util.*;
/**
 * Program: Prog500eRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in a word, then counts how many letters that word is, then repeating it however long the length is
 * 
 * What I Learned: How to count how long a string is
 * 
 * Difficulties: None
 * 
 */
public class prog500cRudd
{
   public static void main(String [] args)
   {
       //gets ready for any keyboard input
       Scanner input = new Scanner(System.in);
       //Asks user for a word
       System.out.print("Please enter a word: ");
       //gets word from user
       String word = new String(input.nextLine());
       //tells user the word length
       System.out.println("The length of you word is " + word.length()+" characters.");
       //spacing
       System.out.println(" ");
       //loop for how long the word is
       for(int count = 0; count < word.length(); count++)
       {
           System.out.println(word);
        }
        //spacing
        System.out.println(" ");
        //lets user know why we printed what we did...
        System.out.println("So I printed " + word + " " + word.length()+ " times"); 
    }
}
/** Sample Word
Please enter a word: howdy
The length of you word is 5 characters.

howdy
howdy
howdy
howdy
howdy

So I printed howdy 5 times

_______________________________________________________

Please enter a word: Nick
The length of you word is 4 characters.
 
Nick
Nick
Nick
Nick
 
So I printed Nick 4 times

________________________________________________________

Please enter a word: Macbook
The length of you word is 7 characters.
 
Macbook
Macbook
Macbook
Macbook
Macbook
Macbook
Macbook
 
So I printed Macbook 7 times

 */