package stringandprogrammingquestion;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println("------------------");
        System.out.println(isPalindrome("arora"));
        System.out.println("------------------");
        System.out.println(isPalindrome("abbgggeka"));
        System.out.println("   i   ".length());
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
        String s3= new String("def");
        String s4= "def";
        String s5= new String("def");
        System.out.println(s3==s4);
        System.out.println(s3==s5);

        String s6=new String("hhh");
        String s7="hhh";
        String s8=s6.intern();
        System.out.println(s6==s7);
        System.out.println(s7==s8);
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        while(i<j){
            System.out.println("i: "+s.charAt(i));
            System.out.println("j: "+s.charAt(j));
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
