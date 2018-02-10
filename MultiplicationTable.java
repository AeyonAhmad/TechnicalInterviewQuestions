//Grade school multiplication table from 1x1 to 12x12
public class MultiplicationTable
{

    public static void main(String[] args)
    {
        /*if you wanted the min and max to be taken from command line
         *int min = Integer.parseInt(args[0]);
         *int max = Integer.parseInt(args[1]);*/
        
        int min = 1; int max = 12;
        printTable(min, max);
    }
    
    public static void printTable(int min, int max)
    {
        System.out.print("     "); //formatting for the 1st row
        
        //prints 1st row
        for (int i = min; i <= max; ++i) System.out.format("%5d", i);
        
        System.out.println("\n___________________________"
                + "_______________________________________\n");
       
        for (int j = min; j <= max; ++j)
        {
            //prints 1st column
            System.out.format("%2d ->", j);
            
            //prints the products
            for (int k = min; k <= max; ++k) System.out.format("%5d", j * k);
            System.out.println();
        }
    }
}