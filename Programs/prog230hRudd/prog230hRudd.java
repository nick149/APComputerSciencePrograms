/**
 * Program: Prog230hRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program is designed to see what is the lowest number that can be divided by 2 with a left over of 1, divided by 3 with a left over of 2,divided by 4 with a left over of 3,divided by 5 with a left over of 4,
 * divided by 6 with a left over of 5, and divided by 7 with no left over. 
 * 
 * What I Learned: How to divide a number multiple times to see if the number meets all the requirments
 * Difficulties: Designing the program iself
 * 
 */
public class prog230hRudd
{
    public static void main(String args[])
    {
        //intializes some variables
        int number = 0;
        boolean run = true;
        
        //makes a loop that will only terminate when all the requirements are met
        while (run)
        {
            //counts up a number at each run
            number++;
            
            //a few loop to see if the number meets all the requirments
            if(number%2 == 1)
            {
                
                if(number%3 == 2)
                {
                    
                    if(number%4 == 3)
                    { 
                        
                        if (number%5 == 4)
                        {
                            
                            if (number%6 == 5)
                            {
                                
                                if(number%7 == 0)
                                {
                                    //sets the loop to not run any longer
                                    run=false;
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        //prints output to user
        System.out.println("The basket contains "+number+ " eggs");
    }
}
/**Sample Output
The basket contains 119 eggs

 */
