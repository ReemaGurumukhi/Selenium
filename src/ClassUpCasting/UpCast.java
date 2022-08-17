package ClassUpCasting;

public class UpCast extends DownCastC
{

	public static void main(String[] args)
	{
		UpCast up = new UpCast();
		up.add();
		up.sub();
		

	}

	
	public void add()
	{ 
		int a=60, b=60;
		System.out.println("Add of A+B: "+(a+b));
	}
	
	public void sub()
	{
		long x=100, y=80;
		System.out.println("Sub of X-Y: "+(x-y));
	}
	
	public void self()
	{
		System.out.println("I am Self (Up CAst) .");
	}
	
	public void UpClass()
	{
		System.out.println(" I am Sub Class ");
	}
	
}
