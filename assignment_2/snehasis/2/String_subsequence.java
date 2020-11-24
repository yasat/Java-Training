package assingment_2;

public class String_subsequence {
	
	public static void subsequence(String input,String output)
	{
		if(input.length()==0)
{
	System.out.println(output);
	return;
}

subsequence(input.substring(1), output);
subsequence(input.substring(1), output + input.charAt(0));
	}
	public static void subsequence(String input)
	{
		subsequence(input,"");
	}
	public static void main(String args[])
	{
		subsequence("abc");
	}

}
