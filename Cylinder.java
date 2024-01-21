
import java.util.Scanner;
public class Cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float s = 3.14F;
		 System.out.println("enter height");
		 double h= sc.nextDouble();
		 System.out.println("enter radius");
		 double r = sc.nextDouble();
		 System.out.println((2*s*r*h)+(2*s*r*r));

	}

}
