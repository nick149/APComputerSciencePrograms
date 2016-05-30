
/**
 * Program: PowerForMathey
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/Microsoft Windows 7 (Version 6.1) SP1 Professional x64
 * Desciption: This program protects the power class from overloading
 * 
 * What I Learned: How to setup overloading in classes
 * 
 * Difficulties:When debuging some errors arross, however simple fixes
 * 
 */
public class power
{
    /** 
     * The following method is a overloading method and sould just return null
     */
    public void power(){
    }
    /**
     * The following method takes in a (double) number, then the (int) power
     * 
     * Variables:
     *          number-double-the number that you would like to power
     *          power-int-the number that you would like to power the number by
     */
    public double power(double number, int power) {
        return Math.pow(number, power);
    }
     /**
     * The following method takes in a (double) number, then the (double) power
     * 
     * Variables:
     *          number-double-the number that you would like to power
     *          power-double-the number that you would like to power the number by
     */
    public double power(double number, double power) {
        return Math.pow(number, power);
    }
}
