package generics;
 class Myclass
 {
	 //generic method to print array will diff data type
	 public <E> void printArray(E[] arr1)  // printArray is a method  E is datatype of the array
	 { // arr1 is name of the array
		 for(E i :arr1)  // enhanced for loop
		 {
			 System.out.println(i);
		 }
		 System.out.println("=====================================");
	 }
 }
public class GenericDemo {

	public static void main(String[] args) {
      Myclass myclass =new Myclass();
      // pass the Integer array
      int[] arr = {33,3,3,55};
      Integer[] arrInt = {11,22,33,44,55};
      myclass.printArray(arrInt);
      
      Double[] arrdouble = {10.33,77.66,88.11,99.1};
      myclass.printArray(arrdouble);
      
      //Float,String,Character,Byte,Long,Short
	
      Float[] arrfloat = {11.3f,77.2f,66.4f,99.3f};
      myclass.printArray(arrfloat);
      

      String[] arrstr = {"tia","ria","siya","jiya"};
      myclass.printArray(arrstr);
      
      Character[] arrch = {'A','S','H','V','I','N','I'};
      myclass.printArray(arrch);
      
      Boolean[] arrbool = {true,false};
      myclass.printArray(arrbool);
      
      
}
}