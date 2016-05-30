import java.util.*;
/**
 * Program: TestingProgForMathey
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/Microsoft Windows 7 (Version 6.1) SP1 Professional x64
 * Desciption: This program test math functions in the mathey and power class
 * 
 * What I Learned: How to debug and fix alot of stuff
 * 
 * Difficulties:Debugging different errors that where in both mathey and power class 
 * 
 */
public class testingProg
{
    public static void main(String args [])
    {
        Scanner input = new Scanner (System.in);
        matheyRudd mathy = new matheyRudd();
        power pwr = new power();
        boolean running=true;
        int userinput=0; 
        do
        {
            System.out.println("Please Enter A Option:");
            System.out.println("1 - Square Root Function");
            System.out.println("2 - Cube Root Function");
            System.out.println("3 - Find the Area Of A Square");
            System.out.println("4 - Find Area Of Rectangle");
            System.out.println("5 - Find Area of Circle");
            System.out.println("6 - Find Area of a Triangle");
            System.out.println("7 - Power Function (Power as Double)");
            System.out.println("8 - Power Function (Power as a Int)");
            System.out.println("9 - Sine Function (Double)");
            System.out.println("10 - Sine Function (Int)");
            System.out.println("11 - Exit");
            System.out.print("Option:");
            userinput=input.nextInt();
            if(userinput==1)
            {
                System.out.print("Please enter the number you want to square root: ");
                double sqrt=input.nextDouble();
                System.out.println("The square root of "+sqrt+" is "+ mathy.squareRoot(sqrt));
            }else if(userinput==2)
            {
                System.out.print("Please Enter the number that you would like to cube root: ");
                double croot = input.nextDouble();
                System.out.println("The cube root of "+croot+" is "+mathy.cubeRoot(croot));
            } else if(userinput==3)
            {
                System.out.print("Please enter the side of a square that you would like to find the area of: " );
                double squareSide = input.nextDouble();
                System.out.println("The area of that square is " + mathy.areaSquare(squareSide));
            } else if(userinput==4)
            {
                System.out.print("Please enter the first side of the rectangle of that you would like to find the area of: ");
                double sideRect1 = input.nextDouble();
                System.out.print("Please enter the second side of the rectangle of that you would like to find the area of: ");
                double sideRect2 = input.nextDouble();
                System.out.println("The area of that rectangle is "+ mathy.areaRectangle(sideRect1,sideRect2));
            } else if(userinput==5)
            {
                System.out.print("Please enter the radius of the circle you would like to find the area of: ");
                double radi = input.nextDouble();
                System.out.println("The area of that circle is "+ mathy.areaCircle(radi));
            } else if(userinput==6)//Triangle
            {
                System.out.print("Please Enter the bottom of the triangle that you would like to find the area of: ");
                double bttm = input.nextDouble();
                System.out.print("Please enter the height of that triangle: ");
                double hght = input.nextDouble();
                System.out.println("The area of the triange is "+mathy.areaTriangle(bttm,hght));
            } else if(userinput==7)//Power Function
            {
                System.out.print("Please enter the number that you would like to power: ");
                double pwrNum = input.nextDouble();
                System.out.print("Please enter the power as a double");
                System.out.println(" ");
                double pwer = input.nextDouble();
                System.out.println(pwrNum+ "to the power of "+pwer+ " is "+pwr.power(pwrNum,pwer));
            } else if (userinput==8){
                System.out.print("Please enter the number that you would like to power: ");
                double pwrNum = input.nextDouble();
                System.out.print("Please enter the power as a intager :");
                int pwer = input.nextInt(); 
                System.out.println(pwrNum+ "to the power of "+pwer+ " is "+pwr.power(pwrNum,pwer));
            }
            else if(userinput==9)//Sine Function
            {
                System.out.println("Please enter the number than you would like to use with the sine function: ");
                System.out.print("Please remember that this must be a double!");
                double sin = input.nextDouble();
                System.out.println(mathy.sine(sin));
            }else if(userinput==10)//Sine Function
            {
                System.out.println("Please enter the number than you would like to use with the sine function: ");
                System.out.print("Please remember that this must be a int!");
                int sin = input.nextInt();
                System.out.println(mathy.sine(sin));
            }
            else if(userinput==11)
            {
                System.out.println("Good Bye!");
            }
            else 
            {
                System.out.print("Please enter a number between 1-11!");
            }
            System.out.println(" ");
        }while((userinput!=11));
    }
}
/** Sample Output (Please not spacing was corrected during this run, so this was a early build with some spacing and formating inperfections)
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:1
Please enter the number you want to square root: 9
The square root of 9.0 is 3.0
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:2
Please Enter the number that you would like to cube root: 27
The cube root of 27.0 is 3.0
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:3
Please enter the side of a square that you would like to find the area of: 10
The area of that square is100.0
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:4
Please enter the first side of the rectangle of that you would like to find the area of: 5
Please enter the second side of the rectangle of that you would like to find the area of: 15
The area of that rectangle is 75.0
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:5
Please enter the radius of the circle you would like to find the area of: 3
The area of that circle is 28.259999999999998
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:6
Please Enter the bottom of the triangle that you would like to find the area of: 10
Please enter the height of that triangle: 5
The area of the triange is 25.0
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:7
Please enter the number that you would like to power 6
Please enter the power as a double 2
6.0to the power of 2.0 is 36.0
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:9
Please enter the number than you would like to use with the sine function: 
Please remember that this must be a double!2
0.9092974268256817
Please Enter A Option:
1 - Square Root Function
2 - Cube Root Function
3 - Find the Area Of A Square
4 - Find Area Of Rectangle
5 - Find Area of Circle
6 - Find Area of a Triangle
7 - Power Function (Power as Double)
8 - Power Function (Power as a Int)
9 - Sine Function (Double)
10 - Sine Function (Int)
11 - Exit
Option:11
Good Bye!

 */