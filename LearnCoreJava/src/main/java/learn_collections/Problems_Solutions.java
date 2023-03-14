package learn_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class Problems_Solutions {

	@Test
	public static void Find_Uniquw()
	{
		int ar [] = {4,5,5,5,4,6,9,4};
		
		ArrayList<Integer> ab= new ArrayList<>();
		
		
		for (int i = 0; i < ar.length; i++) 
		{
			int k =0;
			if(!ab.contains(ar[i]));
				ab.add(ar[i]);
				k++;
			for (int j = i+1; j < ar.length; j++) 
			
			{
			
				 if (ar[i]==ar[j])
				 {
					k++; 
				 }
			}
			System.out.println(ar[i]);
			System.out.println(k);
			
			if(k==1)
			{
				
			}System.out.println("Unique number is "+ar[i]);
		}
		
		
		
	}
}
