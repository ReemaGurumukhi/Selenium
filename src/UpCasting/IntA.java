package UpCasting;



public interface IntA extends IntB
{
	void name();
	void surname();
	void A();
}



//We cant give inner AM public

interface IntB 
{
 
	void name();
	void surname();
	void B();
	
}
