package rishav;
import java.io.*; 
import java.util.*; 

public class prog2{ 
	public static void main(String[] args) 
	{ 
		ArrayList<Integer> arrayli = new ArrayList<Integer>(); 
		arrayli.add(1); 
		arrayli.add(3); 
		arrayli.add(5); 
		arrayli.add(7); 
		arrayli.add(9); 
		System.out.print("Elements before reversing: "); 
		printElements(arrayli); 
		Collections.reverse(arrayli); 
		System.out.print("\nElements after reversing: "); 
		printElements(arrayli); 
	} 
	public static void printElements(ArrayList<Integer> alist) 
	{ 
		for (int i = 0; i < alist.size(); i++) { 
			System.out.print(alist.get(i) + " "); 
		} 
	} 
} 
