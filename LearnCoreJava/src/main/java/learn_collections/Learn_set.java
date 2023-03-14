package learn_collections;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Learn_set 
{

	@Test
	public static void  Learnset()
	{
		
		HashSet< String> a = new HashSet<String>();
		
		
		//Adding elements to a set
		 a.add("UK");
		 a.add("USA");
		 a.add("USA");
		System.out.println(a); 
		
		//removing an element in a set
		//a.remove(1);
		//System.out.println(a);

		//to print using iterator
		
		Iterator<String> var = a.iterator();
		
		while(var.hasNext())
		{
			System.out.println(var.next());
		}
		//to check whether the desired element is present in set
		System.out.println(a.contains("Jav"));

		
		//to check whether the set is empty
		System.out.println(a.isEmpty());
		
		// to check the size() of arrayLis
		System.out.println(a.size());
	}
}
