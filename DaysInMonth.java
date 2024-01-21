//WAJP TO FIND THE NUMBER OF DAYS IN A MONTH USING SWITH STATEMENT
import java.util.Scanner;
public class DaysInMonth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter month number: ");
   int  a = sc.nextInt();
    switch (a) {
case 4:
    case 6:
    case 9:
    case 11:
     System.out.println(" days = 30");
      break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      System.out.println(" days = 31");
      break;

    case 2:
   System.out.println(" days = 28 or 29");
      break;

    default:
      System.out.println(" Invalid Month");
      break;
    }}}