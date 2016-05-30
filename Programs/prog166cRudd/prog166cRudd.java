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
public class prog166cRudd
{
    public static void main (String [] args)
    {  
        //these booleans will be used to start and stop certain parts of the program later
        boolean wholeprogram = true; //we would like to let the program run
        
        //this controls the amount of space between X's and the side of terminal
        int spaces = 10; //this is for the first line of the X's
        int numberstars=1;
        while(wholeprogram){ //if the whole program is set to run (true) the following code will run
            
            for(int runs = 0; runs<6; runs++)
            {
                for(int space_before = 0; space_before<20-spaces; space_before++)//prints first row of X
                {
                    System.out.print(" ");
                }
                for(int stars = 1; stars<=numberstars; stars=stars+1)
                {
                System.out.print("*"); //prints the first X
            }
            spaces++;
            numberstars=numberstars+1;
            System.out.println(" ");
                }
                wholeprogram = false;
            }
            
            //After the part above runs, we will be at the middle, therefore we need to double check we are still running the program and then print a X in the middle of the terminal
            /**if(wholeprogram){ //prints out the middle x
                //sets the loops above to print out the bottom half of the X

                
                //prints out around 10 spaces 
                for(int i = 0; i<11; i++)
                {
                    System.out.print(" ");
                }
                
                //prints out a X for the middle
                System.out.println("X");

            }*/
        }
    }

        /**boolean program = true;
        int spaces=10;
        int stares=1;
        int runs = 0;
        while (program)
        {
            
            for(int space=spaces; space>=0; space=space-2)
                {
                    System.out.print(" ");
                    
                }
                for(int stars=1; stars<=stares; stars=stars+2)
            {
                System.out.print("*");
            }
            stares=stares+2;
            runs=runs+1;
            System.out.println(" ");
            if (runs>=6)
            {
                program = false;
            }
            
        }
    }
}*/
