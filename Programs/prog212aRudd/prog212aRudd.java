import java.util.*;
/**
 * Program: Prog212aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program takes a input of the speed of the passenger train, and has a freight train going 50mph, then it calculates how long it
 will take passenger train to catch up with the freight train
 * 
 * What I Learned: How to use multiple if else statements
 * 
 * Difficulties: None
 */
public class prog212aRudd
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        //sets some variables
        int freightspeed=50;
        //if you would like to change time, the variables are bellow
        int passengertime=11;
        int freighttime=9;
        //these variables will be changed later
        int passengerspeed;
        double time;
 
        //asks user for the speed of passenger train
        System.out.print("Please Enter the Speed of the Passenger Train: ");
        //gets users input 
        passengerspeed=input.nextInt();
        if(passengerspeed<freightspeed)//sees if the passenger train is fast enough
        {
            //tells the user the pass train is not fast enough
            System.out.println("The Passenger Train will not catch the Freight Train");
        }else{
            //calculates when the passenger train will catch the freight train
            time=(double)(freightspeed*((passengertime-1)-freighttime))/(passengerspeed-freightspeed);
            if(time%1==0)
            {
                //this only runs when there is not a remainder in the time
                System.out.println("The passenger train passed the freight train at "+time+ " o'clock");//display data
            }
            else
            {
                //this calculates between which two times the pass train will catch up with the freight train
                int betweentime1=(int)(time);
                int betweentime2=(int)(time+1);
                
                if(betweentime1>12)//converts to 12hr rather than 24
                {
                    betweentime1-=12;
                }
                if(betweentime2>12)//converts to 12hr rather than 24
                {
                    betweentime2-=12;
                }
                //prints output to user
                System.out.println("The passenger train passed the frieght train between "+betweentime1+" and " + betweentime2 + " o'clock");
            }    
            //confirms speeds for user
            System.out.println("Freight Train Was Traveling " + freightspeed+ "mph");
            System.out.println("The Passenger Train was traveling " + passengerspeed + "mph");
        }
    }
}
/**Sample Output
Please Enter the Speed of the Passenger Train: 85
The passenger train passed the frieght train between 1 and 2 o'clock
Freight Train Was Traveling 50mph
The Passenger Train was traveling 85mph

Please Enter the Speed of the Passenger Train: 70
The passenger train passed the frieght train between 2 and 3 o'clock
Freight Train Was Traveling 50mph
The Passenger Train was traveling 70mph

Please Enter the Speed of the Passenger Train: 75
The passenger train passed the freight train at 2.0 o'clock
Freight Train Was Traveling 50mph
The Passenger Train was traveling 75mph

Please Enter the Speed of the Passenger Train: 100
The passenger train passed the freight train at 1.0 o'clock
Freight Train Was Traveling 50mph
The Passenger Train was traveling 100mph

Please Enter the Speed of the Passenger Train: 43
The Passenger Train will not catch the Freight Train

 */