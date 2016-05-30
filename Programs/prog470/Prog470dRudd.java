import java.io.*;
import java.util.Scanner;
/**
 * Program: Prog470bRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program reads a 5 X 5 two-dimensional array from an external data file and finds
the two diagonal sums and print the array and the sums with labels as shown

 * What I Learned: How to take in a 5x5 two dimensional array
 * Difficulties: Spacing and inputing the 5x5 array
 * 
 */
public class Prog470dRudd {
    private static int matrix[][];//array
    public static void getInfo() {
        matrix = new int[5][5];
        int i=0;
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("prog464a.dat"));
        } catch (FileNotFoundException e) {//Handling exception if file not found
            e.printStackTrace();
        }
        while (inFile.hasNext())
        {
            // Get the row column values
            matrix[i][0] = inFile.nextInt();
            matrix[i][1] = inFile.nextInt();
            matrix[i][2] = inFile.nextInt();
            matrix[i][3] = inFile.nextInt();
            matrix[i][4] = inFile.nextInt();
            i++;
        }

    }
    public static void diagonalSum(int [][] matValues){
        System.out.println("Original Matrix");
		for(int i=0;i<5;i++){//print the orginal matrix
			for(int j=0;j<5;j++){
				System.out.print(matValues[i][j]+"\t");
			}
			System.out.println();//spacing
		}
        int sumMain = 0;
        int sumOther = 0;
        for(int p=0;p<5;p++){//start getting sums
            for(int q=0;q<5;q++){
                if(p==q){
                    sumMain = sumMain + matValues[p][q];
                }
            }
        }
        System.out.println("\nMain Diagonal Sum : "+sumMain);//main sum
        int s=4;
        for(int r=0;r<5;r++){//for the other sum
            if(s>=0){
                sumOther = sumOther + matValues[r][s];
                s--;
            }
        }
        System.out.println("Other Diagonal Sum : "+sumOther);//print to user
    }
    public static void main(String[] args) {//run method found above
        getInfo();
        diagonalSum(matrix);
    }

}