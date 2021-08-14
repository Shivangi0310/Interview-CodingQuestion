package problemsolving;

import java.util.stream.IntStream;

public class Print100To1000 {
    static void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        IntStream intStream = IntStream.range(1,100);
        intStream.forEach(System.out::println);
//        System.out.println(intStream);
//        printNos(100);
    }
}
