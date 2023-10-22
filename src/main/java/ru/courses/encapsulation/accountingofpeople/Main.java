package ru.courses.encapsulation.accountingofpeople;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Employee("John", new Department("Marketing", null), true);
        Department department = new Department("Sales", manager);
        Employee employee = new Employee("Alice", department, false);

        System.out.println(employee);  // Alice работает в отделе Sales, начальник которого John
        System.out.println(manager);   // John начальник отдела Marketing
    }
}