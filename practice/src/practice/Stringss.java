package practice;

public class Stringss {;

	public static void main(String[] args) 
	{
		String s1 = new String("matrix max maximum");
		System.out.println();
		String s2 = new String(s1);
		char ch[]= {'a','b','c','d','e','f'};
		
		String s4 = new String(ch,2,3);
		s2=s1;
		
		
		System.out.println(s4);
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(1));
		System.out.println("matrhhhix".length());
		System.out.println(s2.toCharArray());
		System.out.println(s2);

	}

}
