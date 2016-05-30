/**
 * Program: Prog520aRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.8/ Windows 7 SP1 64bit
 * Desciption: This program prints all the combinations of A, U, C, G, in three letters at a time.
 * 
 * What I Learned: How to usestring arrays
 * 
 * Difficulties: Three loops, alot can go wrong.. 
 * 
 */
public class prog520aRudd
{
    public static void main (String [] args)
    {
        //a string array to keep the letters (makes it easy on me later)
        String[] letters = {"A", "U" , "C" , "G" };
        //loop for the first letter
        for(int firstletter = 0; firstletter<4; firstletter++)
        {
            //loop for second letter
            for(int secondletter=0; secondletter<4; secondletter++)
            {
                //loop for third letter
                for(int thirdletter=0; thirdletter<4; thirdletter++)
                {
                    //prints out the three letters
                    System.out.print(letters[firstletter]+letters[secondletter]+letters[thirdletter]+"\t");
                }
                //new line
                System.out.print("\n");
            }
        }
        
    }
}
/** Sample output
AAA	AAU	AAC	AAG	
AUA	AUU	AUC	AUG	
ACA	ACU	ACC	ACG	
AGA	AGU	AGC	AGG	
UAA	UAU	UAC	UAG	
UUA	UUU	UUC	UUG	
UCA	UCU	UCC	UCG	
UGA	UGU	UGC	UGG	
CAA	CAU	CAC	CAG	
CUA	CUU	CUC	CUG	
CCA	CCU	CCC	CCG	
CGA	CGU	CGC	CGG	
GAA	GAU	GAC	GAG	
GUA	GUU	GUC	GUG	
GCA	GCU	GCC	GCG	
GGA	GGU	GGC	GGG	
 */