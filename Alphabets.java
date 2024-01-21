//WAJP TO CHECK WHEATHER A CHARACTER IS VOVWEL OR CONSONANT USING SWITCH STATEMENT
import java.util.Scanner;
class Alphabets
{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter A Character");
char ch=sc.next().charAt(0);
	
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
	    case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
		}
	}
}