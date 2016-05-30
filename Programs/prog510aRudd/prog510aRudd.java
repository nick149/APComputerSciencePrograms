import java.util.*;
/**
 * Program: Prog510aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes in a name then puts *'s where the lowercase vouls (a,e,i or u) where
 * 
 * What I Learned: How to use multiple if types along with using char, along with counting strings
 * 
 * Difficulties: Using char's, some research fixed that...
 * 
 */
public class prog510aRudd
{
    public static void main(String args[])
    {
        //gets ready to get input from user        
        Scanner input = new Scanner(System.in);
        //asks user for there name
        System.out.print("Enter your name: ");
        //gets username from user
        String name = new String(input.nextLine());
        //finds length for the word(s)
        int length = name.length();
        //creates a loop for each leter in the word(s)
        for(int count = 0; count < name.length(); count ++)
        {
            char c = name.charAt(count);
            //if the letter is a,e,i,o, or u then we will need a *
            if(c == 'a'  || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            {
                //for the front of the *
                String front = name.substring(0, count);
                //for the back of the *
                String back = name.substring(count + 1);
                //sets the name = to the name with a *
                name = front + "*" + back;
            }
        }
        //prints results to user
        System.out.println(name);
  }
}
/** Sample Output
Enter your name: Molly Fisher
M*lly F*sh*r

Enter your name: Alan Alda //MASH!
Al*n Ald*

Enter your name: Mickey Mouse
M*ck*y M**s*

Enter your name: Nick
N*ck

 */
