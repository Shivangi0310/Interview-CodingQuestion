package stringandprogrammingquestion;

public class StringReverse {
    static String stringReverse(String s){
        String[] strArr = s.split(" ");
        System.out.println(strArr.length);
//        System.out.println("entered method");
        String[] newArr = new String[strArr.length];
//        System.out.println("efhrj");
//        for(int i = 0;i<strArr.length;i++){
//            System.out.println("entered for");
            for (int i = 0,j=strArr.length-1; i<strArr.length && j>-1;i++,j--){
//                System.out.println(newArr[i]);
                System.out.println(strArr[j]);
                newArr[i] =strArr[j];
            }
//        System.out.println("hgrgurgru");
        return String.join(" ",newArr);
    }

    public static void main(String[] args) {
        System.out.println(stringReverse("i am a good girl"));
    }
}
