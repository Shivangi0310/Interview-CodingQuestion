import java.util.Collection;
import java.util.Collections;

public class JavaMain {
    int walk(String name){
        return 7;
    }
    int walk(int i){
        return i;
    }
    public static void main(String[] args) {
//        System.out.println(args.length);
//        args[0]="sdgfhgj";
//        for (String s : args){
//            System.out.println("abd" +s);
        boolean g = false;
        if (!g)
            System.out.println("fdfghjkl");
        boolean h = !g ;
        if(h){
            System.out.println("ffgjhk");
        }

        Person p1= new Person("hfuye",23);
        Person p2= new Person("hfuye");
        Person p3= new Person(9);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        System.out.println("c1");
        this.name = name;
        this.age = age;
    }
    public Person(String name1) {
        System.out.println("c2");
        this.name = name1;
    }
      public Person(int age) {
          System.out.println("c3");
          age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}