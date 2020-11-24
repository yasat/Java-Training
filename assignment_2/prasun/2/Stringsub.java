package com.project.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringsub {
	public static void printsubsequences(String ip,String op)
	{
		if(ip.length()==0)
		{
			System.out.println(op);
			return;
		}
		printsubsequences(ip.substring(1),op);
		printsubsequences(ip.substring(1),op+ip.charAt(0));
	}
	public static void printsubsequences(String ip)
	{
		printsubsequences(ip,"");
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sta=br.readLine();
		printsubsequences(sta,"");
	}

}
