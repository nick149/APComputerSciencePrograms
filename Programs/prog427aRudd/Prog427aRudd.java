import java.util.*;
/**
 * Program: prog427a Rudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 Professional x64
 * Desciption:This program print prime numbers between 1-1000(but can be adjusted to go higher or lower)
 * 
 * What I Learned:
 * 
 * Difficulties: Spacing
 * 
 * 
 */
public class Prog427aRudd
{
     public static void main (String[] args)
    {
        //the variables below can be changed on your needs
        final int max = 1000;
        final int columns=15;
        //array
        int sieve[]=new int [max+1];
        //variables
        int linecount=0;
        for (int start=1; start <= max; start++)
        {
            sieve[start] = 1;
        }
        for (int nextnumber = 2; nextnumber <= (int)(Math.sqrt(max))+2;nextnumber++){
            if (sieve[nextnumber] !=0){
                for (int multiples = nextnumber*nextnumber; multiples <= max; multiples+=nextnumber)
                {
                    sieve[multiples] = 0;
                }
            }
        }
        for (int loop3=2; loop3 <= max; loop3++)
        {
            if (sieve[loop3] == 1)
            {
                linecount++;//keeps how many lines the program has printed
                System.out.print(loop3+"\t");//prints to user
                //spacing
                if (linecount % columns == 0)
                {
                    System.out.println();
                }
            }
        }
        System.out.println();//spacing
    }
}

/** Sample Output
2   3   5   7   11   13   17   19   23   29   31   37   41   43   47   
53   59   61   67   71   73   79   83   89   97   101   103   107   109   113   
127   131   137   139   149   151   157   163   167   173   179   181   191   193   197   
199   211   223   227   229   233   239   241   251   257   263   269   271   277   281   
283   293   307   311   313   317   331   337   347   349   353   359   367   373   379   
383   389   397   401   409   419   421   431   433   439   443   449   457   461   463   
467   479   487   491   499   503   509   521   523   541   547   557   563   569   571   
577   587   593   599   601   607   613   617   619   631   641   643   647   653   659   
661   673   677   683   691   701   709   719   727   733   739   743   751   757   761   
769   773   787   797   809   811   821   823   827   829   839   853   857   859   863   
877   881   883   887   907   911   919   929   937   941   947   953   967   971   977   
983   991   997   

 */