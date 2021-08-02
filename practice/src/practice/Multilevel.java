package practice;
class E
{
	/*private int x;
	public E()
	{
		x=1;
	}
	public E(int x)
	{
		this.x=x;
	}*/
	public void disp()
	{
		System.out.println("hii");
	}
}
class F extends E
{
	/* private int y;
	public F()
	{
		super();
	}
	public F(int x,int y)
	{
		super(x);
		this.y=y;
	}*/
	public void disp()
	{
		System.out.println("hiiiiii");
	}
}

public class Multilevel {

	public static void main(String[] args)
	{
	 E e1 = new F();
	 e1.disp();
	
	}

}
