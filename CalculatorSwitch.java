import java.util.*;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        Double number1, number2, result;
        //Asking user to enter operator
        System.out.println("Choose any one operator +,-,*,/ and %");
        operator = input.next().charAt(0);
        //Asking user to enter numbers
        System.out.println("Enter First Number:");
        number1 = input.nextDouble();
        System.out.println("Enter Second Number:");
        number2 = input.nextDouble();
        //Switch case for perfroming calculation 
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("The Addition of" + " " + number1 + " " + "and" + " " + number2 + " " + "is" + " " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The Substraction of" + " " + number1 + " " + "and" + " " + number2 + " " + "is"+ " " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("The Multiplication of" + " " + number1 + " " + "and" + " " + number2 + " " + "is"+ " " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("The Division of" + " " + number1 + " " + "and" + " " + number2 + " " + "is" + " " + result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println("The Modulo of" + " " + number1 + " " + "and" + " " + number2 + " " + "is" + " " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}







