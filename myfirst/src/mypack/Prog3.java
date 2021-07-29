package mypack;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         if(s.contains("https"))
         {
        	 System.out.println("secure");
         }
         else {
        	 System.out.println("not secure");
         }
	}

}
