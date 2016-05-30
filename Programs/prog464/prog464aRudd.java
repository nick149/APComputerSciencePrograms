import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Write a description of class prog464aRudd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prog464aRudd
{
    private int x=0;
    public static int[][] input=new int [5][5];
    public static int[][] output=new int[5][5];
    /**
       * Runs All methods
         */
        public  static void main(String[] args)
        {
            //inputs info
            File file = new File("prog464a.dat");
            Scanner scanner = null;
            try { 
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int programs = 0;
            while(scanner.hasNextInt())
                {
                    for(int i = 0; i<5; i++)
                    {
                        for(int j = 0; j<5; j++)
                        {
                            input[i][j] = scanner.nextInt();
                            output[i][j] = input[i][j];
                        }   
                    }
                }
            while(programs <3)
            {
                //make all programs execute here
                switch (programs)
                {
                    case 0:  transpose();
                     break;
                     case 1:  AddDiag();
                     break;
                     case 2:  AddRowsandCol();
                     break;
                    }
             //prints output
            for(int i=0; i<5;i++)
            {
                System.out.print("\n");
                for(int j=0;j<5;j++)
                {
                    System.out.print(output[i][j]);
                }
            }
        }
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int[][] transpose()
    {  
        for(int i=0; i<input.length; i++)
        {
            for(int j=1; j<input[0].length; j++)
            {
                output[i][j] = input[j][i];
            }
        }
        return output;
    }
    public static String AddRowsandCol()
    {  
        int total = 0;
        int loop = 0;
        for(int i=0; i<5; i++)
        {
           for(int j=0; j<5; j++)
           {
               if(loop<i)
               {
                    output[loop][5] = total;
                    total = 0;
               }
               total += output[i][j];
            }
        }
        return "Origional Matrix\n" +input +"\n\nWithTotals" +output;
    }
    public static String AddDiag()
    {  
        int totala = 0;
        int totalb = 0;
        int count = 5;
        for(int i=0; i<5; i++)
        {
            count--;
            totala += input[i][i];
            totalb += input[i][count];
        }
        return "Main Diagonal Sum " +totala +"\nOther Diagonal Sum" +totalb;
    }
}
