package assingment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicates {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,2,3,5);

        System.out.println("Normal array" +numbers);

        Set<Integer> hashSet = new LinkedHashSet(numbers);
        ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);

        System.out.println("After removing duplicates" +removedDuplicates);
    }
}
