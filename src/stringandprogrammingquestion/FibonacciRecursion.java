package stringandprogrammingquestion;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
//
//class Fib{
//    protected void test() {
//        System.out.println("test");
//    }
//}
public class FibonacciRecursion {
    public void test(){
        System.out.println("cjdch");
    }
    static int fibonacciNumber(int num){
        System.out.println("num:: "+num);
        if(num ==0)
            return 0;
        if(num==1||num==2)
            return 1;
        return fibonacciNumber(num-1)+fibonacciNumber(num-2);
    }

    public static void main(String[] args) {
//        if (true)
//        int n=10;
//        for(int i=0;i<n;i++)
//            System.out.println(fibonacciNumber(i));
//        System.out.println(Class.forName(null));
//        Fib fib = new FibonacciRecursion();
//        fib.test();
        HashMap<String , Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("a",20);
        System.out.println(map);
        Hashtable<String,Integer> hashtable = new Hashtable<>()     ;
        hashtable.put("A",10);
//        hashtable.put(null,20);
//        hashtable.put("b",null);
        System.out.println(hashtable);
    }
}

