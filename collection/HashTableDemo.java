package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args)
	{  //duplicate key is not allowed ,key and value cannot be null
		 Hashtable <Character,String> table1=new Hashtable <Character,String>();
         table1.put('A', "Ankit");  //NOT PRINT DUE TO DUPLICATION
         table1.put('A', "Aditya");  //NOT PRINT DUE TO DUPLICATION
         table1.put('Y', "yatin");  //NOT PRINT DUE TO DUPLICATION
         table1.put('N', "Nilesh");
         table1.put('Y', "Yamini");
         table1.put('P', "Priya");
         table1.put('A', "Anvi");
         
     System.out.println(table1);
     
     System.out.println(table1.get('A'));
     System.out.println(table1.get('Y'));
     System.out.println(table1.get('N'));
     
	}

}
