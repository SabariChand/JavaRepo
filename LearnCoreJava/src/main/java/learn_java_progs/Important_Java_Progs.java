package learn_java_progs;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Important_Java_Progs 
{
	@Test(priority = 1)
	public static void ReverseWord()
	{
	
		String straight= "My name is Babari";
		String rev = "";
		String arr [] = straight.split(" ");
		int len = arr.length;
		
		for (int i =len -1;i>=0;i--)
		{
			rev+=" " + arr[i];
		}
		System.out.println(rev);
		
		System.out.println("*******************************");
	}
	@Test(priority = 2)
	public static void ReverseCharacter()
	{
		String name = "My computer is dell";
		
		String rev = "";
		
		int len = name.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev+=name.charAt(i);
		}
		System.out.println(rev.trim());
		System.out.println("*******************************");
	}
	
	@Test(priority = 3)
	public static void CountOfIntegersInString()
	{
		String alpha ="My scanner35 id is Aqd435";
		
		int count =0;
		
		for(int i =0;i<alpha.length();i++)
		{
			if(Character.isDigit(alpha.charAt(i)))
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of integer is"+ count);
		System.out.println("*******************************");
	}
	
	@Test(priority = 4)
	public static void FindDuplicates()
	{
		String str = "aassbbdd wewew rrrwwew";
		
		char ar[] = str.toCharArray();
		
		int len = str.length();
		
		for(int i =0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
				
			if(ar[i] == ar[j])
			{
				System.out.println(ar[i]);
				break;
			}
			
		}
	}
	
	@Test(priority = 5)
	
	public static void Incurrence()
	{
		String s = "Hello Hi Hello 111222 111222 111222 111222 ";
		
		String arr[] = s.split(" ");
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for(String kword:arr)
		{
			if(m.containsKey(kword))
			{
			int in =m.get(kword);
			m.put(kword,in+1);
			
			}
			
			else
			{
				m.put(kword,1);
			}
		}
		System.out.println(m);
		System.out.println("*******************************");
	}
	
	@Test(priority = -1)
	
	public static void AscenOrder()
	{
		int n [] = {55,100,10,5,555,5555};
		
		int temp = 0;
		
		for (int i = 0; i < n.length; i++) 
		{
			for (int j = 0; j < n.length; j++) 
			{
				if(n[i]<n[j])
				{
					temp = n[i];
					n[i]= n[j];
					n[j]= temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Elements of array sorted in order");
		for (int i = 0; i < n.length; i++) {     
            System.out.print(n[i] + " ");    
        }    

	}
	
	@Test(priority = -2)
	public static void NumberTriangle()
	
	{
		int num;
		for (int i = 0; i < 5; i++) {

			num = 1;

			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;

			}
			System.out.println();
		}

	}
	
}
