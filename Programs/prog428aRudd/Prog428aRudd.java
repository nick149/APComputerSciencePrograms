import java.util.*;
/**
 * Program: prog428a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 Professional x64
 * Desciption:This program decied what prisoners get to leave ;)
 * 
 * What I Learned:How to read two files at once and use arrays
 * 
 * Difficulties: Figuring out what the deal was with the patter of the numbers
 * 
 * 
 */
public class Prog428aRudd
{
     public static void main (String[] args)
    {		
        boolean running =true;
        int difference = 1;
        int number =0;
        int printercounting = 0;
        List<Integer> NumList = new ArrayList<Integer>();
        System.out.println("The free prisoners are");
        while(running && number+difference<=1000){
            if(number>=1000)
            {
                running=false;
            }
            number = number+difference;
            difference=difference+2;
            NumList.add(number);
            printercounting++;
        }
        for(int i = 0; i < NumList.size(); i++) {
            System.out.print(NumList.get(i)+"\t");
            
            if(i%6==0)
            {
                System.out.println("");
            }
        }
        System.out.println("\nor--all the prisoners are free because they stormed the \njailer when he first unlocked the doors!");
    }
}
/** Sample Output
The free prisoners are
1	
4	9	16	25	36	49	
64	81	100	121	144	169	
196	225	256	289	324	361	
400	441	484	529	576	625	
676	729	784	841	900	961	

or--all the prisoners are free because they stormed the 
jailer when he first unlocked the doors!

 */