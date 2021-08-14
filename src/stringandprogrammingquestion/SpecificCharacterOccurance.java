package stringandprogrammingquestion;

import java.util.HashMap;
import java.util.Map;

public class SpecificCharacterOccurance {
    static int getSpecificCharacterOccurance(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }

    static Map<Character, Integer> getSpecificCharacterOccuranceUsingMap(String s, char c) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (Character character : chars) {
            if (character == c && characterIntegerMap.containsKey(character)) {
                characterIntegerMap.put(character, characterIntegerMap.get(character)+1);
            } else if (character == c) {
                characterIntegerMap.put(character, 1);
            }
        }
        if(characterIntegerMap.isEmpty())
            characterIntegerMap.put(c,0);
        return characterIntegerMap;
    }

    public static void main(String[] args) {
        System.out.println(getSpecificCharacterOccurance("I am a good girl", 'o'));
        System.out.println(getSpecificCharacterOccurance("I learn java", 'o'));
        System.out.println(getSpecificCharacterOccurance("fbfh ffr kenfjkh", 'f'));

        System.out.println(getSpecificCharacterOccuranceUsingMap("I am a good girl",'o'));
        System.out.println(getSpecificCharacterOccuranceUsingMap("I learn java",'o'));
        System.out.println(getSpecificCharacterOccuranceUsingMap("fbfh ffr kenfjkh",'f'));
//        for(int i=1;i<i*2;i++){
//            System.out.println(i);
//            System.out.println("hi");
//        }
    }


}
