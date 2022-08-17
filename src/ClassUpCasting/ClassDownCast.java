package ClassUpCasting;

public class ClassDownCast 
{
int p=0;
String na=" ";

	public static void main(String[] args)
	{
/////---------Create Parent Class Object---------////.//////
/*	    DownCastB b = new DownCastB();
		
		System.out.println("Noraml Inheritence--Class B acquire property of A & C.");
		System.out.println("========================================================");
		b.add();         //B's method
		b.sub();        //B's method
		b.selfB();         //B's method
		b.mul();         //A's Method
		b.selfA();       //A's Method
		b.selfC();      //C's Method
		b.cClass();      //C's method                           */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//==========================CLASS UP CASTING====================================

//PArent =====Class C   (MOst Super class)
//SubClass ====Class B (Sub class-1)
//SubClass ====Class C  (sub class-2)

//Using super class reference == creating Sub class object	
//Parent p = new Child();---------------------SYNTAX
		
System.out.println("//==========================CLASS UP CASTING====================================");		
System.out.println("-----------------child-A------Parent-C---------------------");		
DownCastC c= new DownCastA();
c.add();        //override method
c.sub();         //override method
c.cClass();             //C- subclass method
c.selfC();              //C- subclass method




		
//////////////////////////////////////////////////////////////////////////		
//=====================CLASS DOWN CASTING==============================//
System.out.println("####################################################################################");		
System.out.println("---------------------------------------Down Casting-----------------------------------------");
	//PArent =====Class C   (MOst Super class)
	//SubClass ====Class B (Sub class-1)
	//SubClass ====Class C  (sub class-2)
		
//Using sub class reference == creating Super class object
		
    //	DownCastB b1 = (DownCastB) new DownCastA();
		
	DownCastB b1 = (DownCastB) new DownCastA();
		
		
		System.out.println("=================PArent  methods (Supermost class) (C)================");
		b1.add();
		b1.sub();
		b1.selfB();
		
		System.out.println("===========Sub class(Super class) (A)==================");
		b1.mul();
		b1.selfB();
		
		
		System.out.println("===========Sub class (B)==================");
		b1.selfC();
		b1.cClass();  


		
		
		
		
		
		
		
		
		
		
	}

}



 
















