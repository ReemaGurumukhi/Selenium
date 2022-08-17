package Array;

import java.util.Scanner;

public class ArrayPractice 
{

	public static void main(String[] args) 
	{
		int a[][] = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
		
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=i ;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

/////////////////////////////////////////////////////////////////////
		System.out.println("=================================");
		
		
		int sum=0 , sub=0 , mul=1;
		int a1[][] = {{1,2,3}, {2,3,3}, {3,4,5}, {6,7,8,9}};
		
		for(int i=0; i<=3 ;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(a1[i][j] + " ");
				sum= sum + a1[i][j];
				sub -= a1[i][j];
				mul = mul * a1[i][j];
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum of array: "+sum);
		System.out.println("Sub of array: "+sub);
		System.out.println("MUL of array: "+mul);
///////////////////////////////////////////////////////////////////////////////
		System.out.println();	
		///Array declaration + initialization
	int b[][] = new int[4][4];	  
	  
	int d=2;      int e=5;			//divisible number
	
 Scanner r1 = new Scanner(System.in);
 {
		System.out.println("Enter Array Elements: ");
			for(int i=0; i<=b.length-1; i++)
			{
				for(int j=0; j<=i ;j++)
				{
					b[i][j]=r1.nextInt();
				}
				
			}
		
		System.out.println("-----------Print User Define number-------------");
		for(int i=0; i<=b.length-1 ; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();	
		}
/////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("-------------------In recerse order-------------");
		for(int i=b.length-1; i>=0; i--)
		{
			for(int j=i; j>=0; j--)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();	
		}
/////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
}
	

	

