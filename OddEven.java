//WAJP TO CHECK WHEATHER NUMBER IS ODD OR EVEN USING SWITCH STATEMENT
import java.util.Scanner;
public class OddEven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the Number : ");
		int num = sc.nextInt();
		switch (num % 2)
		{
			case 0:
				System.out.printf("This is a Even Number");
				break;
 
			case 1:
				System.out.printf("This is a Odd Number");
				break;
		}
	}
}