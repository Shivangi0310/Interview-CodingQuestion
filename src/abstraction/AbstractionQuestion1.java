package abstraction;

abstract public class AbstractionQuestion1 {
    //    abstract void show();
    void display() {
        System.out.println("heheh");
    }
    static void staticMethod(){
        System.out.println("static method");
    }


}

class B extends AbstractionQuestion1 {
    public static void main(String[] args) {
        AbstractionQuestion1 abstractionQuestion1 = new B();
//        abstractionQuestion1.display();
        abstractionQuestion1.display();
        AbstractionQuestion1.staticMethod();
    }

}

interface A {
    default void display() {
        System.out.println("hjdhehe");
    }
}

class Aa implements A {
    public static void main(String[] args) {
        new Aa().display();
    }
}
