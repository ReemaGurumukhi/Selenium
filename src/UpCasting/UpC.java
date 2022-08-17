package UpCasting;
///////////-------------Parent Class----------------///

public class UpC 
{
	
	public static void main (String[] args)
	{
		UpA a= new UpA();
		a.add();
		a.sub();
		a.selfA();
		a.mul();
		
		System.out.println("B's property");
		a.selfB();
		
		System.out.println("C's Property");
		a.cClass();
		a.selfC();
		
		
System.out.println("===========================================");
System.out.println("Up CAtsing: super class acquire common property of subclass.");

UpC c = new UpA();
c.add();   //common property
c.sub();
c.selfC();  //parent property
c.cClass();

System.out.println("===========================================");
System.out.println("A acquire property of Sub class B(Specific proeprty)");
UpC c1 = new UpB();
c1.add();
c1.sub();
c1.selfC();
c1.cClass();






	}
	
	
	public void add()
	{ 
		int a=35, b=25;
		System.out.println("Add of A+B: "+(a+b));
	}
	
	public void sub()
	{
		long x=10000, y=70000;
		System.out.println("Sub of X-Y: ( cLass- C)"+(x-y));
	}
	
	public void selfC()
	{
		System.out.println("I am class- C (Sub class-2).");
	}
	
	public void cClass()
	{
		System.out.println(" I am Class -C (Sub Class- C)");
	}
}
