package UpCasting;

public class UpA extends UpB
{
	int u=8;
	public void add()
	{ 
		int a=10, b=50;
		System.out.println("Add of A+B ( cLass- A): "+(a+b));
	}
	
	public void sub()
	{
		long x=50000, y=23447;
		System.out.println("Sub of X-Y ( cLass- A): "+(x-y));
	}
	
	public void selfA()
	{
		System.out.println("I am class- A (Subclass-1).");
	}
	
	public  void mul()   //abstract method
	{
System.out.println("Mul of U(GV of UpCastA): "+(u*u));	
	}
}
