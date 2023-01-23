package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Learn_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> mymap = new HashMap<Integer, String>();
		
		mymap.put(1,"Ajay");
		mymap.put(2,"Balu");
		mymap.put(3, "Chandru");
		mymap.put(4, "Dinesh");
		
		
		//Converting to Set so that we can traverse 
		Set<Map.Entry<Integer, String>> entryset = mymap.entrySet();
		
		//syntax
				//for(dataType item : array) {
				//    ...
				//}
		
		for(Map.Entry m :entryset)
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		//entrySet() method in Java is used to create a set out of 
		//the same elements contained in the hash map. 
		//It basically returns a set view of the hash map 
		//or we can create a new set and store the map elements into them.

		//
		
		
	}

}
