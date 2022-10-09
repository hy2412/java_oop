package lab09.lab09_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 =  new FullTimeEmployee();
        Employee employee2 =  new FullTimeEmployee();
        Employee employee3 =  new FullTimeEmployee();
        Employee employee4 =  new ContractEmployee();
        Employee employee5 =  new ContractEmployee();
        List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println("Total: " + totalSalary);
    }
}
