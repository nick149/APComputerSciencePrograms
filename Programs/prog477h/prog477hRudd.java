import java.util.*;
/**
 * Program: Prog477hRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: Calculates a random bean then calculates where it should go

 * What I Learned: How to use arraylist
 * Difficulties: None
 * 
 */
public class prog477hRudd
{
    public static void main(String[] args) {
        Random generator = new Random();//random number
        System.out.println("Beans\tBlack\tWhite\tLast"); 
        ArrayList<String> color = new ArrayList<String>();//first ArrayList!
        //initulize numbers
        int gennumber;
        int gennumber2;
        for(int loopBeans = 10;loopBeans<=60;loopBeans++)
        {
            //how many beans are in each bag
            int blackBeans = 0;
            int whiteBeans = 0;
            for(int loopBag = 0;loopBag<=loopBeans;loopBag++) 
            {
                gennumber =  generator.nextInt(2) +1; 
                gennumber2 = generator.nextInt(2) +1;          
                if(gennumber + gennumber2 == 2 )//They are both black return one of them to the bag and discard the other
                {
                    color.add(loopBag,"Black");
                    blackBeans++;
                }
                else if(gennumber + gennumber2 == 3)//One is black and the other white return the white bean to the bag and discard the black bean
                {
                    color.add(loopBag,"White");
                    whiteBeans++;
                }
                else if(gennumber + gennumber2 == 4)//Both are white discard both and put a black bean in the bag
                {
                    color.add(loopBag,"White");
                    blackBeans++;
                }
            }
            System.out.println(loopBeans + "\t" + (blackBeans-1) + "\t" + whiteBeans + "\t" + color.get(loopBeans));
        }
    }
}
 /** Sample Output
 Beans  Black   White   Last
10  0   10  White
11  6   5   White
12  5   7   White
13  5   8   Black
14  8   6   Black
15  9   6   White
16  7   9   White
17  9   8   Black
18  6   12  White
19  10  9   Black
20  7   13  White
21  4   17  Black
22  10  12  White
23  16  7   Black
24  11  13  White
25  13  12  White
26  12  14  Black
27  11  16  White
28  16  12  Black
29  10  19  Black
30  18  12  White
31  14  17  Black
32  21  11  Black
33  15  18  White
34  19  15  White
35  18  17  Black
36  21  15  White
37  16  21  White
38  15  23  White
39  19  20  White
40  20  20  White
41  21  20  White
42  15  27  White
43  25  18  White
44  20  24  White
45  19  26  White
46  21  25  White
47  20  27  White
48  27  21  White
49  23  26  Black
50  27  23  White
51  22  29  Black
52  29  23  White
53  21  32  White
54  24  30  White
55  32  23  Black
56  25  31  Black
57  24  33  White
58  27  31  White
59  33  26  Black
60  22  38  Black

  */