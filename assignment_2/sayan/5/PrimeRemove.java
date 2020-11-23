package Salary;
import java.util.*;
public class PrimeRemove {
public static void main(String args[])
		{
	HashSet<Integer> hs=new HashSet<Integer>();
	int  arr []=new int []  {2,3,5,3,7,9,11,7,13,3};
	int l= arr.length;
	for(int i=0;i<l;i++)
	{
		System.out.print(arr[i]+" ");
		hs.add(arr[i]);
		}
		System.out.println("\n"
				+ ""+hs);
		}
}