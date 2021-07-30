package practice;

import java.util.Scanner;

public class Primenum {
	public static void main(String args[])
	{
		//Scanner sf = new Scanner(System.in);
		//Scanner sg = new Scanner(System.in);
		//int n;
		//System.out.println("eneter value of n");
		//n = sf.nextInt();
		int x[] = {2,3,93,4,5,6,7,11,22,44,2,54,78,93};
		for(int i=0;i<x.length;i++)
		{
			int k =0;
			for (int j = 2; j <x[i] ; j++)
			{
				if(x[i]%j==0)
				{
					k+=1;
					break;
				}
			}
		 if(k==0)
		 {
			 System.out.println(x[i]);
		 }
		}
	}

}
