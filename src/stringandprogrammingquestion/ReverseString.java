package stringandprogrammingquestion;

public class ReverseString {
    static void reverseAString(String s){
        char [] reverseArray = new char[s.length()];
        for (int i= s.length()-1; i>-1;i--){
            System.out.print(s.charAt(i));
        }
//        System.out.println(reverseArray);
    }
    public static void main(String[] args) {
        reverseAString("shivangijain");
    }
}