package practice;
class out
{
	  private int b;
	 public int setb(int b)
	 {
		 this.b=b;
		return this.b;
	 }
}

public class First {
	private int a;
	/*public void seta(int a)
	{
		this.a=a;
		
	}*/
	public int disp() {
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) 
	{
		First f1 = new First();
		f1.a=8;
		System.out.println(f1.a);
		//f1.seta(5);
		f1.disp();
		out o1= new out();
		o1.setb(7);
		System.out.println(f1.disp());
		System.out.println(o1.setb(4));
		o1.b=8;
		System.out.println(o1.b);
		
		

	}

}
