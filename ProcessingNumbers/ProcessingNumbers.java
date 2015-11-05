/*Allen Ng
 * 11/5/15
 * Attempt 1
 */
import java.util.*;
public class ProcessingNumbers{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int min;
        int max;
        int count = 0;
        int evenMax = 0;
        int evenSum = 0;
        int totalNumber = userInput.nextInt();
        while (count < totalNumber