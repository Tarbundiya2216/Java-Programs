import java.util.Scanner;
class Pattern7{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number n:");
int n = sc.nextInt();

for(int row=1; row<=n; row++)
{
for(int col=1; col<=n; col++){
if(col==1 || row==1 ||row==n || row==n/2+1 && col<n || col==n && !(row==n || row==n/2+1))
System.out.print("*  ");
else
System.out.print("  ");


			}
	System.out.println();
		}
	}	
}