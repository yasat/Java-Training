package Salary;
import java.util.*;
public class sequence {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();
	 String substr="";
	 HashSet<String> hs=new HashSet<String>();
	 for(int i=0;i<str.length();i++)
	 { 
		 substr="";
		 substr=substr+str.charAt(i);
		 hs.add(substr);
		 for(int j=i+1;j<=str.length();j++) {
			 for(int k=j+1;k<=str.length();k++) {
		 substr=str.charAt(i)+str.substring(j,k);
		 hs.add(substr);
			 }
		 }
		 }
	 System.out.println(hs);
	 
 }
}
