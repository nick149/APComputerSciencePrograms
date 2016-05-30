import java.util.*; 
import java.io.*; 
import java.text.DecimalFormat; 
/**
 * Program: prog435aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Was writen on Java 1.7/Mac OS X 10.11.2, however last compiled on Windows 7 Pro with Java 1.8
 * Desciption:This program figures out cost for a specific vehicles at specific gates
 * 
 * What I Learned: How to use decimal format and mutltiple arrays
 * 
 * Difficulties:Spacing
 * 
 */
public class prog435aRudd
{
    public static void main (String[] args) 
    { 
       System.out.println("Car Type" + "\t" + "Base Toll" + "\t" + "Factor" + "\t" + "Cost"); 
       double[] factor = {1.0, 1.3, 1.6, 2.0, 2.4, 2.7}; 
       double[] tolls = {1.35, 2.0, 2.5, 3.25, 4.1, 4.8, 5.50, 6.0}; 
       String[] carType = {"Compact Car", "Small Car", "Mid Size Car", "Full size Car", "Truck", "16 Wheeler"}; 
       DecimalFormat dollars = new DecimalFormat("$#.##"); 
        
        Scanner inFile = null; 
        try  
        { 
         inFile = new Scanner (new File("prog435a.dat")); 
        }  
        catch (FileNotFoundException e)  
        { 
         System.out.println ("File not found!"); 
         // Stop program if no file found 
         System.exit (0); 
        } 
        while(inFile.hasNextInt()){ 
           int vehType=inFile.nextInt(); 
               int gateFile=inFile.nextInt();
               System.out.println(carType[vehType-1]+"\t$"+tolls[gateFile-1]+"\t\t$"+factor[vehType-1]+"\t"+(dollars.format(tolls[gateFile-1]*factor[vehType-1])));
        }
               
    } 
}  
/** Sample Output
Car Type	Base Toll	Factor	Cost
Compact Car	$1.35		$1.0	$1.35
Small Car	$2.5		$1.3	$3.25
Mid Size Car	$4.1		$1.6	$6.56
Full size Car	$5.5		$2.0	$11
Truck	$2.0		$2.4	$4.8
16 Wheeler	$3.25		$2.7	$8.78
Compact Car	$4.8		$1.0	$4.8
Small Car	$6.0		$1.3	$7.8
Mid Size Car	$1.35		$1.6	$2.16
Full size Car	$2.5		$2.0	$5
Truck	$4.1		$2.4	$9.84
16 Wheeler	$5.5		$2.7	$14.85
Compact Car	$6.0		$1.0	$6
Small Car	$1.35		$1.3	$1.76
Mid Size Car	$2.0		$1.6	$3.2
Full size Car	$2.5		$2.0	$5
Truck	$3.25		$2.4	$7.8
16 Wheeler	$4.1		$2.7	$11.07

 */
