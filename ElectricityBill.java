import java.util.* ;

public class ElectricityBill
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        double charges , finalCost ;
        int units ;
        System.out.print("Enter the number of units consumed this month :");
        units = scan.nextInt();
        if (units < 1)
        {
            System.out.println ("Value out of valid range.");
            System.exit(0);
        }
        if (units < 201)
        {
            charges = 3.8;
        }
        else if (units > 200 && units < 301)
        {
            charges = 4.4;
        }
        else if (units > 300 && units < 401)
        {
            charges = 5.1;
        }
        else
        {
            charges = 5.8;
        }
        finalCost = (units*charges);
        System.out.println ("Your final electricity bill amounts to Rs." + finalCost + " .");
    }
}