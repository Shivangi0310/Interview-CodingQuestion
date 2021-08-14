package stringandprogrammingquestion;

import java.util.HashMap;
import java.util.Map;

public class OcccuranceOfCharacter {
    static Map<Character, Integer> getOccuranceOfCharacter(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char[] characters = s.toCharArray();
        for (Character c : characters) {
            if (characterIntegerMap.containsKey(c))
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            else
                characterIntegerMap.put(c, 1);
        }
        return characterIntegerMap;
    }

    public static void main(String[] args) {
        System.out.println(getOccuranceOfCharacter("I am a good girl"));
        System.out.println(getOccuranceOfCharacter("I learn java"));
        System.out.println(getOccuranceOfCharacter("fbfh ffr kenfjkh"));
    }

}
