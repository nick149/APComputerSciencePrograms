import java.util.*;
/**
 * Program: Prog166gRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program take the users input on how many numbers and then makes rows with multiples 

 * What I Learned: How to use input to make a program run and not run, and also use a boolean to run and not run a program/loop    
 * Difficulties: Keeping everything readable and neat in the code 
 * 
 */
public class prog166gRudd
{
   public static void main (String [] args)
   {
       //initilizes all the variables
       boolean run = true; //this tells the program to run at least one
       int number_of_rows = 0; //this will be the number that the user enters
       int counting_number=1; //displays 1-the number user enters on first line
       Scanner input = new Scanner(System.in);
       System.out.println("Multiplication Triangle");//lets the user know what they are looking at
       while (run)
       {
           
           System.out.print("Number Of Rows For This Triangle :"); //asks user for input
           number_of_rows = input.nextInt(); //takes user input
           
           if (number_of_rows==0)//if the user enters 0 it sets the program not to run and stops it
           {
               //sets program not to run anymore
               run=false;
               
               //stops loop/program
               break;
            }
            
            for (int first_row=0; first_row<=number_of_rows-1; first_row++) //prints the first row
            {
                //displays the numbers for the first row
                System.out.print(counting_number+"\t");
                
                //keeps a running number of amount that it has printed, also just counts
                counting_number++;
            }
            
            for (int number=1; number<=number_of_rows; number++) //prints all other rows
            {
                System.out.println(" "); //seperates each row from the last
                
                for (int multiple=1; multiple<=number; multiple++)//prints all the multiples
                {
                    //sets the multiple =0 each time, so it does not keep counting
                    int product=0;
                    
                    //find the product
                    product=multiple*number;
                    
                    //prints the output to user
                    System.out.print(product+"\t");
                }
            }
            
            //keeps everything neat
            System.out.println(" ");
        }
        
            
    }
}
/**
 * Sample Output
Please enter a number :7
1   2   3   4   5   6   7    
1    
2   4    
3   6   9    
4   8   12  16   
5   10  15  20  25   
6   12  18  24  30  36   
7   14  21  28  35  42  49   
Please enter a number :3
8   9   10   
1    
2   4    
3   6   9    
Please enter a number :4
11  12  13  14   
1    
2   4    
3   6   9    
4   8   12  16   
Please enter a number :0
 */