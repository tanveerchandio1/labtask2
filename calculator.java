import java.util.Scanner;
public class calculator  {

    public static void main(String[] args) {

        char operator;
       int number1, number2, num3;


        Scanner input = new Scanner(System.in);


        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);


        System.out.println("Enter first number");
        number1 = (int) input.nextDouble();

        System.out.println("Enter second number");
        number2 = (int) input.nextDouble();

        switch (operator) {


            case '+':
                num3 = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + num3);
                break;

            case '-':
                num3 = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + num3);
                break;

            case '*':
                num3 = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + num3);
                break;

            case '/':
                num3 = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + num3);
                break;

            default:
                System.out.println("wrong operator!");
                break;
        }

        input.close();
    }
}