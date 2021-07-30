package practice;

import java.util.Scanner;

public class Printstar
{
	public static void main(String args[])
	{
		Scanner sd = new Scanner(System.in);
		int z[] = new int[5];
		for(int i=0;i<z.length;i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
