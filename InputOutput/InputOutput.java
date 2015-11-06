/* Allen Ng
 * Attempt 1
 */
import java.util.*;

public class InputOutput{
    public static Scanner inputStuff = new Scanner(System.in);
    public static void main(String[] args){
        int deez = 5;
        System.out.println("What's your name?");
        String name = inputStuff.nextLine();
        while (deez == 5){
            System.out.println(name + ", will you go to homecoming with me(Allen)?");
            System.out.println("Yes or No");
            String answer = inputStuff.nextLine();
            if (answer.equalsIgnoreCase("Yes")){
                System.out.println("Aww thanks hun. Sorry this is really geeky and lame. I love you. <3");
                deez = 3;
            } else if (answer.equalsIgnoreCase("No")){
                System.out.println("*sniffle* Why don't you love me? :'( *sniffle* I'm sorry; I'll try harder next time.");
                deez = 3;
            } else
                System.out.println("That's not either yes or no. Try again.");
        }
    }
}

    