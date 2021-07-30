package day4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the string");
	String s1 = sc.nextLine();
	System.out.println(output(s1));
	 System.out.println(sc.toString());
	

	}
	public static String  output(String s1)
	{
		StringBuilder sb=new StringBuilder();
		String ar[] = s1.split(" ");
		
		for(int i =0 ;i<ar.length;i++)
		{
			 sb.append((ar[i]).substring(0,(ar[i].length()-1))).append(Character.toUpperCase(ar[i].charAt((ar[i].length()-1)))).append(" ");
			 
			 
		  
		
		}
		return sb.toString();
	}

}
