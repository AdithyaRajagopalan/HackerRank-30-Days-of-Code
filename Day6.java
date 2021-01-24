import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in) ;
        String [] inputArray ;
        String [] oddcharacters ;
        String [] evencharacters ;
        String str1 = "" ;
        String str2 = "" ;
        int ctr1,ctr2,ctr3,ctr4,ctr5;    
        int numberOfEntries = scan.nextInt () ;
        inputArray  = new String [numberOfEntries];
        oddcharacters = new String [numberOfEntries];
        evencharacters = new String [numberOfEntries];
        for (ctr1 = 0 ; ctr1 < numberOfEntries ; ctr1 ++) {
            inputArray [ctr1] = scan.next () ;
        }
        // ctr1 = 0;
        // while (ctr1 < numberOfEntries)
        // {
        //     inputArray [ctr1 ] = scan.next () ;
        //     ctr ++ ;
        // }

        for (ctr2 = 0 ; ctr2 < numberOfEntries ; ctr2 ++)
        {  //even characters
            for (ctr3 = 0 ; ctr3 < (inputArray [ctr2].length ()) ; ctr3 += 2)
            {
                str1 += ((inputArray [ctr2]).charAt(ctr3)) ;
            }
            evencharacters [ctr2] = str1 ;
            str1 = "";
            // odd characters
            for (ctr4 = 1 ; ctr4 < (inputArray [ctr2].length ()) ; ctr4 += 2)
            {
                str2 += ((inputArray [ctr2]).charAt (ctr4));

            }
            oddcharacters [ctr2] = str2 ;
            str2 = "";

            System.out.println ((evencharacters [ctr2]) + " " + (oddcharacters [ctr2]));
        }        
    }
}
