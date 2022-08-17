package String;

public class stringStudy 
{
	//Strings in Java are Objects that are backed internally by a char array. 
	//Since arrays are immutable(cannot grow), Strings are immutable as well. 
	//Whenever a change to a String is made, an entirely new String is created.
	
	//private static final String Null = null;

	public static void main(String[] args) 
	{
		String s= "Reema";  		//Creating string without new Keyword
		String s1 = new String("GURUMUKHI      ");   //created using new Keyword
		
	
		//Use of Length Method
		System.out.println("-----------------------Length() method-----------------------------");
		System.out.println(s.length());
		System.out.println(s1.length());
		
		System.out.println();
		int myLength = s1.length();    //assign length of s2 in another reference variable
		System.out.println(myLength);
		
		System.out.println();
		
		String x="ABCDBFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Length of String X is: "+x.length());
		System.out.println();
		
		String s2="";
		System.out.println(s2.length());
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("REEMA".isEmpty());	
////when ever u get exception error ur code will not execute further.. code will break		
//// java.lang.NullPointerException -----error occur when NULL value is given to reference variable
	//	String s3 = null;
	//	System.out.println(s3.length());
		
/////-------------------Use of touppercase() method---------------------///////
		
System.out.println("----------------------toUpperCase()--------------------------");		
		String a="goodevening";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		
////to store in variable ---storing variable will be string
	String b = a.toUpperCase();
	System.out.println("STored in another(refernce) variable");
	System.out.println(b);
		
	
/////-------------------Use of toLowercase() method---------------------///////
System.out.println("----------------------toLowerCase()--------------------------");	
		System.out.println();
		String a1 = "GOOD NIGHT";
		System.out.println(a1.toUpperCase());
		System.out.println(a1);
		
		
/////used reference variable(b) which stored in reference variable (a)
System.out.println(b.toLowerCase());
		
		
/////---------------Use of equals() method----------------------//////
	String v0 = "Hello";      // memory allocation of v0 & v1  stored in same memory loctaion
	String v1 ="Hello";      //memory will get memory from CONSTANT
	String v2 = new String("Hello");   ///memory allocation of v2 & v3 different stored in non constant 
	String v3= new String ("Hello");     //memory will get memory from NONCONSTANT
	String v4 = new String("hello");
	String v5 = new String (" Hello");
//	String v6= Null ;      				//by default
	//String v7= new String (Null);      //by default
	String v8= new String ();
	
//whenever u use EQUAL==  then it will check memory location not content	
	System.out.println(v0==v1);    //compare memory location
	System.out.println();
	
	System.out.println("whenever u use EQUAL==  then it will check memory location not CONTENT");
	System.out.println(v0==v2);    //compared memory location 
	System.out.println(v1==v2);
	System.out.println(v1==v3);
	System.out.println(v2==v3);
	//System.out.println(v7==v6);      //Both are NULL Assign
	System.out.println(v3==v5);
	System.out.println(v0==v1);
	
//whenever u are creating with new keyword 	then memory location is allocate different	
//EQUAL() method compare content & case sensitivity not memory location
	
	
	System.out.println();
	System.out.println("EQUAL() method compare content & case sensitivity not memory location");
	System.out.println(v0.equals(v1));
	System.out.println(v2.equals(v3));
	System.out.println(v1.equals(v3));
	System.out.println(v1.equals(v4));
	//System.out.println(v6.equals(v8));          ///Null Pointer Exception
System.out.println("------------------------------------------");	

System.out.println("------------equalsIgnoreCase()-----------------");
	System.out.println(v3.equalsIgnoreCase(v4));     //case sensitivity will ignore
	System.out.println(v5.equalsIgnoreCase(v4));
//	System.out.println(v6.equals(v8));      //null pointer exception
	System.out.println("=============================================");
	
	
///////////contains() method use
//what ever char (checking content) are there is available or not	

	System.out.println("-------------contains() method------------------------");
	
	String d = "Velocity";       ///give char sequence
	System.out.println(d.contains("V"));    //sequence is follow in main string
	System.out.println(d.contains("Vlc"));     //specified sequence is must
	
	System.out.println(d.contains("city"));
	System.out.println(d.contains("vel"));
	System.out.println("Science".contains("nce"));
	System.out.println("=============================================");	
	
////////-----------------------isEmpmty() method use---------------------------------////////////////////////
	//whatever boolean method are there it will be true or false
	//length is ZERO then true.....or false
	String e0="Pune";
	String e1=" ";
	String e2=null;
	String e3="";
	String e4 =" Pune";

	System.out.println("---------------isEmpty() method---------------------");
	System.out.println(e0.isEmpty());
	
	//whatever method is in IS is will show boolean value ///if something has 0 value than TRUE or FALSE
	///NULL POINTER EXCEPTION_---------Bcoz ????????????????
	
