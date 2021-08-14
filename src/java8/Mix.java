package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
public class Mix {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(8);
        integerList.add(20);
        integerList.add(33);
        integerList.add(83);
        integerList.add(82);
        integerList.add(0);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("ahdhwd",34));
        studentList.add(new Student("ufhefu",98));
        studentList.add(new Student("ehfu",44));
        studentList.add(new Student("kjjfif",33));
        studentList.add(new Student("uehu",34));
        Collections.sort(studentList);

    }
}
