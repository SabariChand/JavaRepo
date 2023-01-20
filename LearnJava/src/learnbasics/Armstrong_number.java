package learnbasics;

import java.util.Scanner;

public class Armstrong_number
{
public static void main(String[] args) {
	
	//An Armstrong number is one whose sum of digits raised to the power three equals the number itself. 371,
		int n, a, i = 0, j=0;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number");
			n= input.nextInt();
			a= n;
		}
		
	while (a>0) {
		i= a%10;
		j = j+(i*i*i);
		a=a/10;
	
	}
	
	if(n==j)
	{
		System.out.println("Amstrong Number");
		
	}
	else
	{
		System.out.println("Not an armstrong number");
	}
}

	
	
}
