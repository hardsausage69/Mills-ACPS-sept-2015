/* Allen Ng
 * 10/13/15
 * pony stuff part one
 */
public class PonyDistance
{
    public static void main(String[] args)
    {
        System.out.println("Distance from Baltimare to Manehatten: " + distance(31, 16, 34, 9));
        System.out.println("Distance from Los Pegasus to Neighagra Falls: " + distance(6, 20, 22, 8));
        System.out.println("Distance form Badlands to Ponyville: " + distance(25, 23, 16, 14));
        System.out.println("Length of roadtrip: " + roadTrip(69));
        System.out.println("Distance from City1 to City2: " + distance(31, 16, 6, 20));
        System.out.println("Distance from City2 to City3: " + distance(6, 20, 25, 23));
        System.out.println("Distance from City1 to City3: " + distance(31, 16, 25, 23));
        System.out.println("Angle of City1: " + angle(31, 16, 6, 20, 25, 23));
        System.out.println("Angle of City2: " + angle(6, 20, 31, 16, 25, 23));
        System.out.println("Angle of City3: " + angle(25, 23, 31, 16, 6, 20));
        System.out.println("Longest trip: " + longestTrip(31, 16, 6, 20, 25, 23));
    }
    public static double distance(int x1, int y1, int x2, int y2)
    {
        double c = (int)(100 * (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2))));
        c = c / 100;
        return c;
    }
    public static double roadTrip(int diameter)
    {
        double length = (int) (100 * (Math.PI * diameter));
        length = length / 100;
        return length;
    }
    public static double angle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x1, y1, x3, y3);
        double d = (int)(100 * (Math.toDegrees(Math.acos((Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (-2 * a * c)))));
        d = d / 100;
        return d;
    }
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