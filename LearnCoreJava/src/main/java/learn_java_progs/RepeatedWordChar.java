package learn_java_progs;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class RepeatedWordChar {

	public static void main(String[] args) 
	{
		
		String str = "My name is Billa";
		char [] ch =str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c:ch)
		{
			if(charMap.containsKey(c))
			{
				Integer it =charMap.get(c);
				charMap.put(c, it+1);
				
			}
			else
			{
				charMap.put(c, 1);
				
			}
			Set<java.util.Map.Entry<Character, Integer>> entryset = charMap.entrySet();
			System.out.println("List of duplicate characters0");
			
			for (Map.Entry<Character, Integer> entry : entryset) {
				if(entry.getValue()>1)
				{
				Character key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println(key+ "=" + val);	
				
			}
				
		}
	}
}

}