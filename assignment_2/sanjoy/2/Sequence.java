import java.util.*;
class Sequence{
 
    static List<String> al = new ArrayList<>();
    
    private static void subsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
 
        subsequences(s.substring(1), ans + s.charAt(0));
                                   
        subsequences(s.substring(1), ans);
    }
    public static void main(String[] args)
    {
        String s = "abc";
        subsequences(s, ""); 
        System.out.println(al);
    }
}