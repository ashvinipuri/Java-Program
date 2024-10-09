/*  count the number of occurrence of each element of an array
     int[]arr={1,2,3,4,5,6,6,6,6};*/

package OOP;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={1,2,3,4,5,6,6,6,6};
      int count=0;
      int n=6;
      for(int i=0;i<arr.length-1;i++)
      {
    	  if(arr[i]==n)
    	  {
    		  count++;
    		  
    	  }
      }
      System.out.println("the number of occurence are="+n);
	}

}
