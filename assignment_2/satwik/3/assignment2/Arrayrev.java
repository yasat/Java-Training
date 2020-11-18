package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arrayrev {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		ListIterator<String> it = al.listIterator(al.size());  //if size is not given as parameter, we need to use below while loop
		//while(it.hasNext()) {
		//	it.next();
		//}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
