//WAJP TO TAKE TEMPERATURE IN DEGREE CELCIUS AND CONVERT IT INTO PHARENHIT 
import java.util.Scanner;
public class temperature  
 {  
   public static void main (String args[]) 
{
Scanner sc = new Scanner(System.in); 
  System.out.println("Enter Temperature");
	double Celsius = sc.nextDouble();  
          System.out.println("Temperature in Fahrenheit is: "+((Celsius*9)/5)+32);  
    }} 