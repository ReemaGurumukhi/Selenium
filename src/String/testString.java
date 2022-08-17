package String;

public class testString extends studyString
{

	public static void main(String[] args)
	{
		studyString.main(args);   //string class calling in different class

		
		
		
char c[][]= new char[][] {{'a','b','c'},{'d','e','f'},{'g','h','i'} , {'j','k','l'}};  
		
		
		
		for(int i=0; i<=2 ; i++)
		{
		    for(int j=0 ; j<=2; j++)
		{
		    System.out.print(c[i][j] + " ");
		}
		System.out.println();
		
	}
	}

}
