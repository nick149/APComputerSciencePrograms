
/**
 * Program: Prog209bRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program tests the theory that a 10 is easier to get with three dice than a 9
 * 
 * What I Learned: How to use three loops to disprove theory's
 * Difficulties: None
 * 
 */
public class prog209bRudd
{
    public static void main(String args[])
    {
        //initualize the variables
        int sum9=0;
        int sum10=0;
        
        //start the loop for the first dice
        for (int firstdice =0; firstdice<=5; firstdice++)
        {
            
            //start the loop for the second dice
            for(int seconddice=0; seconddice<=5; seconddice++)
            {
                
                //start the loop for the third dice
                for(int thirddice=0; thirddice<=5; thirddice++)
                {
                    //set the sum = 0 at each run
                    int sum = 0;
                    
                    //adds up the numbers 
                    sum= firstdice+seconddice+thirddice;
                    
                    //when the sum is equal to 9 then this will create a counter 
                    if(sum ==9)
                    {
                        sum9++;
                    }
                    
                    //when the sum is equal to 10 then this will create a counter 
                    if(sum == 10)
                    {
                        sum10++;
                    }
                    
                }
            }
        }
        
        //prints out the output to the user
        System.out.println("There are "+sum9+" possible ways to get nine");
        System.out.println(" "); //spacing
        System.out.println("There are "+sum10+" possible ways to get ten");
        System.out.println(" "); //spacing
        
        if(sum10>sum9)//this will only run if the sum of 10 is more than 9
        {
            System.out.println("Proven");
        }
        else//this will run when the statement above doees not
        {
            System.out.println("Disproven, Sorry!");
    }
}
}
/** Sample Output
There are 25 possible ways to get nine
 
There are 21 possible ways to get ten

Disproven, Sorry!

 */