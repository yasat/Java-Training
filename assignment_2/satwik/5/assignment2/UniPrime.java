package assignment2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UniPrime {
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<>(); //initially creating a array list to store values
		Set<Integer> uniprimes = new LinkedHashSet<>();  //to maintain the same order, linked hash set is used
		primes.add(3);primes.add(5);primes.add(7);primes.add(5);primes.add(3); 
		Iterator<Integer> it = primes.iterator(); 
		while(it.hasNext()) {
			uniprimes.add(it.next()); //while iterating through all primes, adding them to Linked hash set which updates duplicates
		}
		System.out.println("All primes: "+primes);
		System.out.println("Unique primes: "+uniprimes);
	}
}
