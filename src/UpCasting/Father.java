package UpCasting;

public abstract class Father 
{

	public void car()
	{
		int a=60;
		System.out.println("Father's Car=====Maruti-800");
	}
	
	public void bike()
	{ 
		String s="Hello!";
		System.out.println("FAther's Bike=====LUNA.");
	}
	
	public void pager()
	{
		float f = 40.89f;
		System.out.println("Father's Pager=======Pager");
	}
	public void H1()
	{
		System.out.println("Fathers House.");
	}
	
	public abstract void Pro();   //incomplete
}
