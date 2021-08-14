package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ComparatorLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("john",80000L));
        employees.add(new Employee("mary",90000L));
        employees.add(new Employee("kosef",100000L));
        employees.add(new Employee("konsh",20000L));
        employees.add(new Employee("rebet",90000L));
        employees.add(new Employee("sarah",60000L));

        Collections.sort(employees,(e1,e2)-> e1.getSalary().compareTo(e2.getSalary()));
        Collections.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        System.out.println(employees);
    }


}
