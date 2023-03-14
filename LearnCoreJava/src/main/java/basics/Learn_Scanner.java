package basics;

import java.util.Scanner;

import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

public class Learn_Scanner {
	@Test
	public void stdinout() {
	Scanner scn = new Scanner(System.in);
	
	int i = Integer.parseInt(scn.nextLine());
	double d = Double.parseDouble(scn.nextLine());
	String s = scn.nextLine();
	
	System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
	}
}