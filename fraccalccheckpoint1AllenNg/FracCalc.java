//Allen Ng checkpoint 2
//Parse int http://stackoverflow.com/questions/5585779/converting-string-to-int-in-java
import java.util.*;

public class FracCalc {
    public static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
        System.out.println("Input Equation (Type \"quit\" to quit): ");
        String input = console.nextLine();
        while(!input.equals("quit")){
            System.out.println(produceAnswer(input));
        }
    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        int stringLength = input.length();
        int operatorSpace = input.indexOf(" ");
        String firstOperand = input.substring(0, operatorSpace);
        String secondOperand = input.substring(operatorSpace + 3, stringLength);
        //return secondOperand;
        int whole1 = operandWhole(firstOperand);
        int whole2 = operandWhole(secondOperand);
        int numerator1 = operandNumerator(firstOperand);
        int numerator2 = operandNumerator(secondOperand);
        int denominator1 = operandDenominator(firstOperand);
        int denominator2 = operandDenominator(secondOperand);
        String stringComponents = "whole:" + whole2 + " numerator:" + numerator2 + " denominator:" + denominator2;
        return stringComponents;
        String mixedNumber1 = mixedFraction(whole1, numerator1, denominator1);
        String mixedNumber2 = mixedFraction(whole2, numerator2, denominator2);

    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int operandWhole(String operand){
        int operandLength = operand.length();
        int space = operand.indexOf("_");
        int fraction = operand.indexOf("/");
        String wholeStr;
        if (fraction == -1){
            wholeStr = operand;
        } else if (space == -1){
            wholeStr = "0";
        } else {
            wholeStr = operand.substring(0, space);
        }
        int whole = Integer.parseInt(wholeStr);
        return whole;
    }
    
    public static String operandNumerator(String operand){
        int operandLength = operand.length();
        int space = operand.indexOf("_");
        int fraction = operand.indexOf("/");
        String numeratorStr;
        if (fraction == -1){
            numeratorStr = "0";
        } else if (space == -1){
            numeratorStr = operand.substring(0, fraction);
        } else {
            numeratorStr = operand.substring(space + 1, fraction);
        }
        int num = Integer.parseInt(numeratorStr);
        return num;
    }
    
    public static String operandDenominator(String operand){
        int operandLength = operand.length();
        int space = operand.indexOf("_");
        int fraction = operand.indexOf("/");
        String denominatorStr;
        if (fraction == -1){
            denominatorStr = "1";
        } else if (space == -1){
            denominatorStr = operand.substring(fraction + 1, operandLength);
        } else {
            denominatorStr = operand.substring(fraction + 1, operandLength);
        }
        int denom = Integer.parseInt(denominatorStr);
        return denom;
    }
    
    public static String mixedFraction(int whole, int num, int denom){
        String mixedFrac = ((whole * denom) + num ) + "/" + denom;
    }
        
}
