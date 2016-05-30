
/**
 * Program: Prog215bRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program calculates the max height for a bullet for a musket calculated by h=960t - 16t^2
 * 
 * What I Learned: How to use a while statment with multiple If statements
 * Difficulties: Designing the program, and also not designing a infint loop 
 * 
 */
public class prog215bRudd
{
    public static void main (String [] args)
    {
        //declear all the variables
        boolean higher = true;
        int height=0;
        int oldheight=0;
        int oldtime=0;
        int time=0;
        
        //starts a loop to find the max hieght and the number of seconds to get there
        while(higher)
        {
            //runs the current height 
            height=960*time-16*(time*time);
            
            //if we have ran this more than once we need to figure out what we ran before this
            if (time>1)
            {
                oldtime=time-1;
                oldheight=960*oldtime-16*(oldtime*oldtime);
            }
            
            //this runs only when we have reached the max height
            if (oldheight>height)
            {
                //this sets the loop not to run again
                higher=false;
                
                //prints the output to the user
                System.out.println("The maximum height rached by the bullet is "+oldheight+" feet after "+oldtime+" seconds.");
            }
            
            //adds time to the clock, this can not be moved passed the loop (if (time>1) loop) above otherwise the answer is wrong
            time++;
            
    }
    
}
}
/** Sample Output
The maximum height rached by the bullet is 14400 feet after 31 seconds.

 */