package String;

import java.util.Arrays;

public class Array 
{
	public static void main(String[] args) 
	{
		/////-------I want to store city names
		
		/////--------1. Array Declaration
		String city[]= new String[5];

		
		/////---------2. Array Initialization
		city[0]= "Pune";
		city[1]= "Nagpur";
		city[2]= "Nashik";
		city[3]= "Goa";
		city[4]= null;
		
		////---------3. Usage
System.out.println("---------------String array---------------------------");		
	System.out.println(city[4]);
	//System.out.println(city[6]);    //ArrayIndexOutOfBoundsException
	System.out.println(city[3]);
	
////////////////////////////////////////////////////////////////////////////////////////////////	
System.out.println("-----------------Int Array----------------------------");	

/////////----------1. Array declaration
		int count[] = new int[7];


/////////----------2. Array initialization
		count[0]=10;
		count[4]= 0;
		
/////////----------3. Usage
		System.out.println(count[0]);
		System.out.println(count[4]);
		System.out.println();
	//	System.out.println(count[20]);     //////ArrayIndexOutOfBoundsException
///////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("-----------------Int Array----------------------------");	

//int age[] = new int[5];            //Array Declaration 

//We can access the element of an array using the index number. 
//Here is the syntax for accessing elements of an array,
int[] age = {12, 4, 5, 2, 5};     //create an array

// access each array elements
System.out.println("We can access the element of an array using the index number");
System.out.println("access array elements:\r\n"+ "array[index]");
System.out.println();
System.out.println("Accessing Elements of Array:");
System.out.println("First Element: " + age[0]);
System.out.println("Second Element: " + age[1]);
System.out.println("Third Element: " + age[2]);
System.out.println("Fourth Element: " + age[3]);
System.out.println("Fifth Element: " + age[4]);
System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("---------------Looping Through Array Elements-------------------");

//create an array
 int age0 []= {12, 4, 5,2};
//loop through the array
 // using for loop
 System.out.println("Print an Array Using FOR Loops:--------Int array");
 
 for (int i = 0; i < age0.length; i++)
 {
	//System.out.println(i);
	System.out.println(age[i]);
}

///////////////////////////////////////////////////////////////////////////////////////////////
 System.out.println("---------------Looping Through Array Elements-------------------");

/*int age1[] = new int[5];    //Array Declaration
  age1[0] = 20;            //Array Initialization
  age1[1] =30;
  age1[2] =40;
  age1[3] =50;
  age1[4] =60;*/
  System.out.println("Print an Array Using FOR Loops:--------Using Int Array ");
  int age1[] = {20,30,40,50,60};        //Array declaration +Initialization
  
  for (int i = 0; i < age1.length; i++)
  {
	System.out.print(age1[i]+ " ");
	
}
  //////////////////////////////////////////////////////////////////////////////////////////
System.out.println();
System.out.println();
System.out.println("---------------Looping Through Array Elements-------------------");


String name []= {"Reema", "Swati", "Shilpa", "Shrikant", "Swapnil", "Pankaj"};
//String name[]= new Name[] {"Reema", "Swati", "Shilpa", "Shrikant", "Swapnil", "Pankaj"};
System.out.println("Using For While Loop-------Using String array: ");
int i=0;
while (i < name.length) 
{
	System.out.println(name[i]);
	i++;
}
System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////
//Arrays is a pre-defined class given in java.util package which contains lots of 
//pre-defined methods related to the array, and they solves many common array task. 
//In Arrays class toString() method is given to display the elements of the given array in string format.
System.out.println("---------------Print an Array Using Arrays.toString()-------------------");


Integer[] intArray = {1,3,5,7,9};                  //integer array
String[] strArray = { "one", "two", "three" };                        //string array

//print each array and their corresponding length
System.out.println("Integer Array contents: " + Arrays.toString(intArray));    //to string method
System.out.println("The length of the Integer array : " + intArray.length);

System.out.println("String Array contents: " + Arrays.toString(strArray));
System.out.println("The length of the String array : " + strArray.length);
System.out.println(Arrays.toString(strArray));
System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("------------------------calculate the sum of array elements--------------------");
// declare array and initialize it with values
int a[] = {10,20,30,40,50};        	  //----------------------integer array
int sum=0;                           //------------------variable to store addition of array
	for (int j = 0; j < a.length; j++)        ////---------------------- add array elements
	{
		sum= sum + a[j]; 
	//	sum += a[j];
	}
	System.out.println("Sum of Array: "+sum);
	System.out.print("Print Integer array:  "+a[0]+ " "+a[1]+ " "+a[2]+ " "+a[3]+ " "+a[4]);

////////////////////////////////////////////////////////////////////////////////////
	//Creating anonymous arrays
	 System.out.println(); 
	 System.out.println("---------------Creating anonymous arrays-----------------");
    System.out.println(new int[]{1, 2, 3, 4, 5}.length);    //Output : 5

    System.out.println(new int[]{21, 14, 65, 24, 21}[1]);   //Output : 14
    
    System.out.println(new String[] {"REEMA", "SWAPNIL", "GURUMUKHI"}.length);
    System.out.println(new String[] {"REEMA", "SWAPNIL", "GURUMUKHI"} [2]);


	






	}

}
