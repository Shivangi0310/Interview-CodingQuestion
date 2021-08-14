package stringandprogrammingquestion;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    static void findDuplicateCharacters(String s){
        Map<Character,Integer> duplicateCharacterMap = new HashMap<>();
        char[] characters = s.toCharArray();
        for(Character c : characters){
            if(duplicateCharacterMap.containsKey(c))
                duplicateCharacterMap.put(c,duplicateCharacterMap.get(c)+1);
            else
                duplicateCharacterMap.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry: duplicateCharacterMap.entrySet()){
            if(entry.getValue()>1)
                System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        findDuplicateCharacters("shivangijain");
    }
}
