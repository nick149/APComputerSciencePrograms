import java.util.*;
import java.io.*;
/**
 * Program: Prog470cRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program reads a 5 X 5 two-dimensional array from an external data file. 
 It then prints out the original matrix.  Then, it finds the total of each row and column, 
 storing them into the sixth positions in your matrix.  Finally, it prints out your new 6 X 6 matrix which includes the totals.

 * What I Learned: How to take in a 5x5 two dimensional array
 * Difficulties: Spacing and inputing the 5x5 array
 * 
 */
public class prog470cRudd
{
    private static int matrix[][];//array
    public static void getInfo(){//pulls from file
        matrix = new int[5][5];
        int i=0;
        Scanner inFile = null;
        try {//pulls file
            inFile = new Scanner(new File("prog464a.dat"));
        } catch (FileNotFoundException e) {//if file is not there
            e.printStackTrace();
        }
        while (inFile.hasNext()){
            matrix[i][0] = inFile.nextInt();
            matrix[i][1] = inFile.nextInt();
            matrix[i][2] = inFile.nextInt();
            matrix[i][3] = inFile.nextInt();
            matrix[i][4] = inFile.nextInt();
            i++;
        }
    }
    public static void sumOfElements(int[][] matrix){
        int sumOfRow=0;
        int sumOfColumn=0;
        int total = 0;
        System.out.println("\nOriginal Matrix");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nWith Totals");//for the new stuff
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                sumOfRow = sumOfRow + matrix[i][j];
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(sumOfRow);
            total = total+sumOfRow;
            sumOfRow = 0;
        }
    }
    public static void main (String args[])//run the methods above
    {
        getInfo();
        sumOfElements(matrix);
    }
}
