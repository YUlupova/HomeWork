package ru.courses.encapsulation.accountingofpeople;

public class Employee {
    private String name;
    private Department department;
    private boolean isManager;

    public Employee(String name, Department department, boolean isManager) {
        this.name = name;
        this.department = department;
        this.isManager = isManager;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public boolean isManager() {
        return isManager;
    }

    @Override
    public String toString() {
        if (isManager) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getManager().getName();
        }
    }
}