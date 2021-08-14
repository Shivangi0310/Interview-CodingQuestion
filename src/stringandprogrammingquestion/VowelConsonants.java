package stringandprogrammingquestion;

public class VowelConsonants {
    static void noOfVowelConsonant(String s) {
        int length = s.length();
        int count = 0;
        int space=0;
        if (length == 0)
            System.out.println("empty string");
        else {
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    count++;
                }
                if(s.charAt(i)==' ')
                    space++;
            }
        }
        System.out.println("No. of vowels : " + count + " , no of consonants : " + (s.length() - count-space));

    }

    public static void main(String[] args) {
        noOfVowelConsonant("shivangi");
        noOfVowelConsonant("aakash");
        noOfVowelConsonant("nisha");
        noOfVowelConsonant("ssshhhhi");
        noOfVowelConsonant("aeiouy aeiouy");
        String str = "hrr,urur,yfgrfg,yrgyr";
        String [] strings = str.split(",");
        for(String s : strings) {
            System.out.println(s);
        }
        String a[] = {"kehf","fjkef"};
        //overloading main()
        VowelConsonants.main("a","s");
        int n=0;
       while (n<=1) {
           main(a);
           n++;
       }
    }
    public static void main(String a, String b){
        System.out.println(a+" "+b);
    }
}
