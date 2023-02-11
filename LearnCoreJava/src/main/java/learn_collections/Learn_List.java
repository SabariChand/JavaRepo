package learn_collections;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Learn_List 
{
@Test
public  static void LearnArrayList()
{
	//creating an Array
	//Arraylist,Linked list,vector can have duplicate values
	
	 ArrayList<String> a = new ArrayList<String>();
	 
	//Adding elements to an array
	 a.add("Sabari");
	 a.add("Java");
	System.out.println(a); 
	
	//removing an Array
	//a.remove(1);
	//System.out.println(a);
	
	//to get the value of the arrayList with index
	System.out.println(a.get(1));
	
	//to check whether the desired element is present in arralist
	System.out.println(a.contains("Jav"));
	
	//to get at what index the desired value is present
	
	System.out.println(a.indexOf("java"));
	
	
	//to check whether the list is empty
	System.out.println(a.isEmpty());
	
	// to check the size() of arrayLis
	System.out.println(a.size());
}
	
}
