package assignment2;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee>{
	
	public int compare(Employee em1, Employee em2) {
		return em1.getAddress().compareTo(em2.getAddress());
	}
}
