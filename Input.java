// taking input from the user
import java.util.Scanner;
class Input
{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter Your Name");
String name=sc.nextLine();
System.out.println("Enter Your Age");
int age=sc.nextInt();
System.out.println("Enter Your Gender");
char gender=sc.next().charAt(0);
System.out.println("Thanks For Entering Your Details");
}
}