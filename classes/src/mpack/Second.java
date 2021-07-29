package mpack;
class calc
{
	int i;
	int j;
	int result;
	public calc(int i,int j)
	{
		this.i=i;
		this.j=j;
				
		System.out.println(i);
	}
	public void add()
	{
		result=this.i+this.j;
	}
}

public class Second {

	public static void main(String[] args)
	{
		calc obj = new calc(5,6);
		obj.i = 6;
		obj.j = 7;
		obj=new calc();
		obj.add();
		System.out.println("result is"+obj.result);
		

	}

}
