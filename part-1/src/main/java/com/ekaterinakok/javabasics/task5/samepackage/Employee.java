package com.ekaterinakok.javabasics.task5.samepackage;

public class Employee {

    private double salary;
    public String surname;
    int id;

    public Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    Employee(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public void printSalary() {
        System.out.println(salary);
    }

    public void printSurname() {
        System.out.println(surname);
    }

    public void printId() {
        System.out.println(id);
    }
}
