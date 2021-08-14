package corejava;

public class FinallyScenario {
    public static int finallyTest(int x){
        try {
//            System.exit(0);
            return x/0;
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(100);
        }
        finally {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(finallyTest(10));
    }
}
