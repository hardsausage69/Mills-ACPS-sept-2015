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
        String operand1Pieces = operandBreakdown(firstOperand);
        String operand2Pieces = operandBreakdown(secondOperand);
        return operand2Pieces;

    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String operandBreakdown(String operand){
        int operandLength = operand.length();
        int space = operand.indexOf(" ");
        int fraction = operand.indexOf("/");
        String whole;
        String numerator;
        String denominator;
        if (fraction == -1){
            whole = operand;
            numerator = "0";
            denominator = "1";
        } else if (space == -1){
            whole = "0";
            numerator = operand.substring(0, fraction);
            denominator = operand.substring(fraction, operandLength);
        } else {
            whole = operand.substring(0, space);
            numerator = operand.substring(space, fraction);
            denominator = operand.substring(fraction, operandLength);
        }
        String stringComponents = "whole: " + whole + " numerator: " + numerator + " denominator: " + denominator;
        return stringComponents;

    }
}
