package Salary;
import java.util.*;

public class MiddleList {
	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		int l=l1.size();
		if(l%2==0) {
			System.out.println(l1.get(l/2));
		}
		else
		System.out.println(l1.get(l/2));
		
	}
}
