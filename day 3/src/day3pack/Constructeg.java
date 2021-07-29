package day3pack;
class employee
{
	int id;
	String name;
	double salary;
	double bonus;
	double fullsal;
	String work;

	public employee()
	{
		System.out.println("hiii");
	}

	public void totalsal(int id,String name,double salary,double bonus)
	{
		this.id=id;
		this.name=name;
		
		fullsal = salary +bonus;
		
	}
	//using constructor chaining
	public void totalsal(int id,String name,double salary,double bonus,String work)
	{
		this(id,name,salary,bonus);
		this.work = work;
		fullsal = salary +bonus;
	}
}



public class Constructeg {

	public static void main(String[] args) 
	{
		employee e1 = new employee();
		System.out.println("the parametres we sent are "+e1.id +","+ e1.name);
		System.out.println("the salary is :");
		e1.totalsal(789,"satish",44500.98,564.98);
		System.out.println("employee details are:");
		System.out.println("id is "+e1.id+" and the name is " + e1.name);
		System.out.println("the salary is:");
		System.out.println(e1.fullsal);
		System.out.println("the second employee got work judgement");
		employee e2 =new employee();
		e1.totalsal(781,"ravi",46500.98,5649.98,"good");
		System.out.println();
		System.out.println("employee details are:");
		System.out.println("id is "+e2.id+" and the name is " + e2.name);
		System.out.println("the salary is:");
		System.out.println(e2.fullsal);
		System.out.println(e2.work);
		

	}


	}

}
