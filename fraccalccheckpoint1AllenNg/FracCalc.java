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
        String wholeUnknown1 = operandWhole(firstOperand);
        int numerator1;
        int negativeOrNot1 = wholeUnknown1.indexOf("-");
        if (negativeOrNot1 != -1){
            numerator1 = operandNumerator(firstOperand) * -1;
        } else {
            numerator1 = operandNumerator(firstOperand);
        }
        int whole1 = Integer.parseInt(wholeUnknown1);
        String wholeUnknown2 = operandWhole(secondOperand);
        int numerator2;
        int negativeOrNot2 = wholeUnknown2.indexOf("-");
        if (negativeOrNot2 != -1){
            numerator2 = operandNumerator(secondOperand) * -1;
        } else {
            numerator2 = operandNumerator(secondOperand);
        }
        int whole2 = Integer.parseInt(wholeUnknown2);
        int denominator1 = operandDenominator(firstOperand);
        int denominator2 = operandDenominator(secondOperand);
        String stringComponents = "whole:" + whole2 + " numerator:" + numerator2 + " denominator:" + denominator2;
        //return stringComponents;
        String mixedNumber1 = mixedFraction(whole1, numerator1, denominator1);
        String mixedNumber2 = mixedFraction(whole2, numerator2, denominator2);
        int improperNum1 = parsedImpropNum(mixedNumber1);
        int improperNum2 = parsedImpropNum(mixedNumber2);
        int improperDenom1 = parsedImpropDenom(mixedNumber1);
        int improperDenom2 = parsedImpropDenom(mixedNumber2);
        int operatorIndex = input.indexOf(" ") + 1;
        String operator = input.substring(operatorIndex, operatorIndex + 1);
        String singleImprop;
        if (operator.equals("+")){
            singleImprop = addImprop(improperNum1,improperNum2, improperDenom1, improperDenom2);
        } else if (operator.equals("-")){
            singleImprop = subtractImprop(improperNum1, improperNum2, improperDenom1, improperDenom2);
        } else if (operator.equals("*")){
            singleImprop = multiplyImprop(improperNum1, improperNum2, improperDenom1, improperDenom2);
        } else {
            singleImprop = divideImprop(improperNum1, improperNum2, improperDenom1, improperDenom2);
        }
        //return singleImprop;
        String finalFraction = reduction(singleImprop);
        return finalFraction;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String operandWhole(String operand){
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
        return wholeStr;
    }

    public static int operandNumerator(String operand){
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

    public static int operandDenominator(String operand){
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
        return mixedFrac;
    }

    public static int parsedImpropNum(String improperFrac){
        int impropFracLength = improperFrac.length();
        int divisionIndex = improperFrac.indexOf("/");
        String numString;
        if (divisionIndex == -1){
            numString = improperFrac.substring(0, impropFracLength);
        } else {
            numString = improperFrac.substring(0, divisionIndex);
        }
        int numerator = Integer.parseInt(numString);
        return numerator;
    }

    public static int parsedImpropDenom(String improperFrac){
        int impropFracLength = improperFrac.length();
        int divisionIndex = improperFrac.indexOf("/");
        String denString;
        if (divisionIndex == -1){
            denString = "1";
        } else {
            denString = improperFrac.substring(divisionIndex + 1, impropFracLength);
        }
        int denominator = Integer.parseInt(denString);
        return denominator;
    }

    public static String addImprop(int num1, int num2, int denom1, int denom2){
        int newNum = (num1 * denom2) + (num2 * denom1);
        int newDenom = denom1 * denom2;
        String singleFrac = newNum + "/" + newDenom;
        return singleFrac;
    }

    public static String subtractImprop(int num1, int num2, int denom1, int denom2){
        int newNum = (num1 * denom2) - (num2 * denom1);
        int newDenom = denom1 * denom2;
        String singleFrac = newNum + "/" + newDenom;
        return singleFrac;
    }

    public static String multiplyImprop(int num1, int num2, int denom1, int denom2){
        int newNum = num1 * num2;
        int newDenom = denom1 * denom2;
        String singleFrac = newNum + "/" + newDenom;
        return singleFrac;
    }

    public static String divideImprop(int num1, int num2, int denom1, int denom2){
        int newNum2 = denom2;
        int newDenom2 = num2;
        int newNum = num1 * newNum2;
        int newDenom = denom1 * newDenom2;
        String singleFrac = newNum + "/" + newDenom;
        return singleFrac;
    }

    public static String reduction(String frac){
        int i = 2;
        int fracLength = frac.length();
        int fracOperator = frac.indexOf("/");
        String numStr;
        String denomStr;
        String fracFinal;
        if (fracOperator != -1){
            numStr = frac.substring(0, fracOperator);
            denomStr = frac.substring(fracOperator + 1, fracLength);
        } else {
            numStr = "0";
            denomStr = "0";
        }
        int num = Integer.parseInt(numStr);
        int denom = Integer.parseInt(denomStr);
        int whole = 0;
        if (Math.abs(num) > Math.abs(denom)){
            whole = num / denom;
            num = num % denom;
            if (num != 0){
                while (i <= denom){
                    if(num % i == 0 && denom % i == 0){
                        num = num / i;
                        denom = denom / i;
                        i = 1;
                    }
                    i++;
                }
                if (whole < 0){
                    num = Math.abs(num);
                }
                if (num < 0 && denom < 0){
                    num = Math.abs(num);
                    denom = Math.abs(denom);
                    while (i <= denom){
                        if(num % i == 0 && denom % i == 0){
                            num = num / i;
                            denom = denom / i;
                            i = 1;
                        }
                        i++;
                    }
                }
                if (num >0 && denom < 0){
                    denom = Math.abs(denom);
                    while (i <= denom){
                        if(num % i == 0 && denom % i == 0){
                            num = num / i;
                            denom = denom / i;
                            i = 1;
                        }
                        i++;
                    }

                }
                fracFinal = whole + "_" + num + "/" + denom;
            } else {
                fracFinal = whole + " ";
                int wholeSpace = fracFinal.indexOf(" ");
                fracFinal = fracFinal.substring(0, wholeSpace);
            }
        } else if (Math.abs(num) < Math.abs(denom)){
            while (i <= denom){
                if(num % i == 0 && denom % i == 0){
                    num = num / i;
                    denom = denom / i;
                    i = 1;
                }
                i++;
            }
            fracFinal = num + "/" + denom;
        } else if (num == 0){
            fracFinal = "0";
        } else {
            fracFinal = "1";
        }
        if (num == 0 && whole == 0){
            fracFinal = "0";
        }
        return fracFinal;
    }
}

