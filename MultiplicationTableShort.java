public class MultiplicationTableShort
{
    public static void main(String[] args)
    {
        int min = 1; int max = 12;
        printTable(min, max);
    }
    public static void printTable(int min, int max)
    {
        System.out.print("     ");
        for (int i = min; i <= max; ++i) System.out.format("%5d", i);
        System.out.println("\n__________________________________________________________________\n");
        for (int j = min; j <= max; ++j)
        {
            System.out.format("%2d ->", j);
            for (int k = min; k <= max; ++k) System.out.format("%5d", j * k);
            System.out.println();
        }
    }
}