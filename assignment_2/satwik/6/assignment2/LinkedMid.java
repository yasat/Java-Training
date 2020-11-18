package assignment2;

import java.util.LinkedList;
import java.util.List;

public class LinkedMid {
	public static void main(String[] args) {
		List<Integer> lkl = new LinkedList<>();
		lkl.add(10);lkl.add(20);lkl.add(30);lkl.add(40);lkl.add(50);lkl.add(60);
		System.out.println(lkl.get((lkl.size()/2))); //Since indexing start from 1, we don't have to add 1 to get middle or second mid.
	}
}
