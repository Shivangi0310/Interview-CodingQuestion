package stringandprogrammingquestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDigitRegex {
    static boolean isOnlyDigit(String s){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println(isOnlyDigit("shivangi8jain"));
        System.out.println(isOnlyDigit("99999.99"));
        System.out.println(isOnlyDigit("-1223"));
        System.out.println(isOnlyDigit("122"));
    }
}
