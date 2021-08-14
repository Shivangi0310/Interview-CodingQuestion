package stringandprogrammingquestion;

public class StringDigit1 {
    public static void main(String[] args) {
        System.out.println(hasAllDigits("shivan77gijain"));
        System.out.println(hasAllDigits("99999"));
        System.out.println(hasAllDigits("-1223"));
        System.out.println(hasAllDigits("1223"));
    }

    private static boolean hasAllDigits(String s) {
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i) >= '0' && s.charAt(i)<='9')){
                return true;
            }
            else return false;
        }
        return false;
    }
}
