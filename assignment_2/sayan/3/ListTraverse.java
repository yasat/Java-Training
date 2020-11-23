package Salary;
import java.util.*;
import java.util.List;
import java.util.ListIterator;
public class ListTraverse {

		
		public static void main(String[] args) {
			List<String> l1=new ArrayList<>();
			l1.add("Alpha");
			l1.add("Beta");
			l1.add("Delta");
			
			System.out.println("Before Traverse\n"+l1);
			System.out.println("After Traverse ");
			ListIterator<String> listiterator=l1.listIterator(l1.size());
			
			while(listiterator.hasPrevious()) {
				System.out.print(listiterator.previous() +" ");
			}
		
		}

	}