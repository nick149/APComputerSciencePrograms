
/**
 * Program prog54a is a program that will show mpg (Miles Per gallon) for the 4 cars in the Kansas City Grand Prix
 * 
 * @Nicholas Rudd
 * @prog54a
 * What Ive Learned: How to divid numbers and keep the remainder using the double variable type
 * Troubles: None
 */
public class prog54a
{
    public static void main (String[] args)
    {
        double vwbug = (289.0/9);
        double firebird = (412.0/40);
        double subaru = (361.0/18);
        double cutlass = (161.0/11);
        vwbug=(int)(vwbug*10+.5)/10.0;
        cutlass=(int)(cutlass*10+.5)/10.0;
        subaru=(int)(subaru*10+.5)/10.0;
        cutlass=(int)(cutlass*10+.5)/10.0;
        System.out.println("Kansas City Grand Prix");
        System.out.println("Miles Per Gallon");
        System.out.println("1970 VW Bug averaged " + vwbug+ " mpg");
        System.out.println("1979 Firebirg averaged " + firebird + " mpg");
        System.out.println("1980 Subaru averaged " + subaru + " mpg ");
        System.out.println("1975 Cutlass " + cutlass + " mpg");
        
    }
}
/** Sample Output
 * 
Kansas City Grand Prix
Miles Per Gallon
1970 VW Bug averaged 32.1 mpg
1979 Firebirg averaged 10.3 mpg
1980 Subaru averaged 20.1 mpg 
1975 Cutlass 14.6 mpg

 */
