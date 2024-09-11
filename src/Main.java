import Models.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee employee1 = new Employee("Dept1", "Grit", "Godo");
        Employee employee2 = new Employee("Dept2", "Ingrid", "Yeager");

        emp.add(employee1);
        emp.add(employee2);
        for (Employee employee : emp) {
            System.out.print(employee.getFirstName());
            System.out.println(employee.getLastName());
        }
    }
}