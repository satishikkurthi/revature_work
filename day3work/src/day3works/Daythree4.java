package day3works;

import java.math.*;
import java.util.Scanner;

public class Daythree4 {

	public static void main(String[] args)
	{
		Scanner scc = new Scanner(System.in);
		System.out.println("enter the values:");
		float a =scc.nextFloat();
		float b =scc.nextFloat();
		float c;
		c= a*a+b*b;
		double hypo= (double) Math.sqrt(c);
		System.out.println(hypo);
				
		
	

	}

}
