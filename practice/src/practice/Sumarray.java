package practice;

import java.util.Scanner;

public class Sumarray 
{
	public static void main(String args[])
	{
		int b=0;
		int a[] = new int[5];
		Scanner se = new Scanner (System.in);
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = se.nextInt();
		
		}
	
	for (int i = 0; i < a.length; i++) 
	{
          b += a[i];
         
          
	}
	   System.out.println(b);
	}

}
