import java.io.*;
import java.util.*;
/**
 * Program: Calculations for prog410a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7
 * Desciption:This program is used for prog410aRudd
 */ 
public class Calculations
{
   public static void load(SurveyTaker surveys)throws Exception {
      Scanner fileIn = null;
      try {
        fileIn = new Scanner(new File("survey2.dat"));
        while (fileIn.hasNextLine()) {
          String line = fileIn.nextLine();
          surveys.setSurvey(line);
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      } 
  }

  public static void printHouseholdIncomeExceedingAverage(SurveyTaker surveys) {
    int size = surveys.getNumberOfHousehold();
    double average = surveys.getAverageIncome();
    String message = "Households with income exceeding an average income of %,.2f%n";
    System.out.printf(message, average);
    System.out.println("Id   Income Member");
    for (int i = 0; i < size; i++) {
      if (surveys.getIncomeByIdx(i) > average) {
        System.out.println(surveys.formattedString(i));
      }
    }
  }

  /**
   * design for debug
   * @param surveys
   */
  private static void print(SurveyTaker surveys) {
    int size = surveys.getNumberOfHousehold();
    System.out.println();
    for (int i = 0; i < size; i++) {
      System.out.println(surveys.formattedString(i));
    }
  }

  public static void printHouseholdIncomeBelowPoverty(SurveyTaker surveys) {
    int size = surveys.getNumberOfHousehold();
    int count = 0;
    System.out.println();
    for (int i = 0; i < size; i++) {
      if (surveys.isInPoverty(i)) {
        System.out.println(surveys.formattedString(i));
        count++;
      }
    }
    String message = "Percent of households below poverty level = %f%n";
    System.out.printf(message, ((double) count / (double) size));
  }
}
