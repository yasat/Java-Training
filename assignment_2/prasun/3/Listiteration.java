package com.project.training;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listiteration {
	public static void main(String[] args) throws IOException
	{
		int n=5;
		List<String> l1=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<n;i++)
		{
			String s=br.readLine();
			l1.add(s);
		}
		Iterator<String> itr=l1.iterator();
		ListIterator<String> listiterator=l1.listIterator();
		while(listiterator.hasPrevious())
		{
			System.out.println("List iterator:"+listiterator.previous());
		}
		
	}

}

