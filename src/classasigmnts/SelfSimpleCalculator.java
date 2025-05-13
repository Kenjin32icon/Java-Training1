package classasigmnts;

import java.util.Scanner;

public class SelfSimpleCalculator {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lewis V1 Simple Calculator");

        //Prompt user to write first operand
        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();

        //Prompt user to write their operand
        System.out.println("Enter operator (+, -, /, *); ");
        char operator = scanner.next.charAt(0);

        //Prompt user to write their second operand
        System.out.println("Enter your second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperator =  true;

        //(Switch, case-break, if) To perform calculations based on the operator.
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            default:
                System.out.println("Error: Invalid operator entered.")
        }
        //If the operation is valid print the result
            if (validOperator){
                System.out.println("Result: " + num1 + "" +operator)


        }


    }

}
