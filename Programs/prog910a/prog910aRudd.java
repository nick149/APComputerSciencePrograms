import java.util.*;
/**
 * Program: Prog910aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: THis program prints a conversion for a variety of numbers as specified by the user.  
 The conversion from base 10 to some other base will be in the range base 2 through base 16.

 * What I Learned: How to convert from different bases
 * Difficulties: Figuring out how to convert from different bases in java
 * 
 */
public class prog910aRudd
{
   public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number [base 10] to convert: ");//ask for number
        int number = keyboardInput.nextInt();//get number
        System.out.print("Enter the new base: ");//ask for base
        int base = keyboardInput.nextInt();//get base
        System.out.print("The number " + number + " [base 10] = ");//print
        System.out.println(convertBase(number, base) + " [base " + base + "]");//continue printing
    }
    public static String convertBase(int number, int base) {
        int quotient = number / base;
        int remainder = number % base;
        if (base == 16) {// Converts to hexadecimal
            String quotientHex = Integer.toHexString(quotient).toUpperCase();
            String remainderHex = Integer.toHexString(remainder).toUpperCase();
            if (quotient < base) {
                return (quotientHex + remainderHex);
            } else {
                return convertBase(quotient, base) + remainderHex;
            }
        } else {
            if (quotient < base) {
                return (quotient + "" + remainder);
            } else {
                return convertBase(quotient, base) + remainder;
            }
        }
    }
}
/** Sample Output
Enter the number [base 10] to convert: 255
Enter the new base: 16
The number 255 [base 10] = FF [base 16]

Enter the number [base 10] to convert: 256
Enter the new base: 16
The number 256 [base 10] = 100 [base 16]

Enter the number [base 10] to convert: 34
Enter the new base: 8
The number 34 [base 10] = 42 [base 8]

Enter the number [base 10] to convert: 100
Enter the new base: 3
The number 100 [base 10] = 10201 [base 3]

Enter the number [base 10] to convert: 1034
Enter the new base: 12
The number 1034 [base 10] = 722 [base 12]

Enter the number [base 10] to convert: 6
Enter the new base: 7
The number 6 [base 10] = 06 [base 7]

Enter the number [base 10] to convert: 365
Enter the new base: 16
The number 365 [base 10] = 16D [base 16]

Enter the number [base 10] to convert: 20
Enter the new base: 8
The number 20 [base 10] = 24 [base 8]

Enter the number [base 10] to convert: 125
Enter the new base: 16
The number 125 [base 10] = 7D [base 16]

Enter the number [base 10] to convert: 50
Enter the new base: 16
The number 50 [base 10] = 32 [base 16]

Enter the number [base 10] to convert: 30
Enter the new base: 8
The number 30 [base 10] = 36 [base 8]

 */ 
