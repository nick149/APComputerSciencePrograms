import java.util.*;
/**
 * Program: Prog108b
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.6/ Linux (Ubuntu MATE 14.04)
 * Desciption: This program runs 4 times, and calculates the annual depreciation over time  

 * What I Learned: How to use loops in Java to let the program run multiple times
 * Difficulties: At first the loop ran too many times, however this fixed by runs<=4
 * 
 */
public class prog108b
{
    public static void main (String args[]){
        
        for (int runs=1; runs<=4;runs++)// creates a loop
        {
        System.out.print("Enter Price: ");//asks for input
        Scanner input= new  Scanner (System.in);//creates a scanner variable
        double price = input.nextDouble();//gets the input
        System.out.print("Enter Salvage Value: ");//asks for salvage value
        double salvagevalue= input.nextDouble();//gets salvage value
        System.out.print("Enter Estimated Life In Years ");//asks for life time
        int life=input.nextInt(); //gets life expectancy
        double anndepreciation = (price - salvagevalue)/life; //formula
        anndepreciation= (int)(anndepreciation*100+.5)/100.0; //rounding
        System.out.println("Annual Depreciation " + anndepreciation);//displays  output
        System.out.println();
    }
    }
    
}
/**
 * Sample Output
Enter Price: 250
Enter Salvage Value: 12
Enter Estimated Life In Years 8
Annual Depreciation 29.75

Enter Price: 39867
Enter Salvage Value: 30
Enter Estimated Life In Years 20
Annual Depreciation 1991.85

Enter Price: 50
Enter Salvage Value: 2
Enter Estimated Life In Years 2
Annual Depreciation 24.0

Enter Price: 120
Enter Salvage Value: 45
Enter Estimated Life In Years 6
Annual Depreciation 12.5

 */
