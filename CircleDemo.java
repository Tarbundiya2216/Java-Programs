//WAJP TO TAKE RADIUS OF A CIRCLE FROM USER AND PRINT AREA & CIRCUMFERENCE OF A CIRCLE

import java.util.Scanner;
class CircleDemo
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
    
      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = 3.14 * (radius * radius);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*3.14*radius
      double circumference= 3.14 * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}