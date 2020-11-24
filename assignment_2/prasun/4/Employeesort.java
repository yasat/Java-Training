package com.project.training;

import java.util.*;
import java.io.*;

public class Employeesort {
	public static void main(String[] args)
	{
		HashMap<Employeeinfo,String> hashmap=new HashMap<>();
		Employeeinfo emp1=new Employeeinfo("16894","biswajit","tollygunge","finance head","22 nov,1998");
		Employeeinfo emp2=new Employeeinfo("14782","raktim","kasba","project lead","9 nov,1994");
		Employeeinfo emp3=new Employeeinfo("14895","mohit","patuli","security head","3 jan,1999");
		hashmap.put(emp1, emp1.getid());
		hashmap.put(emp1, emp1.getname());
		hashmap.put(emp1, emp1.getaddress());
		hashmap.put(emp1, emp1.getdesignation());
		hashmap.put(emp1, emp1.getdateofbirth());
		hashmap.put(emp2, emp2.getid());
		hashmap.put(emp2, emp2.getname());
		hashmap.put(emp2, emp2.getaddress());
		hashmap.put(emp2, emp2.getdesignation());
		hashmap.put(emp2, emp2.getdateofbirth());
		hashmap.put(emp3, emp3.getid());
		hashmap.put(emp3, emp3.getname());
		hashmap.put(emp3, emp3.getaddress());
		hashmap.put(emp3, emp3.getdesignation());
		hashmap.put(emp3, emp3.getdateofbirth());
		System.out.println(hashmap.get(emp1));
		
		/*emp1.setid("16745");
		emp1.setname("kalyan");
		emp1.setaddress("ballygaunge");
		emp1.setdesignation("delivery partner");
		emp1.setdateofbirth("25 september,1998");
		Employeeinfo emp2=new Employeeinfo();
		emp2.setid("14786");
		emp2.setname("dulal");
		emp2.setaddress("kumartuli");
		emp2.setdesignation("business head");
		emp2.setdateofbirth("21 march,1995");
		Employeeinfo emp3=new Employeeinfo();
		emp3.setid("18267");
		emp3.setname("rajib");
		emp3.setaddress("garia");
		emp3.setdesignation("finance head");
		emp3.setdateofbirth("18 may,1994");
		Collections.so*/
		
	}

}
class Employeeinfo
{
	String id;
	String name;
	String address;
	String designation;
	String dateofbirth;
	public Employeeinfo(String id,String name,String address,String designation,String dateofbirth)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.designation=designation;
		this.dateofbirth=dateofbirth;
	}
	
	public String getid()
	{
		return id;
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getaddress()
	{
		return address;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getdesignation()
	{
		return designation;
	}
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
	public String getdateofbirth()
	{
		return dateofbirth;
	}
	public void setdateofbirth(String dateofbirth)
	{
		this.dateofbirth=dateofbirth;
	}
}