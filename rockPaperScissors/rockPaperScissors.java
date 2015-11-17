/* Allen Ng Sara Cisneros
 * 11/16/15
 * Rock Paper Scissors
 * 
 */
import java.util.*;
import java.util.Random; //allows access to random capabilities
public class rockPaperScissors{
    public static final Scanner console = new Scanner(System.in);
    public static final Random rn = new Random();
    public static void main(String[] args){
        System.out.println("Welcome to the most intense Rock, Paper, Scissors battle of your life.");
        System.out.println("ARE YOU READY TO RUUUUUUUuuuuuuuUUUUUMMMMMMBLLLLLE? ");
        String playThrough = "yes"; //acts as a sort of sentinel for later
        while (playThrough.equalsIgnoreCase("yes")){
            System.out.println("CHOOSE YOUR WEAPON: ROCK, PAPER OR SCISSORS?");
            String userWeapon = console.nextLine();
            int computerNumber = rn.nextInt(3) + 1; 
            String computerWeapon = "default"; //default really isnt necessary but I didn't want to deal with an error so I just defined it bc it is going to be redefined later anyways
            if ( computerNumber == 1){ // allows for the rng to determine what is chosen without having to create an array or list
                computerWeapon = "rock";
            } else if ( computerNumber == 2){
                computerWeapon = "paper";
            } else {
                computerWeapon = "scissors";
            }
            System.out.print("COMPUTER WEAPON: ");
            System.out.println(computerWeapon);
            playThrough = outcome(userWeapon, computerWeapon); //* method allowing for continous loop until termination
        }
        if (playThrough.equalsIgnoreCase("no")){
            System.out.println("Game Over");//signal for end of game
        }
    }

    public static String outcome(String userWeapon, String computerWeapon){
        if ( userWeapon.equalsIgnoreCase(computerWeapon)){//tally score here
            System.out.println("Tie");
        } else if ( userWeapon.equalsIgnoreCase("rock") && computerWeapon == "paper" || userWeapon.equalsIgnoreCase("paper") && computerWeapon == "scissors" || userWeapon.equalsIgnoreCase("scissors") && computerWeapon == "rock"){
            System.out.println("Computer Victory");
        } else if ( userWeapon.equalsIgnoreCase("rock") && computerWeapon == "scissors" || userWeapon.equalsIgnoreCase("paper") && computerWeapon == "rock" || userWeapon.equalsIgnoreCase("scissors") && computerWeapon == "paper"){
            System.out.println("Player Victory");
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("Continue?: Yes or No");
        String input = console.nextLine();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")){//allows for preventing any non yes or no words from cancelling the program
            return input;
        } else {
            while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")){
            System.out.println("Invalid Command");
            System.out.println("Continue?: Yes or No");
            input = console.nextLine();
        }
            
        }
        return input;
    }
}
