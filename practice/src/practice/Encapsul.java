package practice;

public class Encapsul
{
	private int empid;
	private String empname;
	private Double empsalary;
	int a=5;
	
	public int idshow(int empid)
	{
		this.empid = empid; 
		return this.empid;
	}
	public String nameshow(String empname)
	{
		this.empname=empname;
		return this.empname;
	}
	public double salaryshow(double empsalary)
	{
		this.empsalary=empsalary;
		return this.empsalary;
		
	}
	public void setid(int id)
	{
		empid=id;
	
		
	}

   
	
	

public static void main(String args[])
{
	Encapsul e1 = new Encapsul();
	e1.idshow(547744774);
	e1.nameshow("satish kumar");
	e1.salaryshow(65000);
	System.out.println("empname:"+e1.empname+" empname:"+e1.empid+" empsalary:"+e1.empsalary);
	e1.setid(98765);
	System.out.println(e1.empid);
	System.out.println(e1.a);
}

}

