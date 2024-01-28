import java.util.Scanner;
class Pattern6{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number n:");
int n = sc.nextInt();

for(int row=1; row<=n; row++)
{
for(int col=1; col<=n; col++){
if(row==col && col<=n/2 || col==n/2+1 && row>n/2 || row+col==n+1 && col>n/2)
System.out.print("*  ");
else
System.out.print("  ");


			}
	System.out.println();
		}
	}	
}