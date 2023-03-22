package learn_java_progs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Number_Range 
//Learnt from Naveem automation labs
{
 public static void main(String[] args) 
 {
	System.out.println(Arrays.toString(between(2, 5)));
}
 
 public static int[]  between(int num1, int num2)
 {
	 
	 
	return IntStream.rangeClosed(num1, num2).toArray();
	 
 }
}
