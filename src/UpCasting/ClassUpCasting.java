package UpCasting;

public class ClassUpCasting 
{

	public static void main(String[] args) 
	{
		
		
	/*	Father f = new Father();

		System.out.println("Father's Property.");
		f.car();
		f.bike();
		f.pager();
		f.H1();
		System.out.println("=======================");*/

		
		Son s = new Son();      //creating Son object === using Son reference (Son class)
		System.out.println("Son's Property.");
		s.car();
		s.bike();
		s.Mobile();
		s.pager();
		s.H1();  //father
		s.H2();   //Son
		System.out.println("=======================");
		
///left side(Father f1) is Reference of object
// right side (new Son()) is memory of object
//creating object of subclass and giving superclass ref.
		
		
		System.out.println("UP CAsting");
		Father f1 = new Son();     //using reference of SUperclass ===== creating object of Subclass
		f1.bike();    //common property of child & father
		f1.car();     //common property of child & father
		f1.pager();       //super class property
		f1.H1();         //superclass property
	//	f1.Pro();      //abstract method is from father & implement in SOn ...but showing FAther
		
		
		//f1.Mobile();
		
		System.out.println("=======================");
		
//Up casting--subclass property cannot access		
//Upcasting====Inheritence + Method Overriding
		
	}

}
