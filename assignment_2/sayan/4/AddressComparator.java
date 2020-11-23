package Salary;
import java.util.*;
public class AddressComparator implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort o1, EmployeeSort o2) {
		
		return o1.getAddress().compareTo(o2.getAddress());
	}

}