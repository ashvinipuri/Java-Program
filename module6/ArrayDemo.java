package module6;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int [5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
  // to display using 1 method
		System.out.println("======================");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		// 2nd method:enhanced for loop
		// 11 22 33 44 55 
		System.out.println("======================");
		for(int temp:arr)
		{      // v   name of the array
			System.out.println(temp);
		}
		
	}

}