	boolean result = e0.isEmpty();     //stored in ref object permenantly
	System.out.println(result);
	
	
System.out.println(e1.isEmpty());
//System.out.println(e2.isEmpty());    //null pinter exception
System.out.println(e3.isEmpty());
System.out.println("=============================================");	

/////////////////-------------------------------isBlank() method use----------------------------------/////////////////

//true if string is empty(empty +space) ...........or false 
System.out.println("---------------isBlank() method---------------------");
System.out.println(e0.isBlank());
System.out.println(e1.isBlank());
System.out.println(e3.isBlank());	
System.out.println("=============================================");	
	
///////-----------------------charAt() method use-------------------------//////////////
System.out.println("---------------------charAT()----------------------------");
//char @0------e   (velocity)
//char @ 3----o   

String w="Thane";   ///index ==0 1 2 3 4   //char @ particular Index
System.out.println(w.charAt(0));    //answer ---T
char ans=w.charAt(3);    //answer ----n
System.out.println(ans);
				//System.out.println(w.charAt(9));    //out of range...out of boundary
				////////ERROR-------java.lang.StringIndexOutOfBoundsException---------???????????????????????
				//when ever u are working out of length of string.......out of boundary
				//System.out.println(w.charAt(-1));	
System.out.println("=============================================");			

/////////---------------------endsWith() method use----------------------/////////
System.out.println("----------------------endsWith()------------------------------");
	//sequence will check   ///string ends with ??   ===== last sequence   ====it must be sequence the TRUE or false

String h = "abcd";   
System.out.println(h.endsWith("cbd"));
System.out.println(h.endsWith("d"));
System.out.println(h.endsWith("bcd"));	
System.out.println(h.endsWith("abcd"));
System.out.println();

//we cant use this in ENDS WITH METHOD
//System.out println("Gujarat".endsWith("art");
/////////---------------------startsWith() method use----------------------/////////
System.out.println("----------------------startsWith()------------------------------");

String y = "India";
String y1 = "World";    //////World ===== 0 1 2 3 4
System.out.println(y.startsWith("In"));
System.out.println(y.startsWith("in"));
System.out.println(y.startsWith("Ind"));
System.out.println(y.startsWith("Indiain"));
System.out.println(y.startsWith("dia", 2));      //stsrtswith(start prefix , int offset)
System.out.println(y.startsWith("dia", 3));      //buffer
System.out.println(y1.startsWith("orl",1));
System.out.println();
System.out.println("Hello" .startsWith("el",3));
//System.out.println("Hello" .startsWith(null));
//System.out.println(v6.startsWith(""));

//=============================System.out.println(y1.startsWith(string prefix));====boolean Answer
//=============================System.out.println(y1.startsWith(string prefix, int offset));


/////////---------------------subString() method use----------------------/////////
System.out.println("----------------------subString()------------------------------");

///sub---small
String m01= "Jai Javan JAi Kisan";
String m0="I love India";
String m= "Maharashtra";  ///MAha + ras2htra  -----subSTring use ///pass the index which u want as o/p
System.out.println(m.substring(4));

//divide string  --to do that we have to give index for sub string starting index
String str=m.substring(2);  // store in ref varible -----permanently
System.out.println(str);

System.out.println(m.substring(0, 4));   /////string index starts with 0 start index correct ===ending index===(index+1)
System.out.println(m.substring(6, 9));
System.out.println(m01.substring(4,12));
System.out.println();
//want MAHA o/p then start index=0 & ending index =(MAHA --0 1 2 3) (index+1)
//====================================System.out.println(m.substring(int beginIndex));   =======int answer
//====================================System.out.println(m.substring(int beginIndex, int endIndex));

////////------------------concat() method use------------------------///////////////////
String a0= "Gov of ";
String a2="India";
System.out.println(a0.concat(a2));
System.out.println(a0.concat("MAharashtra"));
System.out.println("===========================================");


//////////---------------indexOf() method use--------------------/////
System.out.println("-----------------indexOf()----------------");
String t= "Tea";
int index = t.indexOf('T');
System.out.println(index);
System.out.println(t.indexOf('a'));

String t1= "India is my country which is 2nd bigger";
System.out.println(t1.indexOf('n'));
System.out.println(t1.lastIndexOf('h'));
System.out.println(t1.lastIndexOf('i'));
System.out.println(t1.indexOf('g', 30));


System.out.println();
System.out.println(t1.charAt(7));

System.out.println("=============================");
String g= "null";
System.out.println("Reema".equals(g));
System.out.println("".equals(e2));
//System.out.println(g.equal("Reema"));   //Null Point Exception error
System.out.println(g.equals("Reema"));
System.out.println("============================");

////////--------------concat()-------------------/////////////

String m1="India";
String m2=" MAharashtra";
String m3= null;
System.out.println("---------------------concat()-------------------");
System.out.println(m1.concat(" - I love My Country"));

//System.out.println(m1.concat(null));     //null pointer exception

System.out.println(m2.concat(" Hello ").concat(g));
//System.out.println(m3.concat(null));     //null pointer exception
System.out.println(m2.concat(" Hello ").concat(g));
System.out.println(m3 + m2 + m1);        ///+ operator used
//System.out.println(m2.concat("Hell2"));

///////----------------indexof()-------------------------//////////////////
System.out.println(m1.replace("ia"," "));
System.out.println("India is my Country.".replace(" ","-----"));








}
}