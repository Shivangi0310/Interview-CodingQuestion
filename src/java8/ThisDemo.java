package java8;

interface Demo{
    void display();
}

public class ThisDemo {

    Integer myInteger=1;

    public void myMethod(){
        System.out.println("this demo1 :: "+this);
        Demo demo=new Demo() {
            Integer myInteger=2;
            @Override
            public void display() {
                System.out.println(new ThisDemo().myInteger);
                System.out.println(this.myInteger);
                System.out.println("this:: "+this);
            }
        };
        System.out.println("inner class :: "+demo);
        demo.display();
    }
    public void myMethod1(){
        System.out.println("this demo2 :: "+this);

        Demo demo=()-> {
            Integer myInteger=2;
            System.out.println(this.myInteger);
        };
        demo.display();
        System.out.println("Lambda : "+demo);
    }

    public static void main(String[] args) {
        new ThisDemo().myMethod();
        new ThisDemo().myMethod1();
    }
}
//interface Demo{
//    void display();
//}

//public class ThisDemo {
//
//    Integer myInteger=1;
//

//
//    public static void main(String[] args) {
//        new ThisDemo().myMethod();
//    }
//}
