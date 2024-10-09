package module3;
import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      if(num>0)
      {
    	  System.out.println(" enter the number is + ve");
      }
      else if(num<0)
      {
    	  System.out.println(" enter the number is - ve");
      }
      else
      {
    	  System.out.println(" enter the number is zero ");
      }
}

}
