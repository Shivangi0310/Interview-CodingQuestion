package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaFunctions<T> {
//    List<Integer> integerList;
    T data;
    LambdaFunctions(T t){
        this.data = t;
    }


    public static void main(String[] args) {
//        Predicate<Integer> abc = salary ->  salary>1000;
//        List<String>  strings = Arrays.asList("jndvjk","jjfjhev","ncjkewkj");
//        strings.forEach(System.out::println);
//        List<Integer> integerList = new ArrayList();
//        integerList.add(89);
//        integerList.add(90);
//        integerList.add(76);
//        integerList.add(70);
//        integerList.add(54);
//        integerList.add(89);
//        List<Integer> integerList1 = integerList.stream().filter(i -> i > 50).map(i -> i * 100).collect(Collectors.toList());
//        System.out.println(integerList1);
//
//        LambdaFunctions lambdaFunctions = new LambdaFunctions();
//        Map<String,Integer> map = new HashMap<>();
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        final int var=10;
//        var++;
// This line will generate error
// because we are changing a variable before using it inside lambda expression
//        integers.forEach(e->System.out.println(var));
//        List<String> list = Arrays.asList("abc","def");
//        System.out.println(
//                list.stream()
//                        .collect(Collectors.joining(","))
//        );
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        System.out.println(
//                list.stream()
//                        .collect(Collectors.summarizingInt(x -> x * 2))
//        );
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        System.out.println(
//                list.stream()
//                        .collect(Collectors.counting())
//        );
//        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
//        System.out.println(
//                list2.stream()
//                        .collect(Collectors.averagingInt(x -> x * 2))
//        );
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list.stream()
                        .collect(Collectors.toMap(e -> e, e -> e *3 ))
        );

        LambdaFunctions lambdaFunctions = new LambdaFunctions<>("Sjjjkd");
        System.out.println(lambdaFunctions.data);
    }

}

