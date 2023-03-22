package sabarichand.LearnJavaStreams;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.testng.Assert;

public class Learn_Basics_Streams 
{
	
	public static void normal_array() {
		
		//count the number of names starting with A in the List
		
		   List<String> names=new ArrayList<String>();
		   names.add("Sabari");
		   names.add("Abilesh");
		   names.add("vignesh");
		   names.add("Aakash");
		   names.add("Aravind");
		   
		   int count =0;
		   
		   for (int i = 0; i < names.size(); i++)
		   {
			   String actual = names.get(i);
			   if(actual.startsWith("A"))
			   {
				   count++;
			   }
		}
		   
		   System.out.println(count);
	}
	
	public static void streamfilter()
	{

		   List<String> names=new ArrayList<String>();
		   names.add("Sabari");
		   names.add("Abilesh");
		   names.add("vignesh");
		   names.add("Aakash");
		   names.add("Aravind");
		   
		   //there is no life for itermediate operation if there is noe= terminal operation
		   //terminal operation will execute only if the inter operation filter retrns true
		   //how to use filter in stream API
		   
		   long count = names.stream().filter(s->s.startsWith("A")).count();
		   
		   System.out.println(count);
		   
		   System.out.println("******************");
		   
		   long d = Stream.of("Sabari","Abilesh","Aakash").filter(s ->
		   {
			   s.startsWith("A");
			   return true;
		   }).count();
		   System.out.println(d);
		   System.out.println("******************");
		   
		   //print all the names for ArrayList 
		   //foreach
		   names.stream().filter(n -> n.length()>4).forEach(n -> System.out.println(n));
		   
		   
		   System.out.println("******************");
		   //print the first result
		   names.stream().filter(n -> n.length()>4).limit(1).forEach(n->System.out.println(n)); 
	}
	
	public static void Uppercase() 
	{

		   List<String> names=new ArrayList<String>();
		   names.add("Sabari");
		   names.add("Abilesh");
		   names.add("vignesh");
		   names.add("Aakash");
		   names.add("Aravind");
		   
		   
		   //map
		   Stream.of("Monika","Chandler","Ross","Rachel","Joey","Phoebe","Janice").filter(s -> s.endsWith("e")).map(s->s.toUpperCase())
		   .forEach(s->System.out.println(s));
		   
		   System.out.println("*******************");
		   //print the names which has first letter as a with upper case and sorted
		   
		   //sorted
		   
		   List<String> namayae = Arrays.asList("Monika","Chandler","Ross","Rachel","Joey","Phoebe","Janice");
		   
		   namayae.stream().filter(s-> s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	public static void mergearraylist()
	
	{
		 List<String> arr1=new ArrayList<String>();
		   arr1.add("Sabari");
		   arr1.add("Venki");
		   arr1.add("Naveen");
		   arr1.add("Sugith");
		   arr1.add("Vanati");
		   
		   List<String> arr2 = Arrays.asList("Monika","Chandler","Ross","Rachel","Joey","Phoebe","Janice");
		   
		   Stream<String> stre = Stream.concat(arr1.stream(), arr2.stream());
		   
		   //merging two differnat lists and sort them
		  stre.sorted().forEach(n-> System.out.println(n));
		  System.out.println("****************************************");
		  
		  //to check a match if present in the mergred list
		  Stream<String> str = Stream.concat(arr1.stream(), arr2.stream());
		  
		  boolean flag = str.anyMatch(s-> s.equalsIgnoreCase("Monka"));
		  System.out.println(flag);
		  Assert.assertTrue(flag);
		  
		
		  
	}
	
	public static void collect()
	{
		 //map
		   List <String> ls = Stream.of("Monika","Chandler","Ross","Rachel","Joey","Phoebe","Janice").filter(s -> s.endsWith("e")).map(s->s.toUpperCase())
		   .collect(Collectors.toList());
		   System.out.println(ls.get(0));
		   
		   
		   //assignment
		   List<Integer>  values = Arrays.asList(3,2,6,8,9,7,5,6,4,3,1,6,2,3,4);
		   //print uniqur number from the array
		   //sort the array -give  me the 3rd index
		   values.stream().distinct().forEach(n-> System.out.println(n));
		   
		   //in sorted 
		  List<Integer> in= values.stream().distinct().sorted().collect(Collectors.toList());
		   
		  System.out.println("***********************");
		   System.out.println(in.get(2));
		   
		   
	}
	public static void main(String[] args)
	{
		//normal_array();
		//streamfilter();
		//Uppercase();
		//mergearraylist();
		collect();
		
		
	}

}
