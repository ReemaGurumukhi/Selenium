package ClassUpCasting;

///////--------------Sub Class-2--------//////////

public class DownCastB extends DownCastA
{
	String name="B";
	
	public void add()
	{
		int a=90, b=10;
		System.out.println("Add of A+B ( cLass- B): "+(a+b));
	}
	
	public void sub()
	{  
		String name="HELLO!!";
		int i=30, j=60;
		System.out.println("Sub of I-J ( cLass- B): "+(i-j));
		System.out.println("GV String name: "+name);
	}
	
	public void selfB()
	{
		System.out.println("I am class- B (Sub Class-2).");
	}

	
}
