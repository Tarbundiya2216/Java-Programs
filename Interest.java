//wajp to take principle amount , rate of interest and time from user and find simple interest
import java.util.Scanner;

class Interest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the principal amont: ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate of interest: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();

    double interest = (principal * time * rate) / 100;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + interest);
  }
}