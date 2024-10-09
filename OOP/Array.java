/* find the second maximum and second minimum elements of an array
   int[]arr={1,2,3,5,8,7,9}
   output=2,8
   */

package OOP;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,3,5,8,7,9};
Arrays.sort(arr);
System.out.println(arr[1]);
System.out.println(arr[arr.length-2]);
	}

}
