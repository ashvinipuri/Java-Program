package module3;

import java.util.Scanner;

public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		switch(num)
		{
		
		case 5:
			System.out.println("movie time");
			break;
		case 6:
			System.out.println("super sat");
			break;
		case 7:
			System.out.println("sleepy sunday");
			break;
			default:
				System.out.println("let us complete the work");
		}
	}

}
