package day4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");
		String s2 = sc.nextLine();
		System.out.println(output(s2));

	}
	public static String  output(String s1)
	{
		String ar[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i =0 ;i<ar.length;i++)
		{
			if(ar[i].length()%2==1) 
			{
				 sb.append(ar[i].substring(0,ar[i].length()/2)).append(Character.toUpperCase(ar[i].charAt(ar[i].length())/2));
                // .append(ar[i].substring((ar[i].length())/2+1,(ar[i].length-1)))).append(" ");
			}
			else {
				 sb.append((ar[i].substring(0,(ar[i].length()-1)))).append(Character.toUpperCase(ar[i].charAt((ar[i].length()-1)))).append(" ");
			}
		
		 
		}
		return sb.toString();
	}


}
