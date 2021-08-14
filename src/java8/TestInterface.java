package java8;

public interface TestInterface {
    default void test(){
        System.out.println("hdjf");
    }

    public static void main(String[] args) {
//        TestInterface testInterface = new TestInterface() ::test;

    }
}
