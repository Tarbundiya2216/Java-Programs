//WAJP TO CREATE SIMPLE CALCULATOR USING SWITCH
import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    Double result;
    Scanner sc = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    char operator = sc.next().charAt(0);

    System.out.println("Enter first number");
    double number1 = sc.nextDouble();

    System.out.println("Enter second number");
    double number2 = sc.nextDouble();

    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}