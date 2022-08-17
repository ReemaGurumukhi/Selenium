package Array;

import java.util.Arrays;

public class arrayStudy 
{

	public static void main(String[] args) 
	{
		
		int a[]= {5, 4, 6, 7, 8, 9,3,12,45,78, 67,35,23,15};              //with out new keyword   -----------Declaration+ initialiazation
		int a1[] = new int[10];            // with new keyword  -------declaration
		
		a1[0]= 100;
		a1[1]= 20;
		a1[2]= 30;
		a1[3]= 40;
		a1[4]= 50;           //Initialization
		
		//-------------Usage
		System.out.println("Print Length: "+a1.length );
		System.out.println();
		System.out.println("Print Length of A: "+a.length);
		
		System.out.println("Printing with NEW keyword: " +a1[0]+ " "+ a1[1]+ " "+a1[2]+ " "+ a1[3]+ " "+a1[4]);   
		
		System.out.println("Printing without keyword: " +a[0]+ " "+ a[1]+ " "+a[2]+ " "+ a[3]+ " "+a[4]);
		
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Using For Loop (using New Keyword object): ");
		System.out.print("Value of Int Array:----- ");
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.print(a1[i]+ " ");
			
			//System.out.println("Index of I: "+i);
		}
		System.out.println();
		System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("----------calculate the ADD of array elements--------------------");
		// declare array and initialize it with values
		int sum=0;                                //------------------variable to store addition of array
		for (int i = 0; i < a1.length; i++)        ////---------------------- add array elements
		{
			sum = sum+ a1[i];                     ////sum
			sum +=a[i];
		}
		System.out.println("Sum of Array: "+sum);
		System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("----------Display in Decending order--------------------");
		System.out.print("Int Array in reverse(static coding):--------------- ");
		for (int i = 9; i >=0; i--) 
		{
			System.out.print(a1[i] + " ");
		}
		
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println();
		System.out.print("Using For Loop (without Keyword object):------ ");	
		
		for (int i = 0; i <=a.length-1; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////
	
		char b0[] = {'z', 'y', 'x', 'v','u'};
		
	char b[] = new char[5];	 //Declaration
	b[0]='A';	
	b[1]='B';
	b[2]='C';
	b[3]='D';
	b[4]='E';               ///Initialization
	System.out.println("-----------------------Char Array----------------------");
	System.out.print("VAlue of Char: "+b[0]+ " "+b[1]+ " "+b[2]+ " "+b[3]+ " "+b[4]);
	System.out.println();
	System.out.println("Length of Char: "+b.length);
	System.out.println();
	
	System.out.print("Length of Char(with NEW keyword):----- ");
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+ " ");
		}
		
	System.out.println();
	System.out.print("Length of Char(without keyword):------ ");
	for (int i = 0; i < b0.length; i++)
	{
		System.out.print(b0[i]+ " ");
	}

////////////////////////////////////////////////////////////////////////////////////////////	
	System.out.println();
	System.out.print("Reverse of Char:------ ");
	for (int i = 4; i >=0; i--) 
	{
		System.out.print(b[i]+ " ");
	}
	System.out.println();
	System.out.println();
//////////////////////////////////////////////////////////////////////////////	
	
	float[] f = new float[] {1.1f, 1.2f, 1.3f , 1.4f , 1.5f , 0.0f};   //declaration + initialization
	
	System.out.println("------------Float Array----------------");
	System.out.println("Length of Float Array: "+f.length);
	System.out.println();
	System.out.print("Value of Float Array:----------");
	for (int i = 0; i < f.length; i++) 
	{
		System.out.print(f[i]+ " ");
	}
	System.out.println();
		
	System.out.print("Reverse of Float:---------");
	for (int i = 5; i >0; i--) 
	{
		System.out.print(f[i]+ " ");
	}
	System.out.println();System.out.println();
	
	float add=0f;
	System.out.print("Add of Float Array:------");
	for (int i = 0; i < f.length; i++) 
	{
		 add= add + f[i];     
	}
	System.out.println(add);
	System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////
System.out.println("print float to String form : "+Arrays.toString(f));    //
System.out.println("print Int to String form: "+Arrays.toString(a1));
System.out.println("print Char to String form: "+Arrays.toString(b));

////////////////////////////////////////////////////////////////////////

String[] city= new String[]  {"Pune","Nashik","Goa", "Dhule", "Beed"};    //declaration + initialization
System.out.println("print String to String form:"+Arrays.toString(city));


System.out.println();
String s[] = new String [] {"Reema" ,"Hello", "Hi", "Girl","Boy","India"};

//ystem.out.println(s[0]);
System.out.println("Length of String:  "+s.length);
System.out.println();

//////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("====================================");
String name[][] = {{"R","i","y","a","s"}, {"R","o","h","a","n"},{"A","B","C","E","D"}, {"E","F","G","H","I"}, {"J","K","L","M","N"},{"O","P","Q","R","S"}};

for(int i=0 ; i<=5 ;i++)
{
	for(int j=0 ; j<= 4;j++)
	{
		System.out.print(name[i][j]+ " ");
		//System.out.print(name[i][j].toLowerCase().replace('r','@').contains("s") + " ");
		
	}
	System.out.println();
}
System.out.println("=====================================");
String name1[][] = {{"Hello","Hello","Hello","Hello","Hello","Hello"}, {"Hello","Hello","Hello","Hello","Hello","Hello"},{"Hello","Hello","Hello","Hello","Hello","Hello"}, {"Hello","Hello","Hello","Hello","Hello","Hello"}, {"Hello","Hello","Hello","Hello","Hello","Hello"},{"Hello","Hello","Hello","Hello","Hello","Hello"}};

for(int i=0 ; i<=5 ;i++)
{
	for(int j=0 ; j<= i; j++)
	{
		System.out.print(name1[i][j].concat(" Reema!!")+ " ");
	}
	System.out.println();
}
System.out.println();
// int i = 0;
//int j = 0;
System.out.println("Print concat : "+ name1[1][1].concat(" Reema"));
System.out.println("Print concat & count of index: "+ name1[1][1].concat(" Reema").indexOf('a')+ " ");

System.out.println();

System.out.println("=============================");

String Name[][]= {{"Swati", "Swati", "89097656".concat(" HELLO").concat(" Pune")}, {"Reema", "Reema","6790-088".concat(" HELLO").concat(" Pune")} ,{"Shilpa", "Shilpa","6790-088".concat(" HELLO").concat(" Pune")},{"shrikant", "shriknat","6790-088".concat(" 'HELLO").concat(" Pune")}, {"swapnil", "swapnil","6790-088".concat(" HELLO").concat(" Pune")},{"PAnkaj", "PAnkaj","6790-088".concat(" HELLO").concat(" Pune")} ,{"Rupali", "Rupali","6790-088".concat(" HELLO").concat(" Pune")}};

for(int i=0 ; i<=6 ;i++)
{
	for(int j=0 ; j<=2; j++)
	{
		System.out.print(Name[i][j]+ " ");
	}
	System.out.println();
}




	}

}
