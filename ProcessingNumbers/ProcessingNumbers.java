/*Allen Ng
 * 11/5/15
 * Attempt 1
 */
import java.util.*;
public class ProcessingNumbers{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int evenMax = 0;
        int evenSum = 0;
        int count = 0;
        System.out.println("How many numbers would you like to input?");
        int totalNumber = input.nextInt();
        numberString(evenMax, evenSum, count, totalNumber);
    }

    public static void numberString(int evenMax, int evenSum, int count, int totalNumber){
        System.out.println("First Integer? ");
        int firstNumber = input.nextInt();
        if (firstNumber % 2 == 0){
            evenMax = firstNumber;
            evenSum = firstNumber;
        }
        int min = firstNumber;
        int max = firstNumber;
        while (count < totalNumber - 1){
            System.out.println("Next Integer? ");
            int nextInput = input.nextInt();
            if (nextInput < min){
                min = nextInput;
            } else if (nextInput > max){
                max = nextInput;
            }
            if (nextInput % 2 == 0){
                evenSum += nextInput;
            }
            if (nextInput % 2 == 0 && nextInput > evenMax){
                evenMax = nextInput;
            }
            count++;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum of all even numbers: " + evenSum);
        System.out.println("Largest even number: " + evenMax);
    }
}
