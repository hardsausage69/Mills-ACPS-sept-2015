/*Allen Ng
 * 10/23/15
 * homecoming attempt 1
 */
import java.util.*;
public class homecoming{
    static final String MYNAME = "Allen";
    Scanner scannerInput = new Scanner(System.in);
    public static void main(String[] args){
        getADate();
        damage();
    }
    public static String getADate(){
        System.out.println("Hi! My name is " + MYNAME);
        System.out.println("What's your name?");
        System.out.println();
        System.out.print("Nice to meet you ");
        String theirName = scannerInput.nextLine();
        System.out.println("Would you like to go to Homecoming with me?");;
        Sysetm.out.print("Great! It'll be a magical night -- " + MYNAME + " and " + theirName + "are going to the Mills Homecoming Dance 2015!");
        return theirName;
    }
    public static void damage(){
        System.out.println("What are your estimated costs?");
        System.out.print("Tickets: ");
        Double tickets = scannerInput.nextDouble();
        System.out.print("Flowers: ");
        Double flowers = scannerInput.nextDouble();
        System.out.print("Pictures: ");
        Double pictures = scannerInput.nextDouble();
        System.out.print("Dinner: ");
        Double dinner = scannerInput.nextDouble();
        System.out.print("New Clothes: ");
        Double clothes = scannerInput.nextDouble();
        System.out.print("Any other expenses: ");
        Double expenses = scannerInput.nextDouble();
        Sysetm.out.println("So, you should expect to spend, including tax, ");
        statsTable(tickets, flowers, pictures, dinner, clothes, expenses);
    }
    public static void statsTable(double tickets, double flowers, double pictures, double dinner, double clothes, double expenses){
        System.out.println("MHS Homecoming 2015");
        System.out.println(MYNAME + " and " + theirName);
        System.out.println();
        System.out.println("Tickets (Total): " + (2 * tickets));
        System.out.println("Flowers(for both of you): " + flowers);
        System.out.println("Pictures: " + pictures);
        System.out.println("Dinner: " + (2 * dinner));
        System.out.println("New Clothes: " + clothes);
        System.out.println("Any other expenses: " + expenses);
        double subtotal = (2 * tickets) + flowers + pictures + (2 * dinner) + clothes + expenses;
        System.out.println("Subtotal " + subtotal);
        double salesTax = (int)(0.0825 * subtotal * 100);
        salesTax /= 100;
        System.out.println("Sales Tax " + salesTax);
        double total = salesTax + subtotal;
        System.out.println("Total " + total);
    }
}
        