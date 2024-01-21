import java.util.Scanner;

public class MaxNumber {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
switch (a>b) {
case 1:
System.out.println(a);
break;
case 0:
System.out.println(b);
break;
}
}
}