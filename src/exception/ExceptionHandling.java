package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandling {
    Integer parseInteger1(String a){
        System.out.println("chdeje");
        return parseInteger2(a);
    }
     Integer parseInteger2(String b){
         System.out.println("berfuy");
        return parseInteger3(b);
    }
     Integer parseInteger3(String c){
        Integer i=0;
            i=Integer.parseInt(c);
        return i;
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            exceptionHandling.parseInteger1("efu");

        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
    }


}
