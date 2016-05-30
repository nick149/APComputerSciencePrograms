import java.io.*;
import java.util.Scanner;
/**
 * Program: prog410a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7
 * Desciption:This program sees how many people are above or below the poverty line
 * 
 * What I Learned:How to use printf, this(which talks just above the specific method,and how to pass arrays from class to class
 * 
 * Difficulties: The survey taker class
 * 
 */
public class prog410tRudd
{
    public static void main(String[] args) throws Exception
    {
        Scanner file = new Scanner(new File("survey2.dat"));
        SurveyTaker surveys = new SurveyTaker();
        Calculations calculations = new Calculations();
        calculations.load(surveys);
        calculations.printHouseholdIncomeExceedingAverage(surveys);
        calculations.printHouseholdIncomeBelowPoverty(surveys);
    }
}