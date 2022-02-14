package list_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExercise {
    public static void main(String args[]) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));
        findEmployee(list).forEach(s -> System.out.println(s));
        findEmployeeUsa(list).forEach(s -> System.out.println(s));
        Collections.sort(list);
        list.forEach(s -> System.out.println(s));
    }

    public static List<Employee> findEmployee(List<Employee> list){
        return list.stream().filter(s -> s.age>=50).collect(Collectors.toList());
    }

    public static List<Employee> findEmployeeUsa(List<Employee> list){
        return list.stream().filter(s -> s.country.equals("USA")).collect(Collectors.toList());
    }


}

class Employee implements Comparable<Employee>{

    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Employee employee) {
        return this.country.compareTo(employee.country);
    }
}
