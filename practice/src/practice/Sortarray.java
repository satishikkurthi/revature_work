package practice;

import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) 
	{
		Scanner sg = new Scanner(System.in);
		int v[] = {5,1,2,6,4,9,3};
		for(int i = 0;i<v.length-1;i++)
		{
			for(int j=i+1;j<v.length;j++)
			{
				if(v[i]>v[j])
				{
					int t = v[i];
					v[i]  = v[j];
					v[j]= t;
				}
			}
		}
		for(int k=0;k<v.length;k++)
		{
			System.out.println(v[k]);
		}
	}

}
