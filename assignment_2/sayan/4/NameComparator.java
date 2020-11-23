package Salary;
import java.util.*;
public class NameComparator implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort o1, EmployeeSort o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}