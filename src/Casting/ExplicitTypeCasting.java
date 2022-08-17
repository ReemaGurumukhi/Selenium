package Casting;

public class ExplicitTypeCasting 
{

	public static void main(String[] args) 
	{
		
		double x = 4078;   // double =8 byte
		System.out.println("Explicit Casting/ Narrowing Casting.");
		System.out.println("Value of X: "+x);
		
		int y=  (int) x;    //int = 4 byte   ------we have to cast  
		System.out.println("VAlue of Y: "+y);
		
		
		double z= 60.707f;     //double =8byte
		System.out.println("Value of Z: "+z);
		float zx = (float) z;          //float= 4 byte
		System.out.println("VAlue of ZX: "+zx);
		
	}
	


}
