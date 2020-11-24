package Assignment_4_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Singlelink {
	public static void main(String[] args) throws IOException
	{
		LinkedList<Integer> list = new LinkedList<>();
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.print("Enter the number of element : ");
	    int nbr = Integer.parseInt(br.readLine());
	    br.readLine();
	    do {
	        list.add(Integer.parseInt(br.readLine()));
	        nbr--;
	    } while (nbr > 1);
	    int i=list.size();
	    System.out.println(i);
	    System.out.println(list.get((i%2)+1));
	}

}
