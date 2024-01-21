// java program to check gender
import java.util.Scanner;
public class Gender{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter your gender");
char gender=sc.next().charAt(0);

switch(gender){
case 'M':
case 'm':
System.out.println("You Are Male");
break;
case 'F':
case 'f':
System.out.println("You Are Female");
break; 
default:
System.out.println("Type Again");}
}}