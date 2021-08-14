package collections;

import java.util.*;

public class FindDuplicateInArray {
    public static Object[] findDuplicateNumbersInArray(int [] array){
        List<Integer> integerList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();
        for (int i : array){
            if(integerSet.add(i)==false)
                if(!integerList.contains(i))
                integerList.add(i);
        }
        System.out.println(integerList);
        return integerList.toArray();
    }

    public static void main(String[] args) {
        int[] ints = {2,4,1,4,4,3,1,6,3,2,1};
//        findDuplicateNumbersInArray(ints);
        System.out.println(findDuplicateNumbersInArray(ints));


    }
}
