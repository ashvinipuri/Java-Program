package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// collection of integer array,sorted and unique i.e if we write multiple times of Ashvini it will show only once
		//TreeSet<Integer> tree1=new TreeSet<Integer>();
		
		TreeSet<Integer> tree1=new TreeSet<>();
		tree1.add(10);
		tree1.add(20);
		tree1.add(17);
		tree1.add(88);   // it will print only once bcoz no duplicate allowed
		tree1.add(88);   
		tree1.add(88);
		tree1.add(88);
		tree1.add(88);
		
		
		System.out.println("size is " + tree1.size());
		
		Iterator itr =tree1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("using enhanced for loop");
		for(int i:tree1)
		{
			System.out.println(i);
		}
		System.out.println("==============================");
		System.out.println("using sop");
		System.out.println(tree1);
		
		//to remove the object
		tree1.remove(17);
		System.out.println("First element removed");
		
		System.out.println("first " + tree1.first());
		System.out.println("Last " + tree1.last());
		
		//System.out.println("============== is element contains trur/false==============");
       // System.out.println(tree1.contains(33));
        
       // System.out.println("==========clear elements===============");
        tree1.clear();
      //  System.out.println("all elements clear");
        
        
       // System.out.println("=================is empty=============");
        System.out.println(tree1.isEmpty());
}

}
