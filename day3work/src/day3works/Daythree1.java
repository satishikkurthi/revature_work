package day3works;

import java.util.Scanner;

public class Daythree1 {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String s1 ="https://en.wikipedia.org/wiki/Main_Page";
	String s2 = sc.nextLine();
	System.out.println(s2);
	if(s1.equals(s2))
	{
		System.out.println("you got the right address");
		System.out.println("en.wikipedia.org");
	}
	else
	{
		System.out.println("you got the wrong addresss");
	}

	}

}
