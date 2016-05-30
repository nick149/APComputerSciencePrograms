import java.util.*;
import java.io.*;
/**
 * Program: Prog464dRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program read a 5 X 5 two-dimensional array 
 from an external data file. Print the original array and its transpose with appropriate labels as shown.

 * What I Learned: How to take in a 5x5 two dimensional array
 * Difficulties: Loops for printing the matrixs
 * 
 */
public class prog464dRUdd
{
    private static int matrix[][];//array
    public static void getInfo(){//pulls from file
        matrix = new int[5][5];
        int i=0;
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("prog464a.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (inFile.hasNext())
        {
            matrix[i][0] = inFile.nextInt();
            matrix[i][1] = inFile.nextInt();
            matrix[i][2] = inFile.nextInt();
            matrix[i][3] = inFile.nextInt();
            matrix[i][4] = inFile.nextInt();
            i++;
        }
    }
    public static void transposeMatrix(int [][] matValues){
        System.out.println("Original Matrix");
        for(int i=0;i<5;i++){//Prints orginal matrix
            for(int j=0;j<5;j++){
                System.out.print(matValues[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n\nTranspose");
        for(int i=0;i<5;i++){//To print new matrix
            for(int j=0;j<5;j++){
                System.out.print(matValues[j][i]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String amin[])
    {
        getInfo();
        transposeMatrix(matrix);
    }
}
/** Sample Output
Original Matrix
45	67	89	12	-3	
-3	-6	-7	-4	-9	
96	81	-8	52	12	
14	-7	72	29	-1	
19	43	28	63	87	


Transpose
45	-3	96	14	19	
67	-6	81	-7	43	
89	-7	-8	72	28	
12	-4	52	29	63	
-3	-9	12	-1	87	
 */