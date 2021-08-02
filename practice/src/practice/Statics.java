package practice;

public class Statics
{
	
	
	int a;
	int b;
	public Statics(int a ,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void disp()
	{
		System.out.println(a+" "+b);
	}
	public void swap(Statics s2)
	{
		int t;
		t=s2.a;
		s2.a=a;
		a=t;
		 
		t=s2.b;
		s2.b=b;
		b=t;
		
	}
	public static void main(String[] args)
	{ 
		
		Statics s1=new Statics(1,2);
		Statics s2 = new Statics (3,4);
		s2.disp();
		s1.swap(s2);
		s1.disp();
		s2.disp();
		

	}

}
