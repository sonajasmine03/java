package javaPrograms;

public class Demo {
	public void increment(int x[]) {
		for(int i=0;i<x.length;i++)
		{
			x[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		int p[]= {10,20,30};
		System.out.println("Before function call");
		for(int i=0;i<p.length;i++)
			System.out.println(p[i]+" ");
		for(int i=0;i<p.length;i++)
			System.out.println(p[i]+" ");
		d.increment(p);
		System.out.println("After function call");
		for(int i=0;i<p.length;i++)
			System.out.println(p[i]+" ");

	}

}
