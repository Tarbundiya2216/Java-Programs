//JAVA PROGRAM TO CHECK GIVEN NUMBERS ARE GREATER USING NESTED IF
import java.util.Scanner;
public class LargeNumber
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        System.out.print("Enter the third number: ");
        z = sc.nextInt();
        if ( x > y  && x>z)
        
            {
                System.out.println("Largest number: " + x);
            }
            else if(y>z)
            {
                System.out.println("Largest number: " + y);
            
        }
        else
            {
                System.out.println("Largest number: " + z);
            
        }
    }
}

