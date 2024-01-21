// Java program to check vote eligibility 
import java.util.Scanner;
public class Voting {
 public static void main(String[] args) 
 {
    int age;
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age = sc.nextInt();
    if(age>=18)
    {
        System.out.println("You are eligible for voting.");
    }
    else
    {
    System.out.println("Sorry,You can not vote");
    }
 }
}