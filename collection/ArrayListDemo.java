package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
	//
		
		//collection of Emp class object
		
		
		ArrayList<Emp> arrList=new ArrayList<Emp>();
		//ArrayList arrList1=new ArrayList();   // 1 method
	//ArrayList<Emp> arrList=new ArrayList<Emp>();    //2
	// List arrLIst1=new ArrayList(); // 3 method
	
	// crearting objects of Emp
	Emp emp1=new Emp(1,"Ashvini",50000);
	Emp emp2=new Emp(2,"Ash",50000);
	Emp emp3=new Emp(3,"Anu",50000);
	Emp emp4=new Emp(4,"priya",50000);
	Emp emp5=new Emp(5,"sanu",50000);
	
	// add the objects in  list or collection
	

	ArrayList<Emp> arrList1;
	arrList.add(emp1);
	arrList.add(emp2);
	arrList.add(emp3);
	arrList.add(emp4);
	arrList.add(emp5);
	
	// to display
	for( int i=0;i<arrList.size();i++)
	{
		System.out.println(arrList.get(i));
		System.out.println("=======================");
	}
	
	}

}
