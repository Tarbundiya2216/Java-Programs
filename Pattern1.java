import java.util.Scanner;
class Pattern1{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number n:");
int n = sc.nextInt();

for(int row=1; row<=n; row++)
{
for(int col=1; col<=n; col++){
System.out.print(col%2 + " ");

			}
	System.out.println();
		}
	}	
}