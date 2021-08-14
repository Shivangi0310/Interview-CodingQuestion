package stringandprogrammingquestion;

 interface x{
     int sum();
    default void abc(){
        int a = sum()+1;
    }

}
public class LongestOccuringString {
    public static void main(String[] args) {
        String str = "aabbbbbddbbbbbbffgbbbbbbbbbb";
        int count = 1;
        int index = 0;
        int max = 0;
        for(int i=0;i<str.length();i++){
            if((i+1)<str.length() &&str.charAt(i)==str.charAt(i+1)){
                System.out.println("character : "+str.charAt(i));
                ++count;
            }
            else {
                if(count>max) {
                    max = count;
//                    index = i;
                }
                count = 1;
            }
        }
        System.out.println("max: "+max);
//        System.out.println("index: "+index);
        String s = null;
    }
}
