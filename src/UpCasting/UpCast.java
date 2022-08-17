package UpCasting;

public class UpCast implements IntA 
{
/////-------PArent class for another class------////
	public static void main(String[] args) 
	{
		System.out.println("-------------Multiple Inheritence-------");
		UpCast up = new UpCast();
		up.name();
		up.surname();
		up.A();
		up.B();
		up.own();
		
		
System.out.println();	
System.out.println("------------Upcasting (Interface= A)--------------");		
		IntA a = new UpCast();
		a.A();
		a.B();
		a.name();
		a.surname();
		
System.out.println();		
System.out.println("-------------------Upcasting ( interface- B)------------");
	IntB b = new UpCast();
	b.B();
	b.name();
	b.surname();
	}

	@Override
	public void B()
	{
	System.out.println("Interface B's Method");
	}

	@Override
	public void name()
	{
		System.out.println("Common method in all class.");
	}

	@Override
	public void surname() 
	{
		System.out.println("Common method in all class.");
	}

	@Override
	public void A() 
	{
		System.out.println("Interface A's method");
	}
	public void own()
	{
		System.out.println("IMplememted class own method");
	}

}



