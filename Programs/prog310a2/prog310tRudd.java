import java.util.Random;
 
/**
 * Program: Prog310tRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1
 * Desciption: This program produces sales for a company for the sales of october
 * 
 * What I Learned: How to use random number generator to produce finctional sales 
 * 
 * Difficulties: None
 * 
 */
public class prog310tRudd
{
    public static void mondays(int sales, int day)//for mondays
    {
        Random rndm = new Random();//random number generator
        sales = 30000 + rndm.nextInt(10001);
        System.out.print(day+"\t "+sales+"\t");
        for (int i = 100; i <= sales; i+=1000)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void tuesdays(int sales, int day)//for tuesdays
    {
        Random rndm = new Random();//random number generator
        sales = 20000 + rndm.nextInt(20001);
        System.out.print(day+"\t "+sales+"\t");
        for (int i = 100; i <= sales; i+=1000)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void saterdays(int sales, int day)//for saterdays
    {
        Random rndm = new Random();//random number generator
        sales = 10000 + rndm.nextInt(5000);
        System.out.print(day+"\t "+sales+"\t");
        for (int i = 100; i <= sales; i+=1000)
        {
            System.out.print("*");
        }  
        System.out.println();
    }
    public static void main (String args[])
    {
        System.out.println("        Sales For October");//lets user know what they are looking at
        System.out.println("Day       Daily          Sales Graph");
        Random rndm = new Random();//random number generator
        int dayofWeek = 1;//starts on day one
        for (int day = 1; day <= 31; day++)
        {  
            int sales = 0;//reset the sales after a day
            if ((dayofWeek != 1) && (dayofWeek != 2) && (dayofWeek != 3) && (dayofWeek != 7)) {//if it is not a special day in which sales are under a certain number
                sales = 10000 + rndm.nextInt(30001);  
                System.out.print(day+"\t "+sales+"\t");//prints output
                for (int i = 100; i <= sales; i+=1000)//a loop for the stars
                {
                    System.out.print("*");
                }
                System.out.println();//spacing
                }
             if (dayofWeek == 2){ //If it's an Monday, sales are always above $30,000
                mondays(sales,day);
                }
             if (dayofWeek == 3){ //If it's an Tuesday, sales are always above $20,000
                 tuesdays(sales,day);
                }
 
             if (dayofWeek == 7) { //If it's an Saturday, sales are always less than $15,000
                 saterdays(sales,day);
            }
            dayofWeek++;//counts which day of the wekk it is
            if (dayofWeek > 7){
                dayofWeek = 1;
            }
            if(dayofWeek%7==0){
                System.out.println("");
            }
                    
       }
    }
}
/** Sample Output
Sales For October
Day       Daily          Sales Graph
2	 32093	********************************
3	 34863	***********************************
4	 26642	***************************
5	 30794	*******************************
6	 19748	********************

7	 14846	***************
9	 35560	************************************
10	 31807	********************************
11	 16586	*****************
12	 11469	************
13	 36872	*************************************

14	 12792	*************
16	 31825	********************************
17	 37141	**************************************
18	 25039	*************************
19	 14198	***************
20	 16579	*****************

21	 10728	***********
23	 30834	*******************************
24	 29743	******************************
25	 19412	********************
26	 29273	******************************
27	 31730	********************************

28	 14659	***************
30	 36016	************************************
31	 30321	*******************************

 */