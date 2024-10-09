package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	// hetrogeneous collection
		ArrayList arrList =new ArrayList();
		arrList.add(10);
		arrList.add(20.22);
		arrList.add(true);
		arrList.add("Ashvini");
		arrList.add("Ashvini");
		arrList.add("Ashvini");
		arrList.add("Ash");
		
		Emp emp1=new Emp(1,"Ashmol",80000);
		Emp emp2=new Emp(2,"Raha",50000);
		
		arrList.add(emp1);
		arrList.add(emp2);
		
		// to display the objects // 1 method
		System.out.println("using dispaly method");
		for(int i=0;i<arrList.size();i++)
		{
			System.out.println(arrList.get(i));
			System.out.println("=======================================");
		}
		System.out.println("==========================");
		//2 nd object:to display the objects
		System.out.println("using the iterator method");
		Iterator itr=arrList.iterator();
		while(itr.hasNext())
		{
			// true
			System.out.println(itr.next()); // to display object
		}
		System.out.println("=================================");
	// contains method is used to check whetther the obj is predent or not : returns ture/false
		boolean res=arrList.contains("Ashvini");
		System.out.println(res);
		
		// returnd the int  index of obj if present ,else  -1
		int res1=arrList.indexOf("Ashini");
		System.out.println("indexOf : " + res1);
		
		 res1=arrList.lastIndexOf("Ashini");
		System.out.println("LastIndexOf : " + res1);
		
		System.out.println("using to remove");
		//to remove the object
		
		arrList.remove("Ashvini");  //using objects
		arrList.remove(1); // using index
		
		
		//to delete all the elements
		arrList.clear();
		System.out.println(arrList.isEmpty());  // true/false
		
		arrList.addFirst(22);  //0
		arrList.addLast("Ash");  //1
		
		//to change the objects 
		arrList.set(1, 88);
		
		for(int i=0;i<arrList.size();i++)
		{
			System.out.println(arrList.get(i));
			System.out.println("========================================");
		}	
	}
}
