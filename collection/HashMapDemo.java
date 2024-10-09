package collection;

import java.util.HashMap;

public class HashMapDemo {

	private static final String Aman = null;

	public static void main(String[] args) 
	{//unsorted  character means key,only 1 null key is allowed,multiple values allowed.
		
	HashMap<Character,String> hashmap=new HashMap<Character,String>();
	
     hashmap.put('A', "Ashvini");
     hashmap.put('A', "Ash");
     hashmap.put('V', "vini");
     hashmap.put('J', "Jiya");
     hashmap.put('A', "Adi");
     hashmap.put('A', "Aman");
     hashmap.put(null, "Shubham"); //not  shown bcoz only 1 null key is allowed
     hashmap.put(null, "Chaya");
     
     //to display
     System.out.println(hashmap);
     System.out.println("===========key contain in hashmap===================");
     
     boolean res=hashmap.containsKey('R');
     System.out.println(res);
     
     
     System.out.println();
     hashmap.remove('A');
     hashmap.replace('V',"Vini");
     
     System.out.println(hashmap);
     
     System.out.println("=========================");
     System.out.println("displaying the keys");
      //get all keys of hashmap
     Object[] keys =hashmap.keySet().toArray();
     System.out.println("\nkeys");
     for(int i=0; i<keys.length;i++)
     {
    	 System.out.println(keys[i]+ " ");    //to get key
    	 System.out.println(hashmap.get(keys[i]));  //to get names
    	 System.out.println();
    	// System.out.println("==============================");
     }
     
     System.out.println("==========================");
     System.out.println("to get one value....");
     System.out.println(hashmap.get('A'));
	}

}
