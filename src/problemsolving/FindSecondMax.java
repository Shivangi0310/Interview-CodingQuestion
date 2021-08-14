package problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondMax {
    static List<String> findTwoMostOccuringString(List<String> strings){
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        for(String s : strings){
            if(stringIntegerMap.containsKey(s))
                stringIntegerMap.put(s,stringIntegerMap.get(s)+1);
            else
                stringIntegerMap.put(s,1);
        }
        int max1=0;
        for(Map.Entry<String,Integer> keyValue: stringIntegerMap.entrySet()){
            if(keyValue.getValue()>max1)
                max1= keyValue.getValue();
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> keyValue: stringIntegerMap.entrySet()){
            if(keyValue.getValue() == max1)
                result.add(keyValue.getKey());
        }

        stringIntegerMap.remove(result.get(0));
        for(Map.Entry<String,Integer> keyValue: stringIntegerMap.entrySet()){
            if(keyValue.getValue()>max1)
                max1= keyValue.getValue();
        }
        for(Map.Entry<String,Integer> keyValue: stringIntegerMap.entrySet()){
            if(keyValue.getValue() == max1)
                result.add(keyValue.getKey());
        }
        return result;
    }


    public static void main(String[] args) {
        String[] strings = {"p1","p1","p2","p2","p3","p5","p1","p4"};
        List<String> abc = Arrays.asList(strings);
//        System.out.println(findTwoMostOccuringString(Arrays.asList(strings)));
        Integer[] integers = {2,5,7,6,5,3,1,8,9,66,44,34,6,64,24};
//        List<Integer> integerList = Arrays.asList(integers);
//        List<Integer> i = integerList.stream().sorted().collect(Collectors.toList());
//        System.out.println(i);
//        System.out.println(i.get(i.size()-2));
        List<String> a = findTwoMostOccuringString(abc);
        System.out.println(a);
//        int max = 0;
//        int secondMax = 0;
//        for (int i=0;i<integers.length;i++){
//            if(integers[i]>max)
//                max=integers[i];
//            if(integers[i]<max && integers[i]>secondMax)
//                secondMax=integers[i];
//        }
//        System.out.println("largest number : "+max+ "   "+secondMax );

    }

}
