import java.util.*;
/**
 * Program: Prog52d
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program take the players name, number of times at bat, the number of hits, and walks to calculate that players average and on-base average

 * What I Learned: How to make the use scanners(or to get users input)
 * Difficulties: Getting the averages right
 * 
 */
public class prog52d
{
    public static void main (String[] args)
    {
        System.out.println("Enter Players Name: ");//asks for players name
        Scanner input = new Scanner(System.in);//sets up scanner (or users input)
        String playername = input.next(); //takes users input for players name
        System.out.println("Enter Number Of Times at bat: ");//asks user for number of times at bat
        int times_at_bat = input.nextInt();//takes users input for the number of times at bat
        System.out.println("Enter Number of Hits: "); //ask user for number of hits
        int number_of_hits = input.nextInt();//takes users input of the number of hits
        System.out.println("Enter Number of Walks: ");//asks for users number of walks
        int number_of_walks = input.nextInt();//takes user input for number walks
        double average_number1=number_of_walks+number_of_hits; //begins calculating on base average
        double on_base_average = average_number1/times_at_bat; //finishs calculating on base average
        double average_2=times_at_bat-number_of_walks; //begins calculating the average
        double average = number_of_hits/average_2; //finishs calculating the average
        //below is some rounding 
        on_base_average=(int)(on_base_average*100.0+.5)/100.0; 
        average=(int)(average*100.0+.5)/100.0;
        System.out.println();
        //displays output to user
        System.out.println("Player "+playername+" has a batting average of "+average+" and an On Base Percentage of "+on_base_average);
    }
}
/**
Enter Players Name: 
nick
Enter Number Of Times at bat: 
4
Enter Number of Hits: 
2
Enter Number of Walks: 
1

Player nick has a batting average of 0.67 and an On Base Percentage of 0.75

 */