/* find the fibonacci series 
  0 1
 1
 2
*/

package OOP;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(arr[0] + " " + arr[1]);
		for (int i = 2; i < arr.length - 1; i++) {
			arr[i] = arr[i - 1] + arr[i -2];
			System.out.println(" " + arr[i]);

		}
	}

}
