import java.util.*;
import java.io.*;
/**
 * Program: prog460aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/Windows 7 Pro x64 SP1
 * Desciption:This program looks and see if the users input is in a file in the array
 * 
 * What I Learned: How to search a array
 * 
 * Difficulties: The method to search the array
 * 
 */
public class prog460aRudd
{
    public static int binarySearch(int[] array, int usenum) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;//middle number
            if(usenum < array[mid])
            {
                high = mid - 1;
            }
            else if (usenum > array[mid]) 
            {
                low = mid + 1;
            }else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner file = null; 
        try  
        {
            file = new Scanner(new File("sort.dat"));//imports file
        }catch (FileNotFoundException e)  
        { 
         System.out.println ("File not found!"); //lets user know that it has not been fount
         System.exit (0); 
        } 
        int[] fileArr = new int[60];//mounts a array
        int numb = 0;
        while (file.hasNext())
        {
            fileArr[numb] = file.nextInt();//add to array
            numb++;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");//prompt user
        int userNum = input.nextInt();//read input
        int index = binarySearch(fileArr, userNum);//looks for number in array
        if (index < 0)//number not found
        {
            System.out.println("Your number does not occur in this list!");
        }
        else//number found
        { 
            int numLocation = index+1;//makes the index number correct
            System.out.println("Your number occurs at position " + numLocation);
        }
    }
}
/** Sample Output
Enter the number to search for: 110
Number Not Found!

Enter the number to search for: 60
Your number occurs at position 41

Enter the number to search for: 1
Your number occurs at position 1

Enter the number to search for: 92
Your number occurs at position 53

Enter the number to search for: 17
Your number does not occur in this list!

Enter the number to search for: 213
Your number does not occur in this list!

 */
