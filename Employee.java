package javaPrograms;
import java.io.*;

public class Employee {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int eno;
	String ename;
	float sal;
	static String company;
	static float tot_sal;
	static {
		company="Infosys";
		tot_sal=0;
	}
	public void getInfo()throws Exception
	{
		System.out.println("enter the eno,ename,sal");
		eno=Integer.parseInt(br.readLine());
		ename=br.readLine();
		sal=Float.parseFloat(br.readLine());
		Employee.tot_sal+=sal;
	}
	public void displayInfo()
	{
		System.out.println("Employee Informationis:");
		System.out.println("Emp number\t=\t"+eno);
		System.out.println("Employee name\t=\t"+ename);
		System.out.println("salary\t=\t"+sal);
		System.out.println("company\t=\t"+company);
	}
	public  static void showTotal()
	{
		System.out.println("total salaries paid by the company="+tot_sal);
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*Employee e1=new Employee();
		Employee e2=new Employee();
		e1.getInfo();
		e2.getInfo();
		e1.displayInfo();
		e2.displayInfo();
		Employee.showTotal();*/
		//datatype arr[]=new dataype[size];
		Employee e[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			e[i]=new Employee();
			e[i].getInfo();
		
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Employee"+(i+1)+"Information is:"+i);
			e[i].displayInfo();
		}

	}

}
