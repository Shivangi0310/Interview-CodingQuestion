package sapientpractise;

public class StringReverseRecursion {
    public String reverseString(String actualString){
        if(actualString.isEmpty())
            return actualString;
        else
//            System.out.println("1: "+actualString.substring((1)+actualString.charAt(0)));
            return reverseString(actualString.substring(1))+actualString.charAt(0);
    }
    public String reverseString2(String actualString){
        if(actualString.isEmpty())
            return actualString;
        else
            System.out.print(actualString.charAt(actualString.length()-1));
            return reverseString2(actualString.substring(0,actualString.length()-1));
    }
    public static void main(String[] args) {
//        String str = "abcdefghijkl";
//        System.out.println(str.substring(1));
        System.out.println(new StringReverseRecursion().reverseString("abcde"));
        System.out.println(new StringReverseRecursion().reverseString2("abcde"));
        System.out.println("abcde".substring(0,"abcde".length()-1));

    }
}


