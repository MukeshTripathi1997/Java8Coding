package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMinMaxAvgDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ram", 23, 20000));
        list.add(new Employee("Ashoke", 25, 30000));
        list.add(new Employee("Suresh", 33, 25000));
        list.add(new Employee("Charan", 26, 40000));

        // Calculate average salary
        Double avgSalary = list.stream().collect(Collectors.averagingInt(Employee::getSalary));
        System.out.println("Emp Avg Salary ::" + avgSalary);

        // Find employee with minimum salary
        Optional<Employee> minEmpSalary = list.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("Minimum Salary ::" + minEmpSalary.orElse(null));
        Optional<Employee> maxEmpSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Maximum Salary Emp ::"+maxEmpSalary.get());
    }
}
