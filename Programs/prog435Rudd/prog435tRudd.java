
/**
 * Write a description of class prog435tRudd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prog435tRudd
{
    public static void main (String args[])
    {
        //external data
        Scanner inFile=null;
        try
        {
            inFile=new Scanner(new File("prog435t.dat"));
        }
        catch(Exception e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        //title
        System.out.println("Sex"+"\t"+"Bone"+"\t"+"Age"+"\t"+"Length"+"\t"+"Height");
        while (inFile.hasNextLine())
        {
            //initializes the variable
            String sex="";
            String bone="";
            int age = 0;
            double length=0;
            String firstString = inFile.next(); //gets the first word and then splits them.
            char firstChar = firstString.charAt(0);
            char secondChar = firstString.charAt(1);
            sex = Character.toString(firstChar);
            bone = Character.toString(secondChar);
            String secondString = firstString.substring(2,4);
            age=Integer.parseInt(secondString);
            length = inFile.nextDouble();
            //arrays with data and both genders.
            double[] changeRate = new double[8];
            changeRate[0]=2.238;
            changeRate[1]=2.392;
            changeRate[2]=2.970;
            changeRate[3]=3.650;
            changeRate[4]=2.317;
            changeRate[5]=2.533;
            changeRate[6]=3.144;
            changeRate[7]=3.876;
            
            double[] lengthS = new double[8];
            lengthS[0]=69.089;
            lengthS[1]=81.688;
            lengthS[2]=73.570;
            lengthS[3]=80.405;
            lengthS[4]=61.412;
            lengthS[5]=72.572;
            lengthS[6]=64.977;
            lengthS[7]=73.502;
            int checker=0;
            //different bones cause diffent results
            switch(secondChar)
            {
                case 'F': checker=0;
                    break;
                case 'T': checker=1;
                    break;
                case 'H': checker=2;
                    break;
                case 'R': checker=3;
                    break;
            }
            //for females add for because array starts at 4.
            if (sex.equals("F"))
            checker = checker+4;          
            double height = lengthS[checker] + changeRate[checker]*length;
            //bone decreases by .06 each year after 30
            if (age>30)
            {
                height = height*.94;
            }
            DecimalFormat roundedHeight = new DecimalFormat("000.000");
            DecimalFormat roundedLength = new DecimalFormat("000.000");
            //displays the output
            
            System.out.print(sex+"\t"+bone+"\t"+age+"\t"+roundedLength.format(length)+"\t");
            //height with some exceptions.
            if (!bone.equals("F")&&!bone.equals("T")&&!bone.equals("H")&&!bone.equals("R"))
            {
                System.out.println("Wrong Bone Code");
            }
            else if (!sex.equals("F") && !sex.equals("M"))
            {
                System.out.println("Wrong Sex Code");
            }    
            else
            {
                System.out.println(roundedHeight.format(height));
            }
        }
    
}
}
