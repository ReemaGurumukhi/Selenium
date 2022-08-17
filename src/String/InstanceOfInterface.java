package String;

public class InstanceOfInterface 
{

	public static void main(String[] args) 
	{
		//create object of implement class
		test t = new test();
		
		//check object (t) is instance of class (test) 
		// checks if the object of interface
	    // is also an instance of implement class
		System.out.println(t instanceof A1);
		System.out.println(t instanceof test);
	}

}

////////--------------Interface----------------------//////
interface A1
{
	
}

/////////-----------Implement class----------/////////

class test implements A1
{
	
}