package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Interview_Logic {

	public static void main(String[] args) 
	{
		
//----print array -------
		List<Integer> li = new ArrayList();
		li.add(3);           li.add(4);
		li.add(6);           li.add(1);
		li.add(7);           li.add(8);
	
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//-------in sorting
		System.out.println("========================");
		int primes[] = new int[] {100,90,4,1986,8,10,24};
		System.out.println("Integer array before sorting:");
		System.out.println(Arrays.toString(primes));
		System.out.println("sorting array in descending order");

		Arrays.sort(primes);
		for(int o:primes)
		{
			System.out.println(o);
		}
		
		System.out.println();
////////////////////////////////////////////////////////////
		System.out.println("==============================");
		
		Integer[] cubes = new Integer[] { 8, 27, 64, 125, 256 };

		System.out.println("Integer array before sorting : " + Arrays.toString(cubes));

		System.out.println("sorting array in descending order");
		
		Arrays.sort(cubes, Collections.reverseOrder());
		
		System.out.println("array after sorted in reverse order: " + Arrays.toString(cubes));
////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("============================================");
		// Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
  
        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);
  
        // Printing the array after sorting
        System.out.println("Modified arr[] : " + Arrays.toString(arr));
		
////////////////////////////////////////////////////////////////////////
System.out.println();
System.out.println("============================================");

//Custom input array
// It contains 8 elements as follows
int[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };

// Sort subarray from index 1 to 4, i.e.,
// only sort subarray {7, 6, 45, 21} and
// keep other elements as it is.
Arrays.sort(arr1, 1, 5);

// Printing the updated array which is
// sorted after 2 index inclusive till 5th index
System.out.println("Sort subarray from index 1 to 4, i.e.,");
System.out.println("Modified arr[] : " + Arrays.toString(arr1));
                  
////////////////////////////////////////////////////////////////////////////////
System.out.println();
System.out.println("============================");
//Note that we have Integer here instead of
// int[] as Collections.reverseOrder doesn't
// work for primitive types.
Integer[] arr2 = { 13, 7, 6, 45, 21, 9, 2, 100 };

// Sorts arr[] in descending order using
// reverseOrder() method of Collections class
// in Array.sort() as an argument to it

Arrays.sort(arr2, Collections.reverseOrder());

// Printing the array as generated above
System.out.println("Note that we have Integer here instead of");
System.out.println("int[] as Collections.reverseOrder doesn't");
System.out.println(" work for primitive types.");
System.out.println("Modified arr[] : " + Arrays.toString(arr2));
                  
}


	

}
