package String;

public class studyString 
{

	public static void main(String[] args)
	{
		
System.out.println("------------------length()--------------------------");
		String s = "Reema";
		String s1 ="Gurumukhi             ";
		String s2= "";
		System.out.println("Length of String: " +s.length());
		int i = s.length();
		System.out.println("length stored in reference var (i): "+i);
		System.out.println("Length of S1: "+s1.length());
		System.out.println("Length of S2: "+s2.length());
System.out.println();

System.out.println("----------------------toUpperCase()--------------------------");	

		String s3="good evening";
		System.out.println("Convert to Uppercase s3: "+s3.toUpperCase());
		System.out.println();
		String upper =s3.toUpperCase();
		System.out.println("COnvert UPPER vari in lowercase: "+upper.toLowerCase());
		System.out.println();
		
System.out.println("----------------------toLowerCase()--------------------------");	

		String s4="GOOD NIGHT!!!";
		System.out.println("Convert to LOwercase s4: "+s4.toLowerCase());	
		String lower=s4.toUpperCase();
		System.out.println("Convert to Uppercase "+lower);
		//String lower=null;
		//System.out.println("Convert to Uppercase "+lower+ "="+s4.toUpperCase());
		System.out.println();
		System.out.println("Uppercase = " +s4.toUpperCase()+ "  Length is: "+lower.length());
		System.out.println();
		
System.out.println("------------------------isEmpty()--------------------------");
		String p0="Reema";
		String p1="     ";
		String p2 ="";
		//String p3=null;
		
		System.out.println("TRUE--If length is zero");
		System.out.println("FALSE- if length is not 0");
		System.out.println("literal check of P0:------------ "+p0.isEmpty());
		System.out.println("literal check of P1:-------------- "+p1.isEmpty());
		System.out.println("literal check of P2:------------ "+p2.isEmpty());
	//	System.out.println("literal check of P3:------------- "+p3.isEmpty());
		System.out.println("literal check:------------- "+ "  ".isEmpty());
		
System.out.println("------------------------isEmpty()--------------------------");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
