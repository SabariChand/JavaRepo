package learn_java_progs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Running_Sum {

public static void main(String[] args) {
	
}
{
	 {
		 
		 	int n; // size of the array
		    Scanner sc = new Scanner(System.in); // scanner object
		    System.out.print("Enter the number of elements: ");
		    n = sc.nextInt(); // reading size from user
		    int[] nums = new int[n]; // creating array of size n
		
		    for(int i = 0; i < n; i++) {
		      nums[i] = sc.nextInt(); // reading array elements from user
		    }
		 
	        int[] result  = new int[nums.length];

	        result[0] = nums[0];
	        for(int i=1;i<nums.length;i++)
	        {
	            result[i]=result[i-1] +nums[i];
	        }

	        System.out.println("The Sum of running array"+result);
	        

	    }
	}
}

