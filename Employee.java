//write a program to display employyee( empid, empname, empdesignation, empsal) information using toString()

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String empDesignation;
    double empSal;
    public Employee(int empId, String empName, String empDesignation, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSal = empSal;
    }
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName + ", Designation: " + empDesignation + ", Salary: " + empSal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        
        System.out.print("Employee Designation: ");
        String empDesignation = scanner.nextLine();
        
        System.out.print("Employee Salary: ");
        double empSal = scanner.nextDouble();
        
        Employee emp = new Employee(empId,empName,empDesignation, empSal);
        System.out.println(emp);
    }
}