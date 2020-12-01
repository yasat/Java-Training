package testcodes;

import java.util.Scanner;

public class Solution {	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int stel = scan.nextInt();
			int endel = scan.nextInt();
			
			Childone o1 = new Childone(stel, endel);
			Childtwo o2 = new Childtwo(stel,endel);
			
			System.out.println(o1.filter());
			System.out.println(o2.filter());
			
			scan.close();
	}
}

class Parent{
	public int startelement, endelement;
	
	Parent(int se, int ee){
		this.startelement = se;
		this.endelement = ee;
	}
	
	String filter() {
		return null;
	}
}
class Childone extends Parent{
	
	Childone(int se, int ee) {
		super(se, ee);	
	}

	@Override
	String filter() {
		int a = this.startelement;
		int b = this.endelement;
		String ans = "";
		if(a==1) {
			a++;
		}
		for(int i =a;i<=b;i++) {
			int flag = 0;
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					flag =1;
					break;
				}
			}
			if(flag == 0) {
				ans = ans+" "+i;
			}
		}
		return(ans);
	}
}
class Childtwo extends Parent{
	
	Childtwo(int se, int ee){
		super(5,6);
	}
	
	@Override
	String filter() {
		int a = this.startelement;
		int b = this.endelement;
		String ans = "";
		return("done the happy work: "+a+", "+b);
	}
}