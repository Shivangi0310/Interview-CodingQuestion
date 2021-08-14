package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithString {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("shivangi");
        stringSet.add("shivangi");
        stringSet.add(new String("aakash"));
        stringSet.add(new String("aakash"));
//        stringSet.add("aakash");
//        stringSet.add("shivangi");
        System.out.println(stringSet);

    }
}
