package module5;
import java.util.Scanner;
public class Circle 
{
private double radius;
private double area1;
private double peri;

final double PI=3.14;  
Scanner sc=new Scanner(System.in);

 public void accept()
 
 {
	System.out.println("enter the radius"); 
	radius=sc.nextDouble();
 }
 public void calarea1()
 {
	 
		area1=PI*radius*radius; 
 }
 public void calperi()
 {
	 
		peri=2*PI* radius;
 }
 public void display()
 {
	 System.out.println("radius="+radius);
	 System.out.println("area1="+area1);
	 System.out.println("peri="+peri);
 }
}
