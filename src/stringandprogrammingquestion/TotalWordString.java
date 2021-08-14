package stringandprogrammingquestion;

public class TotalWordString {
    public static void main(String[] args) {
        System.out.println(totalWordsInString("   i am   a   good    girl  hhdb ".trim()));
        System.out.println("   jejfhe fuhf efhe ".trim());
        System.out.println("   jejfhe fuhf efhe   ww");
    }

    private static int totalWordsInString(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(0)!=' '&& i==0)||s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count ++;
            }
        }
        return count;
    }
}
