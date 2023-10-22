package ru.courses.encapsulation.accountingofpeople;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
        } else {
            System.out.println("Ошибка: оценка должна быть в диапазоне от 2 до 5");
        }
    }
}