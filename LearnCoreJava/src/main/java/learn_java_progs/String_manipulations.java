package learn_java_progs;

public class String_manipulations {
	static void countofeachcharaters()
	{
		String s = "Welcome to @java123";
		int countofsmall =0;
		int countofCaps =0;
		int countofNum =0;
		int countofSpecial=0;
		for (int i = 0; i < s.length(); i++)
		{
			if ('a' <=s.charAt(i)&& s.charAt(i)<='z')
			{
			countofsmall++;	
			}
			else if ('A' <=s.charAt(i)&& s.charAt(i)<='Z')
			{
			countofCaps++;	
			}
			else if ('0'<=s.charAt(i) && s.charAt(i)<= '9') {
				countofNum++;
				
			}
			else
			{
				countofSpecial++;
			}
			
		}
		
		System.out.println("Count of caps = "+countofCaps);
		System.out.println("Count of small = "+countofsmall);
		System.out.println("Count of nums = "+countofNum);
		System.out.println("Count of special = "+countofSpecial);
		
	}
	
	static void initialcapsinastring()
	{
		String s ="welcome to java class";
		
		String s1 = s.substring(0,1).toUpperCase();
		String s2 =s.substring(1);
		String res = s.substring(0,1).toUpperCase()+s.substring(1);
		
		//System.out.println(s1);
		//System.out.println(s2);
		System.out.println(res);
	}
	
	static void anothermethodforinitcaps()
	{
		String s ="welcome to java class";
		
		String[] ar =s.split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < ar.length; i++) 
		{
		char c = ar[i].charAt(0);
		char capsc = Character.toUpperCase(c);
		String subString = ar[i].substring(1);
		sb.append(capsc).append(subString).append(" ");
		
		}
		
		String trim =sb.toString().trim();
		System.out.println("another Method for Init Caps = " +trim);
		
	}
     static String swapcase(String str)
     {
    	
    	 int strLen;
         if (str == null || (strLen = str.length()) == 0) {
             return str;
         }
         
         StringBuffer sb = new StringBuffer(strLen);
         
         char ch =0;
         for (int i = 0; i < strLen; i++) {
			ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch =Character.toLowerCase(ch);
			}
			else if(Character.isTitleCase(ch))
			{
				ch =Character.toLowerCase(ch);
			}
			
			else if(Character.isLowerCase(ch))
			{
				ch =Character.toUpperCase(ch);
			}
			sb.append(ch);
		}
         
         return sb.toString();
     }
	
	public static void main(String[] args) 
	{
		//countofeachcharaters();
		//initialcapsinastring();
		//anothermethodforinitcaps();
		String swap = swapcase("my name is BILLA");
		System.out.println(swap);
		
		}

}
