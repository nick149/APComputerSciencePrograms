import java.io.*;  
import java.util.*;
/**
 * Program: Prog213aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: THis program take 7 numbers from a file in which takes and gets the full pay of that persons for that week
 * 
 * What I Learned: How to use try catch and also how to use while, for and if then else in a very complex program 
 in which can have many bugs. 
 * 
 * Difficulties: The program does not match the sampleoutput for the program, however many are close. 
 * 
 * 
 */
public class prog213aRudd
{
    public static void main (String [] args)
    {
        //starts some variables that will be changed later
        Scanner file = null;
        int totalhours=0;
        int hours=0;
        int numberhours=0;
        double money = 0;
        int weeknumber = 0;
        try //trys to see if the file is there
        {
            file = new Scanner (new File ("Prog213a.dat"));
        }
        catch (FileNotFoundException e) //if not it will print a error
        {
            System.out.println("404 File Not Found! Please Place Prog213a.dat in the same directory of the current program");
        }
        //takes in the number in the next line
        while (file.hasNextLine())
        {
            //lets the user know what they are looking at
            System.out.print("Hours Works: ");
            //reset variables each run
            money = 0;
            numberhours=0;
            totalhours = 0;
            //creates a to take in 6 numbers
            for(int runs=0; runs <=6; runs++)
            {
                hours = file.nextInt();
            
                numberhours++;
                totalhours = totalhours + hours;
                if(numberhours<8)
                {
                    System.out.print(hours+" ");
                }
                //Saterday Under or equal to 8
                if(numberhours == 6 && hours > 0 && hours <= 8) 
                {
                    money = money+((hours*30)* 1.25);
                }
                //Saterday over 8
                else if (numberhours == 6 && hours > 8)
                {//we get 55.5 from 30+25.5
                    money = money + (240 + ((hours-8)*(55.50)))*1.25;
                }
                //Sunday under 8
                else if (numberhours == 7 && hours > 0 && hours <= 8)
                {
                    money = money+((hours*30)* 1.5);
                }
                //Sunday over 8
                 else if (numberhours == 7 && hours > 8)
                {
                    money = money + (240 + ((hours-8)*(55.50)))* 1.5;
                }
                //Anyother Day of the Week over 8
                else if (hours>8 && !(numberhours==7) && !(numberhours==6))
                {
                    money = money + 240 + ((hours-8)*(55.50));
                }
                //ANyother Day of the Week under or equal to 8
                else if (hours<=8 && !(numberhours==7) && !(numberhours==6))
                {
                    money= (hours*30)+money;
                }
                //If any hours = 0 then we want it not to go to else which would give a error, 
                //however we dont have to do anything
                else if (hours==0){}
                else //If something is wrong we will get a nice error
                {
                    System.out.println("error");
                }
            }
            //this see if the number of hours worked for that week is over 40 and that it is checking on the 7th day
            if(totalhours>40 && numberhours == 7)
            {
                //calculates the amount of hours that the employee worked over 40
                int over40 = totalhours - 40;
                //adds the total about of money
                money = money + (over40*15);
            }
            //counts week number
            weeknumber++;
            //Prints output to user
            System.out.println(" ");
            System.out.println("Week #"+weeknumber+ ":   $"+money);
            System.out.println(" ");
        }
    }
}
/** SampleOput
Hours Works: 9 8 10 8 9 9 5  
Week #1:   $2286.375
 
Hours Works: 7 8 8 8 0 8 9  
Week #2:   $1793.25
 
Hours Works: 6 10 5 0 0 0 0  
Week #3:   $681.0
 
Hours Works: 7 20 6 8 8 9 0  
Week #4:   $2415.375

 */