package String;

public class InstanceOfInheritence 
{
//The instanceof operator in Java is used to check 
//whether an object is an instance of a particular class or not.
//objectName instanceOf className;
//Here, if objectName is an instance of className , the operator returns true .
//Otherwise, it returns false .
	
	
// Java Program to check if an object of the subclass
// is also an instance of the superclass	
	
	public static void main(String[] args) 
	{
		///create object of subclass
		B obj = new B();
		
		//check if obj is instance of B
		System.out.println(obj instanceof B);
		
		//check if obj is instance of A
		System.out.println(obj instanceof A);

	}

}

//////----------Sub class-------------/////////
class B extends A     // use inhertence
{
	
}



///////---------Superclass---------/////////
class A
{
	
}