package inheritance;

public class ClassFirst {
    void m1() {
        System.out.println("first");
    }
}

class ClassSecond extends ClassFirst {
    void m1() {
        System.out.println("second");
    }
}

class ClassThird extends ClassSecond {
    void m1() {
        System.out.println("third");
    }

    public static void main(String[] args) {
        ClassThird classThird = new ClassThird();
        classThird.m1();
        ClassSecond classSecond = new ClassSecond();
        classSecond.m1();
        ClassFirst classFirst = new ClassFirst();
        classFirst.m1();
        System.out.println("----------");
        ClassFirst classFirst1 = new ClassSecond();
        classFirst1.m1();

        ClassSecond classSecond1 = new ClassThird();
        classSecond1.m1();

        ClassThird classThird1 = (ClassThird) new ClassSecond();
        classThird1.m1();
    }
}
