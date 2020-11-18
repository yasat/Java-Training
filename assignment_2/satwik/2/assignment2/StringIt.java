package assignment2;

import java.util.HashSet;
import java.util.Set;

public class StringIt { //using static values for simplicity.. so, they can be used anywhere without objects.
	static Set<String> hs = new HashSet<>(); //Using hash set to eliminate the same strings
	
	static void seq(String st, String ad) {  //using recursion to pick values from each layer
		if(st.length()==0) {
			if(ad=="") { //In the final method call, ad will be empty string
				return;
			}
			hs.add(ad);
			return;
		}
		seq(st.substring(1),ad+st.charAt(0)); //calling by appending first element to addable variable
		seq(st.substring(1),ad); //calling by not appending first element to the addable variable
	}
	
	public static void main(String[] args) {
		String st = "abc"; //can make dynamic using scanner class or by passing argument from command line
		
		seq(st,""); //passing empty adder variable to get single length strings
		System.out.println(hs);
		
		String st1 = "aaa"; //can make dynamic using scanner class or by passing argument from command line
		hs.clear(); //clear linked hash map for new example
		seq(st1,""); //passing empty adder variable to get single length strings
		System.out.println(hs);
	}
}
