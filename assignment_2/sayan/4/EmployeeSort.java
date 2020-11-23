package Salary;
import java.util.*;
public class EmployeeSort implements Comparable<EmployeeSort> {
		
		private int id;
		private String name;
		private int dob;
		private String address;
		private String designation;
		

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}
		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public EmployeeSort(int id, String name, int dob, String address, String designation) {
			//super();
			this.id = id;
			this.name = name;
			this.dob = dob;
			this.address=address;
			this.designation=designation;
		}


		public int getDob() {
			return dob;
		}


		public void setDob(int dob) {
			this.dob = dob;
		}


		@Override
		public String toString() {
			return "EmployeeSort [id=" + id + ", name=" + name + ", Dob=" + dob + ", Address=" + address+", Designation="+designation+"]";
		}


		@Override
		public int compareTo(EmployeeSort o) {
		
			return this.getDob()-o.getDob();
		}
		
		public static void main(String[] args) {
			
			EmployeeSort s1= new EmployeeSort(123, "Hueng", 1975, "Kolkata","CEO");
			EmployeeSort s2= new EmployeeSort(456, "Gurpreet", 1965, "Delhi", "Director");
			EmployeeSort s3= new EmployeeSort(789, "David", 1985, "Mumbai","Clerk");
			List<EmployeeSort> employeelist=new ArrayList<EmployeeSort>();
			employeelist.add(s1);
			employeelist.add(s2);
			employeelist.add(s3);
			
			System.out.println("Employee list before sorting :"+employeelist);
			Collections.sort(employeelist,new NameComparator());
			System.out.println("Employee list after Name :"+employeelist);
			Collections.sort(employeelist,new AddressComparator());
			System.out.println("Employee List after sorting Address :"+employeelist);
			Collections.sort(employeelist);
			System.out.println("Employee List after sorting DOB :"+employeelist);
			
			
			
		
}
}
