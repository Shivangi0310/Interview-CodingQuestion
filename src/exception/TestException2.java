package exception;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.*;

public class TestException2 {

    public static void main(String[] args) {
        TestException2 testException2 = new TestException2();
        System.out.println(testException2.hashCode());
        TestException2 testException21 = testException2;
        System.out.println(testException21.equals(testException21));
        System.out.println(testException21.hashCode());
        String abc ="King";
        System.out.println(abc.hashCode());
        System.out.println(abc.hashCode() & (16-1));
//        Map<Integer, Integer> integerIntegerMap = new TreeMap<>();
//        integerIntegerMap.put(10,2);
//        integerIntegerMap.put(9,3);
//        integerIntegerMap.put(8,5);
//        integerIntegerMap.put(100,4);
//        System.out.println(integerIntegerMap);
//        "jdjd".equals("");
//        integerIntegerMap.keySet();
//        List<Integer> j = new ArrayList<>();
//        Collections.sort(j);
//        Set<String> key =integerIntegerMap.keySet();
//        for(Map.Entry<String,Integer> entry : integerIntegerMap.entrySet()){
//            System.out.println(entry);
//
//        }


//        try {
//            foo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }/*catch(JAXBException e){
//            e.printStackTrace();
//        }*/
//        catch(NullPointerException e){
//            e.printStackTrace();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        String str = new String("hjch");
//        System.out.println(str+"hhcjhd".hashCode() + " /// "+str.hashCode());


    }

    public static void foo() throws IOException{
    }
}