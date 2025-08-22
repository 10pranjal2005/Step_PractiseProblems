import java.util.*;

class Employee {
    static String companyName;
    static int totalEmployees;

    String empId, name, department;
    double salary;

    public Employee(String empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public double calculateAnnualSalary() { return salary * 12; }
    public void updateSalary(double newSalary) { salary = newSalary; }
    public void displayEmployee() {
        System.out.println(empId + " | " + name + " | " + department + " | Salary: " + salary);
    }
}

class Department {
    String deptName;
    Employee[] employees;
    int empCount;

    public Department(String deptName, int size) {
        this.deptName = deptName;
        employees = new Employee[size];
        empCount = 0;
    }

    public void addEmployee(Employee e) { if (empCount < employees.length) employees[empCount++] = e; }

    public Employee highestPaid() {
        Employee max = employees[0];
        for (int i = 1; i < empCount; i++) if (employees[i].salary > max.salary) max = employees[i];
        return max;
    }

    public double totalPayroll() {
        double total = 0;
        for (int i = 0; i < empCount; i++) total += employees[i].salary;
        return total;
    }

    public void displayEmployees() {
        for (int i = 0; i < empCount; i++) employees[i].displayEmployee();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee.companyName = "Tech Corp";

        Department it = new Department("IT", 5);
        Department hr = new Department("HR", 5);

        it.addEmployee(new Employee("E101", "Alice", "IT", 5000));
        it.addEmployee(new Employee("E102", "Bob", "IT", 6000));
        hr.addEmployee(new Employee("E201", "Charlie", "HR", 4500));

        System.out.println("=== IT Department ===");
        it.displayEmployees();

        System.out.println("=== HR Department ===");
        hr.displayEmployees();

        System.out.println("Highest Paid in IT: " + it.highestPaid().name);
        System.out.println("Total Payroll IT: " + it.totalPayroll());
        System.out.println("Company Total Employees: " + Employee.totalEmployees);
    }
}
