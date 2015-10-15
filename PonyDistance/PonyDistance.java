/* Allen Ng
 * 10/13/15
 * pony stuff part one
 */
public class PonyDistance
{
    //use of class constants in order to "simplify" but allows for more changeability for coordinates and such
    public static final int BALTX = 31;
    public static final int BALTY = 16;
    public static final int MANEX = 34;
    public static final int MANEY = 9;
    public static final int LOSPX = 6;
    public static final int LOSPY = 20;
    public static final int NEIGHX = 22;
    public static final int NEIGHY = 8;
    public static final int BADLX = 25;
    public static final int BADLY = 23;
    public static final int PONYX = 16;
    public static final int PONYY = 14;
    //parameters used to call down below methods but many are used multiple times as they are related and stuff
    public static void main(String[] args)
    {
        System.out.println("Distance from Baltimare to Manehatten: " + distance(BALTX, BALTY, MANEX, MANEY));
        System.out.println("Distance from Los Pegasus to Neighagra Falls: " + distance(LOSPX, LOSPY, NEIGHX, NEIGHY));
        System.out.println("Distance form Badlands to Ponyville: " + distance(BADLX, BADLY, PONYX, PONYY));
        System.out.println("Length of roadtrip: " + roadTrip(BALTX, BALTY, PONYX, PONYY));
        System.out.println("Distance from City1 to City2: " + distance(BALTX, BALTY, LOSPX, LOSPY));
        System.out.println("Distance from City2 to City3: " + distance(LOSPX, LOSPY, BADLX, BADLY));
        System.out.println("Distance from City1 to City3: " + distance(BALTX, BALTY, BADLX, BADLY));
        System.out.println("Angle of City1: " + angle(BALTX, BALTY, LOSPX, LOSPY, BADLX, BADLY));
        System.out.println("Angle of City2: " + angle(LOSPX, LOSPY, BALTX, BALTY, BADLX, BADLY));
        System.out.println("Angle of City3: " + angle(BADLX, BADLY, BALTX, BALTY, LOSPX, LOSPY));
        System.out.println("Longest trip: " + longestTrip(BALTX, BALTY, LOSPX, LOSPY, BADLX, BADLY));
    }
    //computes distance formula (Squareroot(x1 - x2)^2 + (y1 - y2)^2) with input as coordinates thus the x1 and y1
    public static double distance(int x1, int y1, int x2, int y2)
    {
        double c = (int)(100 * (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2))));
        c = c / 100;
        return c;
    }
    //use of equation for circumference to find the length of the roadtrip: C = diameter * pi
    public static double roadTrip(int x1, int y1, int x2, int y2)
    {
        double diameter = distance(x1, y1, x2, y2);
        double length = (int) (100 * (Math.PI * diameter));
        length = length / 100;
        return length;
    }
    //use of the law os cosine b/c we know all the coordinates thus all the distances; then we can isolate just the angle in the law of cosine which is what is utilized below
    public static double angle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x1, y1, x3, y3);
        double d = (int)(100 * (Math.toDegrees(Math.acos((Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (-2 * a * c)))));
        d = d / 100;
        return d;
    }
    //use of max utility for math to compare the lengths but because max can only 2 comparables we utilize the parentheses to compare the third distance with the larger of the first comparison
    public static double longestTrip(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x1, y1, x3, y3);
        double d = (int) (100 * (Math.max(a, Math.max(b,c))));
        d = d / 100;
        return d;
    }
}