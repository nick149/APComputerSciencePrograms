/**
 * Program: Prog168hRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program prints a X on 21 lines, 2 X's per line for the first 10 and the last 10 lines with one X in the middle. 

 * What I Learned: How to use a while loop, using booleans,  
 * Difficulties: Designing the program (it is easy if you design on paper it will help)
 * 
 */
public class prog168hRudd
{
    public static void main (String [] args)
    {           
        //these booleans will be used to start and stop certain parts of the program later
        boolean wholeprogram = true; //we would like to let the program run
        boolean bottomhalf = false; //we set this to false becuase we do not want to print the bottom half of the X 
        
        //this controls the amount of space between X's and the side of terminal
        int spaces = 20; //this is for the first line of the X's
        int spaces2 = 20;//this is for the second lines of X's
        while(wholeprogram){ //if the whole program is set to run (true) the following code will run
            
            //sets the program to print 10 lines
            for(int runs = 0; runs<10; runs++)
            {
                
                for(int space_before = 0; space_before<20-spaces; space_before++)//prints first row of X
                {
                    System.out.print(" ");
                }
                
                System.out.print("X"); //prints the first X
                
                for(int space_after = 0; space_after<=spaces2; space_after++)//prints the second rows of S's
                {
                    System.out.print(" ");
                }
                
                System.out.println("X");//prints the second row of X's
                
                if(bottomhalf==false){//makes the top part of the X
                    spaces2 = spaces2 - 2; 
                    spaces--;
                } 
                
                if (bottomhalf){ //makes the bottom of the X
                    wholeprogram = false; //sets it so the program will not run anylonger
                    spaces++;
                    spaces2 = spaces2 + 2;
                }
            }
            
            //After the part above runs, we will be at the middle, therefore we need to double check we are still running the program and then print a X in the middle of the terminal
            if(wholeprogram){ //prints out the middle x
                //sets the loops above to print out the bottom half of the X
                bottomhalf = true; 
                
                //prints out around 10 spaces 
                for(int i = 0; i<11; i++)
                {
                    System.out.print(" ");
                }
                
                //prints out a X for the middle
                System.out.println("X");

            }
        }
    }
}
/**
 * Sample Output
X                     X
 X                   X
  X                 X
   X               X
    X             X
     X           X
      X         X
       X       X
        X     X
         X   X
           X
          X X
         X   X
        X     X
       X       X
      X         X
     X           X
    X             X
   X               X
  X                 X
 X                   X
 */




 