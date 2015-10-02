/*Allen Ng
 * ASCII ART Illuminati confirmed
 * 10/1/15
 */
public class Illuminati
{
    public static final int LOTS = 60;
    public static void main(String[] args)
    {
        for (int dudududu = 1; dudududu <= 5; dudududu++)
        {
            illuminati();
            System.out.println();
        }
    }
    
    public static void illuminati()
    {
        tip();
        topPart();
        topOfEye();
        middle();
        midMid();
        midBot();
        botEye();
        nearBot();
        botPyr();
    }
        

    public static void tip()
    {
        for (int line = 1; line <= 2; line++)
        {
            for( int space = 1; space <= LOTS; space++)
            {
                System.out.print(" ");
            }
            for (int block = 1; block <= 12; block++)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void topPart()
    {
        for (int lines = 1; lines <= 2; lines++)
        {
            spaces(lines);
            topBlock(lines);
            spaces(lines);
            botBlock(lines);
        }
    }

    public static void topOfEye()
    {
        spaces(3);
        topBlock(3);
        spaces(3);
        botBlockVar(3);
        System.out.println();
    }

    public static void middle()
    {
        spaces(4);
        topPartEye();
        spaces(4);
        topPartEye2();
    }

    public static void midMid()
    {
        spaces(5);
        sectionLong();
        gotSumSpaces(12);
        gotSumZeroes(4);
        gotSumSpaces(11);
        sectionLong();
        gotSumSpaces(11);
        gotSumZeroes(4);
        gotSumSpaces(12);
        sectionLong();
        System.out.println();
        
        spaces(5);
        sectionShort();
        gotSumSpaces(12);
        gotSumZeroes(4);
        gotSumSpaces(15);
        gotSumZeroes(4);
        System.out.print("    ");
        gotSumZeroes(4);
        gotSumSpaces(15);
        gotSumZeroes(4);
        gotSumSpaces(12);
        sectionShort();
        System.out.println();
    }
    
    public static void midBot()
    {
        spaces(6);
        sectionLong();
        gotSumSpaces(16);
        gotSumZeroes(4);
        gotSumSpaces(15);
        sectionLong();
        gotSumSpaces(15);
        gotSumZeroes(4);
        gotSumSpaces(16);
        sectionLong();
        System.out.println();
        
        spaces(6);
        sectionShort();
        gotSumSpaces(24);
        gotSumZeroes(4);
        gotSumSpaces(34);
        gotSumZeroes(4);
        gotSumSpaces(24);
        sectionShort();
        System.out.println();
    }
    
    public static void botEye()
    {
        spaces(7);
        sectionLong();
        gotSumSpaces(32);
        gotSumZeroes(4);
        gotSumSpaces(26);
        gotSumZeroes(4);
        gotSumSpaces(32);
        sectionLong();
        System.out.println();
        
        spaces(7);
        sectionShort();
        gotSumSpaces(40);
        for (int bottomEye = 1; bottomEye <= 26; bottomEye++)
        {
            System.out.print("0");
        }
        gotSumSpaces(40);
        sectionShort();
        System.out.println();
    }
        
    public static void nearBot()
    {
        sectionShort();
        gotSumSpaces(114);
        sectionShort();
        System.out.println();
        
        gotSumZeroes(4);
        gotSumSpaces(122);
        gotSumZeroes(4);
        System.out.println();
    }
    
    public static void botPyr()
    {
        for (int i = 1; i <= 130; i++)
        {
            System.out.print("0");
        }
        System.out.println();
        System.out.print(" ");
        for (int j = 1; j <= 128; j++)
        {
            System.out.print("0");
        }
    }
    
    public static void spaces(int lines)
    {
        for (int space = 1; space <= LOTS - (8 * lines); space++)
        {
            System.out.print(" ");
        }
    }

    public static void topBlock(int lines)
    {
        sectionLong();
        for (int midSpace = 1; midSpace <= (15  * lines) - 11; midSpace++)
        {
            System.out.print(" ");
        }
        sectionLong();
        System.out.println();
    }

    public static void sectionLong()
    {
        for (int block = 1; block <= 12; block++)
        {
            System.out.print("0");
        }
    }

    public static void botBlock(int lines)
    {
        sectionShort();
        for (int midSpace = 1; midSpace <= (15 * lines) - 3; midSpace++)
        {
            System.out.print(" ");
        }
        sectionShort();
        System.out.println();
    }

    public static void botBlockVar(int lines)
    {
        sectionShort();
        gotSumSpaces(12);
        gotSumZeroes(18);
        gotSumSpaces(12);
        sectionShort();
    }

    public static void sectionShort()
    {
        for ( int block = 1; block <= 8; block++)
        {
            System.out.print("0");
        }
    }

    public static void topPartEye()
    {
        sectionLong();
        gotSumSpaces(12);
        gotSumZeroes(4);
        gotSumSpaces(18);
        gotSumZeroes(4);
        gotSumSpaces(12);
        sectionLong();
        System.out.println();
    }

    public static void topPartEye2()
    {
        sectionShort();
        gotSumSpaces(12);
        gotSumZeroes(4);
        gotSumSpaces(26);
        gotSumZeroes(4);
        gotSumSpaces(12);
        sectionShort();
        System.out.println();
    }
    
    public static void gotSumZeroes(int number)
    {
        for (int i = 1; i <= number; i++)
        {
            System.out.print("0");
        }
    }
    
    public static void gotSumSpaces(int space)
    {
        for (int i = 1; i <= space; i++)
        {
            System.out.print(" ");
        }
    }
}