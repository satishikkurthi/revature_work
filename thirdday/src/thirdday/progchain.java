package thirdday;
class employee
{
 int id;
 String name;
 float salary;
 public employee(int id,String name)
 {
	 this.id=id;
	 this.name=name;
	 
 }
 public employee(int id,String name,float salary)
 {
	 this(id,name);
	 this.salary=salary;
 }
 public void calsal(int n)
 {
	 salary=salary*n;
 }
 
 
}

public class progchain {

	public static void main(String[] args)
	{
      employee e1= new employee(82,"hiiii",890);
      employee e2 = new employee(768,"hello",789766);
      e1.calsal(10);
      System.out.println(e1.salary);
      e2.calsal(10);
      System.out.println(e2.salary);
      
    		  
	}

}
