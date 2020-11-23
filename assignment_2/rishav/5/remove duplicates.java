package rishav; 
import java.util.*; 

class prog4 { 

	static int[] removeDups(int[] vect) 
	{  
		Arrays.sort(vect); 
		int first = 1; 
		for (int i = 1; i < vect.length; i++) 
			if (vect[i] != vect[i - 1]) 
				vect[first++] = vect[i]; 
		for (int i = first; i < vect.length; i++) 
			vect[i] = Integer.MAX_VALUE; 

		return vect; 
	} 
	public static void main(String[] args) 
	{ 
		int[] vect = { 3, 5, 7, 2, 2, 5, 7, 7,11,11,13 }; 
		vect = removeDups(vect); 
		for (int i = 0; i < vect.length; i++) { 
			if (vect[i] == Integer.MAX_VALUE) 
				break; 
			System.out.print(vect[i] + " "); 
		} 
	} 
} 
