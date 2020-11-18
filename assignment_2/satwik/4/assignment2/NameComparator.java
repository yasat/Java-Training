package assignment2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	
	public int compare(Employee em1, Employee em2) {
		return em1.getName().compareTo(em2.getName());
	}
}
