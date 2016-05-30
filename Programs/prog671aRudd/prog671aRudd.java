import java.util.*;
/**
 * Program: Prog671a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Mac OS X 10.11.2
 * Desciption: This program is seperated in different methodes to calculate elapsed time, hours to minutes, days to hours, and vise versa
 * 
 * What I Learned: How to make several objects in a program that drive the program from those different parts
 * 
 * Difficulties: A little tricky how I would make the menu however was easier than thought
 * 
 */
public class prog671aRudd
{
    public static void hoursToMinutes()//converts from hours to minuts
    {
        Scanner input = new Scanner (System.in);//gets ready for input
        System.out.print("Enter hour(s): ");//asks for hours
        int hours = input.nextInt();//gets hours
        System.out.println(hours + " * 60 = " + (hours * 60) + " minutes.");//formula for hours to minuts
        System.out.println("");//spacing
    }
    public static void daysToHours()
    {
        Scanner input = new Scanner (System.in);//gets ready for input
        System.out.print("Enter day(s): ");//asks for hours
        int days = input.nextInt();//takes in hours
        System.out.println(days + " * 24 = " + (days * 24) + " hours.");
        System.out.println("");//spacing
    }
    public static void minutesToHours()
    {
        Scanner input = new Scanner (System.in);//gets ready for input
        System.out.print("Enter minute(s): ");
        int minutes = input.nextInt();
        System.out.println(minutes + " / 60 = " + ((double)minutes / 60) + " hours.");
        System.out.println("");
    }
    public static void hoursToDays()
    {
        Scanner input = new Scanner (System.in);//gets ready for input
        System.out.print("Enter hour(s): ");
        int hours = input.nextInt();
        System.out.println(hours + " / 24 = " + ((double)hours / 24) + " days."); //formula to convert from hours to a day
        System.out.println("");//spacing
    }
    public static void elapsedTime()
    {
        Scanner input = new Scanner (System.in);//gets readu for input
        System.out.print("Enter the beginning hour: "); 
        int beginningHour = input.nextInt();
        System.out.print("Enter the beginning minutes: "); 
        int beforeMins = input.nextInt();
        System.out.print("Enter the ending hour: "); 
        int endingHour = input.nextInt();
        System.out.print("Enter the ending minutes: "); 
        int endingMins = input.nextInt();
        int hour3;//difference in hours
        int min3;//difference in mins
        if(beginningHour > endingHour) {
            hour3 = beginningHour - endingHour;
        }else{
            hour3 = endingHour - beginningHour; 
        }
        if(beforeMins > endingMins){ 
            min3 = beforeMins - endingMins;
        }else{
            min3 = endingMins - beforeMins;
        }
        System.out.println(hour3 + " hrs " + min3 + " mins");
        System.out.println(" ");
    }
    public static void main (String args [])
    {
        int x = 1;
        while (x == 1) 
        {
            Scanner input = new Scanner (System.in);
            System.out.println("Conversion Tasks");
            System.out.println("1. Hours -> Minutes");
            System.out.println("2. Days -> Hours");
            System.out.println("3. Minutes -> Hours");
            System.out.println("4. Hours -> Days");
            System.out.println("5. Elapsed time between two times");
            System.out.println("6. Exit");
            System.out.print("Enter a number: ");//asks user what they would like to do
            int menu = input.nextInt();
            System.out.println("");
            //does the operation based on input
            if (menu == 1)
            {
                hoursToMinutes();
            }
            else if (menu == 2)
            {
                daysToHours();
            }
            else if (menu == 3)
            {
                minutesToHours();
            }
            else if (menu == 4)
            {
                hoursToDays();
            }
            else if (menu == 5)
            {
                elapsedTime();
            }
            else if (menu == 6)
            {
                x = 0;//exits the program
            }
        }
    }
}
/** Sample Ouput
Conversion Tasks
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Elapsed time between two times
6. Exit
Enter a number: 5

Enter the beginning hour: 8
Enter the beginning minutes: 14
Enter the ending hour: 2
Enter the ending minutes: 47
6 hrs 33 mins
_____________________________________________
Conversion Tasks
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Elapsed time between two times
6. Exit
Enter a number: 5

Enter the beginning hour: 3
Enter the beginning minutes: 32
Enter the ending hour: 3
Enter the ending minutes: 33
0 hrs 1 mins
_____________________________________________
Conversion Tasks
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Elapsed time between two times
6. Exit
Enter a number: 5

Enter the beginning hour: 1
Enter the beginning minutes: 48
Enter the ending hour: 12
Enter the ending minutes: 29
11 hrs 19 mins

Conversion Tasks
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Elapsed time between two times
6. Exit
Enter a number: 6

 */
