package fifthday;
class over
{
	int x;
	int y;
	public void a(int x)
	{
		this.x=x;
		this.y=x;
	}
	public void a(int x ,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int b(int x)
	{
		this.x=x;
		return this.x;
	}
	public int b(int x,int y)
	{
		this.x=x;
		this.y=y;
		return this.x + this.y;
	}
	
	public void disp()
	{
		System.out.println(x+","+y);
	}
}

public class Areaprblm {

	public static void main(String[] args)
	{
		over o1= new over();
		o1.a(3);
		o1.a(6,7);
		//o1.a(4);
		o1.disp();
	
		
	}

}
