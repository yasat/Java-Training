package assignment2;

import java.util.Comparator;

public class DobComparator implements Comparator<Employee>{
	
	public int compare(Employee em1, Employee em2) {
		return em1.getDob().compareTo(em2.getDob());
	}
}
