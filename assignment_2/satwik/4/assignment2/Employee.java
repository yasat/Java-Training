package assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Employee {
	
	private int id;
	private String name, address, designation;
	Date dob;
	Employee(int id, String name,String address,String designation,Date dob){ //using constructor instead of set methods
		this.id=id;
		this.name=name;
		this.address=address;
		this.designation=designation;
		this.dob=dob;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getDesignation() {
		return designation;
	}

	public Date getDob() {
		return dob;
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat datef = new SimpleDateFormat("dd-MM-yyy"); //create date formatter for dob
		HashMap<Employee, String> hm = new HashMap<>(); //created hash map and adding few pairs
		hm.put(new Employee(1,"CCC","AP","TM",datef.parse("01-02-1990")), "EMP1");
		hm.put(new Employee(2,"BBB","TN","TL",datef.parse("01-03-1990")), "EMP2");
		hm.put(new Employee(3,"AAA","WB","PL",datef.parse("01-01-1990")), "EMP3");
		
		System.out.println("Before sorting:");
		System.out.println("-------------------");
		for(Employee o:hm.keySet()) {
			System.out.println("key: "+o.getId()+" "+o.getName()+" "+o.getAddress()+" "+o.getDesignation()+" "+datef.format(o.getDob())+"\n"+"value: "+hm.get(o));
		}
		
		//for name sorting
		List<Employee> keys = new ArrayList<>(hm.keySet()); //Since Collections only allow lists, made list of keys
		Collections.sort(keys, new NameComparator());
		LinkedHashMap<Employee, String> sortedname = new LinkedHashMap<>(keys.size()); 
		
		//since hash map doesn't store in order, used linked hash map 
		for(Employee ob : keys) {
			sortedname.put(ob, hm.get(ob)); //fetching values for sort keys from original hashmap
		}
		
		System.out.println("After Name sorting:");
		System.out.println("-------------------");
		for(Employee o:sortedname.keySet()) {
			System.out.println("key: "+o.getId()+" "+o.getName()+" "+o.getAddress()+" "+o.getDesignation()+" "+datef.format(o.getDob())+"\n"+"value: "+sortedname.get(o));
		}
		
		//address sorting
		Collections.sort(keys, new AddressComparator());
		LinkedHashMap<Employee, String> sortedaddress = new LinkedHashMap<>(keys.size()); 
		
		//since hash map doesn't store in order, used linked hash map 
		for(Employee ob : keys) {
			sortedaddress.put(ob, hm.get(ob)); //fetching values for sort keys from original hashmap
		}
		System.out.println("After Address sorting:");
		System.out.println("-------------------");
		for(Employee o:sortedaddress.keySet()) {
			System.out.println("key: "+o.getId()+" "+o.getName()+" "+o.getAddress()+" "+o.getDesignation()+" "+datef.format(o.getDob())+"\n"+"value: "+sortedaddress.get(o));
		}
		
		//for Dob sorting
		Collections.sort(keys, new DobComparator());
		LinkedHashMap<Employee, String> sorteddate = new LinkedHashMap<>(keys.size()); 
		
		//since hash map doesn't store in order, used linked hash map 
		for(Employee ob : keys) {
			sorteddate.put(ob, hm.get(ob)); //fetching values for sort keys from original hashmap
		}
		System.out.println("After Dob sorting:");
		System.out.println("-------------------");
		for(Employee o:sorteddate.keySet()) {
			System.out.println("key: "+o.getId()+" "+o.getName()+" "+o.getAddress()+" "+o.getDesignation()+" "+datef.format(o.getDob())+"\n"+"value: "+sorteddate.get(o));
		}
	}
}
