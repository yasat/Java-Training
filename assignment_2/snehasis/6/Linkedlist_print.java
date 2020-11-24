package assingment_2;

import java.util.LinkedList;
import java.util.List;

public class Linklist_print {
	public static void main(String args[])
	{
		List<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		int i=l1.size();
		if(i%2==0)
		{
			System.out.println(l1.get(i/2));
		}
		
	}
}

