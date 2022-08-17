package UpCasting;

public class InterfaceUpcast extends UpCast
{

	public static void main(String[] args) 
	{
		InterfaceUpcast iu = new InterfaceUpcast();
		
		System.out.println("Multilevel Inheritence----using INTERFACE.");
		System.out.println("===============================");
		iu.name();        
		iu.surname();
		iu.city();        
		iu.A();        //Interface A
		System.out.println();
		iu.B();         //Interface A
		System.out.println();
		iu.own();      //Implementation class own method
		
/////////////////////////////////////////////////////////////////////
//////----------Up CAsting---------------------///////

//using parent class refernce == and creating object of subclass
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("====================Up Casting=====================");
	UpCast ac = new InterfaceUpcast();
	ac.name();
	ac.surname();
	ac.own();       //Implement class Own Property
	ac.A();       //Interface A property-----implement class property
	ac.B();       //Interface B property-----implement class property
	
	

	
	
		
		
		
		
	}
	
	public void name()
	{
		System.out.println("Reema");
	}

	
	public void surname() 
	{
		System.out.println("Gurumukhi");
	}
public void city()
{
	System.out.println("PUNE.");
}

}
