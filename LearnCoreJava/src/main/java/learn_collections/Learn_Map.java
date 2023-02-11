package learn_collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Learn_Map {

	@Test
	
	//HASH MAP
	
	public static void HashMap() {
		// TODO Auto-generated method stub
		
		Map<Integer, String> mymap = new HashMap<Integer, String>();
		
		mymap.put(1,"Ajay");
		mymap.put(2,"Balu");
		mymap.put(3, "Chandru");
		mymap.put(4, "Dinesh");
		
		
		//Converting to Set so that we can traverse using for loop
		Set<Map.Entry<Integer, String>> entryset = mymap.entrySet();
		
		//syntax
				//for(dataType item : array) {
				//    ...
				//}
		
		for(Map.Entry m :entryset)
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("***********************************");
		//entrySet() method in Java is used to create a set out of 
		//the same elements contained in the hash map. 
		//It basically returns a set view of the hash map 
		//or we can create a new set and store the map elements into them.

		//
		
		//using while loop to print
		
		Iterator var1 = entryset.iterator();
		
		while(var1.hasNext())
		{           
			Map.Entry mp =  (Map.Entry)var1.next();
		
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}
	
//am pssing some key and value and extract them using set collection
	//create a hashtable and pass the table to set collection and print
	//the key and value separately using iterator

	//HashTable
	
	public static void HashTable() {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> mymap = new Hashtable<Integer, String>();
		
		mymap.put(1,"Ajay");
		mymap.put(2,"Balu");
		mymap.put(3, "Chandru");
		mymap.put(4, "Dinesh");
	}
}
