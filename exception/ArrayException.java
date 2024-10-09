package exception;

public class ArrayException {

	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	
	try
	{
		
		System.out.println(arr[10]);	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("the index given is not correct");
		System.out.println("the size of array is"+arr.length);
		e.getMessage();
	}
	}
	
		
	}


