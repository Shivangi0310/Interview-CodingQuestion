package stringandprogrammingquestion;

import java.util.Arrays;

public class Anagram {

    static boolean isAnagramString(String first, String second){
        if(first.length()!=second.length())
            return false;
        char[] one = first.toCharArray();
        char[] two = second.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        for(int i=0; i<one.length;i++)
            if(one[i]!=two[i])
                return false;
            return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagramString("shivangain","jainshivangi"));

    }
}
