package String;

public class InstanceOfOpertaor 
{
//////The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
/////Here, if objectName is an instance of className, the operator returns true. Otherwise, it returns false.
	
	public static void main(String[] args) 
	{
		//create variable of String Class
		String s ="Program";
		
		// checks if name is instance of String
		boolean b = s instanceof String;
		System.out.println("name is an instance of String: "+b);
		System.out.println();
		
		
		// create an object of Main
		InstanceOfOpertaor obj = new InstanceOfOpertaor();
		
		// checks if obj is an instance of Main
		boolean b1= s instanceof String;
		System.out.println("obj is an instance of Main: "+b1);
	}

}
