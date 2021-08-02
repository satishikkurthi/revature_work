package practice;
class A
{
	int a;
	public A(int a)
	{
		this.a=a;
	}
	public void set(int a)
	{
		this.a=a;
	 
	}
	public void disp()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int a;
	int b;
	public B(int a,int b)
	{
		
		super(1);
		this.b=b;
	}
	
	public void set(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public void disp()
	{
	
		super.disp();
		System.out.println(b);
	}
}


public class Inherit 
{

	public static void main(String[] args)
	{
		A a1 = new A(2);
		 B b1 = new B(4,5);
		/* b1.set(1,2);
		 b1.set(10);
		 a1.set(11);
		 b1.set(10);*/
		 b1.disp();
		// a1.disp();
		 b1.disp();
		 
		 
		

	}

}
