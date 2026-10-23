package com.ekaterinakok.javabasics.task3;

/**
 * Тестировочный класс для демонстрации создания объектов Student
 * и вывода их средней успеваемости.
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Egor", "Prutov", 2, 8.9, 9.3, 8.5);
        Student student2 = new Student(2, "Olga", "Sidorova", 4, 8.8, 8.5, 9.1);
        Student student3 = new Student(3, "Ivan", "Titov", 3, 7.9, 8.5, 9.0);

        System.out.println(student1 + ", AverageGrade = " + student1.calculateAverageGrade());
        System.out.println(student2 + ", AverageGrade = " + student2.calculateAverageGrade());
        System.out.println(student3 + ", AverageGrade = " + student3.calculateAverageGrade());
    }

}
