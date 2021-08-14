package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Staff implements Comparable<Staff>{
    private Integer id;
    private String name;
    private Integer salary;
    public Staff(){}

    public Staff(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Staff o) {
        return this.salary.compareTo(o.getSalary());
    }

}
class ComparableMainClass{
    public static void main(String[] args) {
        List<Staff> staffs=new ArrayList<>();
        staffs.add(new Staff(1,"john", 10000));
        staffs.add(new Staff(12,"may", 20000));
        staffs.add(new Staff(13,"augus", 3000));
        staffs.add(new Staff(11,"maria", 80000));
        staffs.add(new Staff(15,"lipsa", 20000));
        System.out.println(staffs);
        Collections.sort(staffs);
        System.out.println(staffs);
        System.out.println(staffs.stream().sorted().collect(Collectors.toList()));
        System.out.println(staffs.getClass());
        new Staff().hashCode();
    }
}
