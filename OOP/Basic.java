/* print the reverse array [6, 5, 4, 3, 2, 1]*/


package OOP;
import java.util.Arrays;
import java.util.Scanner;
public class Basic
{
	
	public static void main(String[] args)
	{
        int[] arr= {1,2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
        	int temp=arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	start++;
        	end--;
        	
        }
        System.out.println(Arrays.toString(arr));
	}

}
