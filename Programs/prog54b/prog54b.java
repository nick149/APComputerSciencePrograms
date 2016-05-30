
/**
 * The program Prog54b takes four variable numbers and then adds them together to recive a sum, then divdes them by 4 to receive a average
 * 
 * @Nicholas Rudd
 * @Prog54b
 * What Ive Learned: How to calculate a average in Java
 * Problems: None
 */
public class prog54b
{
    public static void main (String[] args)
    {
        int var1 = 217; //variable1
        int var2 = 196; //variable2
        int var3 = 812; //variable3
        int var4 = 177; //variable4
        int sum = var1+var2+var3+var4; //sum of the above variables
        double avg = (var1+var2+var3+var4)/4.0; //the avg of the above variables
        avg=(int)(avg*10+.5)/10.0; //converting to the 10th decimal point
        //Display below
        System.out.println("Thank you for entering yoyr four numbers! Your results are:");
        System.out.println();
        System.out.println("The sum of the four numbers is " + sum + " and the average is " + avg);
    }
}
/** Sample Output
Thank you for entering yoyr four numbers! Your results are:

The sum of the four numbers is 1402 and the average is 350.5

 */