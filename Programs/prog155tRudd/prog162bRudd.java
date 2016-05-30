import java.util.*;
/**
 * Program: Prog162bRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.6/ Linux (Ubuntu MATE 14.04)
 * Desciption: THis program takes the users growth rate, and from the year 2010
calculates the population and stops when it detects it has doubled since the orginal amount  

 * What I Learned: How to use if statements 
 * Difficulties: None
 * 
 */
public class prog162bRudd
{
    public static void main(String[]  args) {
        Scanner input = new Scanner(System.in);//gets ready to take users input for later
        //initializes variables
        double population;
        int year=2010;
        System.out.print("Please enter the growth rate(without %): ");//asks user for growth rate
        double rate = input.nextDouble();//gets users input (growth rate)
        System.out.println(" ");//space to make things neat
        System.out.println("-----Growth Rate "+rate+"% annually-----"); //lets user know exactly what they are looking at
        System.out.println("Year    Population(in millions)");//gives user some insite on what we are calculating
        rate = rate/100.0;//converts that rate to a decimal
        for(population = 236; population <= (236 * 2);){//starts a loop, 236 is the begining population
            population += (population * rate);//calculats the population for the year it is calculating
            year += 1;//adds a year everytime the program is run
            population = (int)(population*100.0+.5)/100.0;//makes sure that the population percent does not go past the 100th place
            System.out.println(year+ "     "+population);//displays year and expected population
            if (population >= 236 * 2) {//starts a if statement, for when the population is doubled
                System.out.print("The population will double by year " + year);//tells user population is double
            }
        }
    }
}
/**Sample Output
Please enter the growth rate(without %): 6.9
 
-----Growth Rate 6.9% annually-----
Year    Population(in millions)
2011     252.28
2012     269.69
2013     288.3
2014     308.19
2015     329.46
2016     352.19
2017     376.49
2018     402.47
2019     430.24
2020     459.93
2021     491.67
The population will double by year 2021
 */