package comparablecomparator;

import java.util.*;
import java.util.stream.Collectors;

public class Employee{
    private Integer id;
    private String name;
    private Integer salary;

    public Employee(Integer id, String name, Integer salary) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }



}
class ComparatorMainClass{
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"john", 10000));
        employees.add(new Employee(12,"may", 20000));
        employees.add(new Employee(13,"augus", 3000));
        employees.add(new Employee(11,"maria", 80000));
        employees.add(new Employee(15,"lipsa", 20000));
        employees.sort(Comparator.comparing(Employee::getId));
        System.out.println(employees);
//        Comparator<Employee> employeeComparator = (o1, o2) -> {
//            if(o1.getSalary()>o2.getSalary())
//                return -1;
//            else if(o1.getSalary()==o2.getSalary())
//                return 0;
//            else
//                return 1;
//
//        };
//        Collections.sort(employees,employeeComparator);

//        -------------------------


//        Collections.sort(employees, (o1, o2) -> {
//            if(o1.getSalary()>o2.getSalary())
//                return -1;
//            else if(o1.getSalary()==o2.getSalary())
//                return 0;
//            else
//                return 1;
//
//        });
//        -------------------------------
//        Collections.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed());
        Collections.sort(employees, (o1,o2)->o2.getName().compareTo(o1.getName()));
//        Collections.sort(employees, (o1,o2)->o1.getId()-o2.getId());
        System.out.println(employees);

//        System.out.println(employees);
        List<Employee> employeeList = employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed()).collect(Collectors.toList());
//        System.out.println(employeeList);
//        System.out.println(new Employee(10,"john", 10000).getId().equals(new Employee(1,"john", 10000).getId()));
    }
}
