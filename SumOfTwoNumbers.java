//WAJP TO TAKE TWO NUMBERS FROM USER AND PRINT SUM OF IT
import java.util.Scanner;
class SumOfTwoNumbers
{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter First Number");
int num1=sc.nextInt();
System.out.println("Enter Second Number");
int num2=sc.nextInt();
System.out.println(num1+num2 + ":sum of first and second numbers");
}
}