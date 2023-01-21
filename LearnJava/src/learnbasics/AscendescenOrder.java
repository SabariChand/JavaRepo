package learnbasics;

import java.security.DomainCombiner;
import java.util.Iterator;

public class AscendescenOrder {

	static void ascendingorder() {
		// TODO Auto-generated method stub
		int temp;
		int array[] = {10,100,200,500,15,5};
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] =array[j];
					array[j] =	temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for (int k = 0;k<array.length;k++)
		{
			System.out.println(array[k]);
		}
		int maximumnumber =array[array.length-1];
		System.out.println("Maximum number is"+" " +maximumnumber);
		
		int minimumnumber =array[0];
		System.out.println("Minimum number is"+" " +minimumnumber);
		

		int Third_minimumnumber =array[array.length-3];
		System.out.println("Third Minimum number is"+" " +Third_minimumnumber);
		
		System.out.println("***********************************************");
	}
	
static void descendinorder()
{
	int temp;
	int array[] = {10,100,200,500,15,5};
	for (int i = 0; i < array.length; i++) {
		for (int j = i+1; j < array.length; j++) {
			
			if(array[i]<array[j])
			{
				temp = array[i];
				array[i] =array[j];
				array[j] =	temp;
			}
		}
	}
	System.out.println("Descending  Order");
	for (int k = 0;k<array.length;k++)
	{
		System.out.println(array[k]);
	}
	
	
}

public static void main(String[] args) {
	ascendingorder();
	descendinorder();
}
}
