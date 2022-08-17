package String;

public class stringBuffer 
{

	public static void main(String[] args)
	{
///---------Use of CAPCITY method---------///////////////
		System.out.println("-----Capacity method--------");
		
//The capacity method tells you
// many numbers of characters you can store in reference of object.

//The capacity is the amount of storage available for newly inserted characters,
//beyond which an allocation will occur.
		
	StringBuffer a= new StringBuffer("REEMA");	//by default size =16 
	StringBuffer a1= new StringBuffer(" GURUMUKHI");
	StringBuffer a2= new StringBuffer(" is Success in her Goal.");
//	StringBuffer a0= "REEMA";   //not acceptable
	
	////REEMA-----0 1 2 3 4------16+5=21 size
	System.out.println("Capacity of String A-----: "+a.capacity());
	System.out.println();
	
	
	///---------Use of Length method---------///////////////
			System.out.println("-----LENGTH method--------");	
	
//Length method tells how many number of character stores there are at present.
	System.out.println("Length of String: "+a.length());
	System.out.println();
		
		
	//---------Use of Append method---------///////////////
	System.out.println("-----APPEND method--------");			
		
//Append method String add next to the another String.
//(join the 2 string with String,int value, char, float, long, double, join multiple string)
	int x=40 , y=50;
	char c='G';
	//boolean b = false;
	System.out.println(a.append(a1));
//	System.out.println(a.append(a2,0,23));
	System.out.println("Append Method: "+a.append(a1));
	System.out.println(a.append(" I am Tester."));
	System.out.println(a.append(y));   //string + Int
	System.out.println(a.append(c));    //string + Int + char
	System.out.println(a.append(a1));    //string + Int + char + String
	System.out.println(a.append(false));   //string + Int + char + String  + Default value of boolean
	System.out.println(a.append("......"));
	System.out.println(a.append(a1,0 , 6));
//s-- the sequence to append.start the starting index of the subsequence 
//to be appended.end the end index of the subsequence to be appended
//	.append(charsubsequence s ,int start (startindex)  ,int end (endindex) )---syntax
	System.out.println("I like to do Testing." +a.append(" hello"));
	
	System.out.println(a2.append(a2));
	System.out.println(a1.append(a2, 4, 10));
	
	
////-----use of delete Method------///////
//Delete() delete the character of declaring first index no to last index no.
	
	

	
	
		
		
		
		
		
		
		
		
		
	}

}
