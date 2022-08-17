package ClassUpCasting;

///////////////-------Parent Class (SUper most)--------/////////////////////

public class DownCastC 
{
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
		System.out.println("I am class- C (Super most class).");
	}
	
	public void cClass()
	{
		System.out.println(" I am Class -C (Super most Class- C)");
	}
	
}
