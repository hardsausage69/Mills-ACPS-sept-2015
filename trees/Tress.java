/*Allen Ng
 * 9/28/15
 * Actually named trees but i messed up oh well
 * Trees Attempt 1
 */
public class Tress
{
    public static void main(String[] args)
    {
        tallTree();
        shortTree();
    }
    public static void tallTree()
    {
        segWidth(1);
        segWidth(3);
        segWidth(5);
        botTree();
    }
    public static void segWidth(int x)
    {
        for (int height = 0; height < 4; height++)
        {
            for (int space = 1; space <= ((11 - x) / 2) - height; space++)
            {
                System.out.print(" ");
            }
            for (int width = 1; width <= x + 2 * height; width++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void shortTree()
    {
        segHorz(1);
        segHorz(3);
        botTree();
    }
    public static void segHorz(int x)
    {
        for (int height = 0; height < 5; height++)
        {
            for (int space = 1; space <= ((11 - x) / 2) - height; space++)
            {
                System.out.print(" ");
            }
            for (int width = 1; width <= x + 2 * height; width++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void botTree()
    {
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  *******");
    }
}