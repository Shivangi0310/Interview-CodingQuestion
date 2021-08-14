package stringandprogrammingquestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    static char firstNonRepeatingCharacter(String word) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        char[] wordArray = word.toCharArray();
        for (Character w : wordArray) {
            if (charMap.containsKey(w))
                charMap.put(w, charMap.get(w) + 1);
            else
                charMap.put(w, 1);
        }
        for (Map.Entry<Character, Integer> map : charMap.entrySet()) {
            if (map.getValue() == 1) {
                return map.getKey();
            }
        }
        throw new RuntimeException("fghjk");
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("ihyyyhhuyyo"));
    }

}
