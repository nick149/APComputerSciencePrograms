import java.util.Scanner;
import java.io.*;
/**
 * Program: Prog335tRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1
 * Desciption: This program is supposed to be able to enter a number (prime or not)
 then it will either the number is prime (it is between itself and itself) or it will
 give the two prime numbers it is near
 * 
 * What I Learned: Prime numbers are hard :) However solving for the prime number up to a number is easy, however one above is a diffuclty 
 * 
 * Difficulties: Did not recieve output for high prime number
 * 
 */
public class prog335tRudd
{
    public static void isPrime(int num)//num is the number that thiser has chosen
    {
		int primeNumbers = 0;
		int highprimenum = 0;
		int i =0;
        int numb =0;
        int n = num;
        for (i = 1; i <= n; i++)  	   
        {
            int counter=0; 		
            for(numb =i; numb>=1; numb--)
            {
                if(i%numb==0)
                {
                    counter = counter + 1;
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    primeNumbers = i;
                }	
            }
            //int highprimenum = 0;
            int loop =0;
            int counting =0;
            int nb = num;
            for (loop = num+10; loop >= num; loop--)  	   
            { 		
                int counter2=0; 		
                for(counting =i; counting>=1; counting--)
                {
                    if(loop%counting==0)
                    {
                        counter2 = counter2 + 1;
                    }
                }
                if (counter2 ==2)
                {
                    highprimenum = loop;
                }	
            }	
            
   }
   System.out.print("N is between " + primeNumbers + " and " + highprimenum);
}
		

    
    public static void main(String[] args)//main method
    {
        boolean continu=true;
        while (continu) {
            int number=0;
            Scanner input = new Scanner(System.in);//gets ready for input
            System.out.print("Enter an integer greater than or equal to 2:  ");//asks users for a number greater or equal to 2
            number = input.nextInt();//gets number
            isPrime(number);//calls for method is prime
            if(number!=2)
            {}
            else if(number==2)
            {
                //output
                System.out.println("N is between the prime numbers 2 and 2");
            }
            System.out.print("Enter another contestant (Y/N)?");
            String str = input.next();
            if (!str.equalsIgnoreCase("Y")) {
                continu=false;
            }
    }
  }
}
/** Sample Ouptut
Enter an integer greater than or equal to 2:  23
N is between the prime numbers 23 and 23


 */