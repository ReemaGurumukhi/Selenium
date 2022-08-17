package Array;

import java.util.Scanner;

public class ArrayMultiDimentional 
{

	public static void main(String[] args) 
	{
		///Array declaration + initialization47
		int a[][] = new int[][] {{1,2,3,4}, {5,6,7,8}, {8,9,1,2}, {3,4,5,6}}; //4x4
		
System.out.println("-------INT array (3x3)-----------");
		for(int i=0; i <=3; i++)                //i==(3) count for row--------0 1 2 3
		{
			for (int j=0; j<=3; j++)                 //j==(3) count for column--------0 1 2 3
			{
				System.out.print(a[i][j]+ "  ");
			}
		System.out.println();
		}

///////////////////////////////////////////////////////////////////////////////////////////////
		///Array declaration + initialization		
		char c[][] = new char[][] {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'}}; //4x3
		
		System.out.println("------------CHAR array (4x3)------------");
		
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(c[i][j]+ "  ");
			}
			System.out.println();
		}
		
///////////////////////////////////////////////////////////////////////////////////////////		
		
		///Array declaration + initialization	
	String s[][] = new String[][] {{"Hina", "Tina", "Gita"}, {"Sita", "Rita", "Riya"}}; 	// 2x3
		
	System.out.println("------------STRING array (2x3)----------------");
	
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(s[i][j] + "  ");
			}
			System.out.println();
		}
		
////////////////////////////////////////////////////////////////////////////////////		
	System.out.println();	
		///Array declaration + initialization
	int b[][] = new int[4][4];	  
	int sum=0;						/*store sum of array */     
	int d=2;      int e=5;			//divisible number
	
 Scanner r1 = new Scanner(System.in);
 {
		System.out.println("Enter Array Elements: ");
			for(int i=0; i<=b.length-1; i++)
			{
				for(int j=0; j<=b.length-1 ;j++)
				{
					b[i][j]=r1.nextInt();
				}
				
			}
		
		System.out.println("-----------Print User Define number-------------");
		for(int i=0; i<=b.length-1 ; i++)
		{
			for(int j=0; j<=b.length-1; j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();	
		}
///////////////////////////////////////////////////////////////////////////////		
		System.out.println();
		System.out.println("Reverse order:");
		for(int i=b.length-1; i>=0 ; i--)
		{
			for(int j=b.length-1 ; j>=0 ;j--)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
///////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		for( int i =0; i<=b.length-1 ; i++)
		{
			for(int j=0; j<=i ; j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
/////////////////////////////////////////////////////////////////////////////		
		System.out.println("------------numbers divisible by given number--------------");
		
		for(int i=0; i<=b.length-1 ; i++)
		{
			for(int j=0; j<=b.length-1; j++)
			{
				if (b[i][j] % d==0)       
					
				System.out.print(b[i][j]+ " ");
					sum= sum + b[i][j];
			}
			System.out.println();	
			
		}
		System.out.println("Sum of numbers divisible by " +d+ " : " +sum);
		
///////////////////////////////////////////////////////////////////////////////////////////			
		System.out.println();
		System.out.println("Numbers divisible by "+d+ " & "+e+ " : ");
		for(int i=0; i<=b.length-1 ; i++)
		{
			for(int j=0; j<=b.length-1; j++)
			{
				if (b[i][j] % d==0  || b[i][j] % e ==0)       
					System.out.print(b[i][j]+ " ");
					sum= sum + b[i][j];
			}
			System.out.println();	
			
		}
		System.out.println("Sum of numbers divisible by " +d+ " & " +e+ " : " +sum);	
			
////////////////////////////////////////////////////////////////////////////////////////			
	
			
			
			
		
}

	}
}
