import java.io.*; 
import java.util.*; 
  
public class ReverseArrayList { 
    public static void main(String[] args) 
    { 
        List<String> list = new ArrayList<String>();
        list.add("C++");
        list.add("java");
        list.add("Python");
        list.add("C#");
        System.out.println("Elements before reversing: "+ list); 

        ListIterator<String> listIterator = list.listIterator(list.size());
        
        System.out.println("\nElements after reversing: ");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
    }
       
} 
}
