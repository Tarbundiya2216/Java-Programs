//JAVA PROGRAM TO CHECK GIVEN NUMBER IS DIGIT OR NOT

import java.util.Scanner;
public class Digit
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Please enter a character");
    int a = sc.nextInt();
     if(a>='0' && a<='9')
	 {
	  	System.out.println("Given Number is Digit.");
	 }
	 else
	 {
	  	System.out.println("Given Number is Not Digit.");
	 }

  }
}