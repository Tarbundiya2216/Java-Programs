//WAJ TO PRINT REMARK ACCORDING TO THE GRADE OBTAINED USING SWITCH
import java.util.Scanner;
public class Remarks
{
    public static void main(String[]args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please ENTER Grade A, B, C, D or F :");
		char grade = sc.next().charAt(0);
        switch(grade)
        {
            case 'A':
	   case 'a':
                System.out.println("Remark : Excellent!");
                break;
            case 'B':
	   case 'b':
                System.out.println("Remark : Well Done");
                break;
            case 'C':
   	   case 'c':
                System.out.println("Remark : Very Good");
                break;
            case 'D':
	   case 'd':
                System.out.println("Remark : Good");
                break;
            case 'F':
	   case 'f':
                System.out.println("Remark : Fail");
                break;
            default:
                System.out.println("Invalid Grade");
				break;
        }
    }
}