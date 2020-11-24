package assingment_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee
{
	String name;
	String address;
	int emp_id;
	public Employee(String name,String address,int emp_id)
	{
		this.name=name;
		this.address=address;
		this.emp_id=emp_id;
	}
}
public class Arraylist_reverse {
	public static void main(String args[])
	{
		List<Employee> l1=new ArrayList<Employee>();
		Employee obj1=new Employee("Snehasis","Durgapur",1792991);
		Employee obj2=new Employee("Debopriya","Durgapur",129831);
		Employee obj3=new Employee("Rahul","Durgapur",239201);
		l1.add(obj1);
		l1.add(obj2);
		l1.add(obj3);
		
		Collections.reverse(l1);
		for(Employee e1:l1)
		{
			System.out.println(e1.name + " " + e1.address + " " + e1.emp_id);
		}
		
	}

}
