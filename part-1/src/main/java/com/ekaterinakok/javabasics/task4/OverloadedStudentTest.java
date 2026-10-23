package com.ekaterinakok.javabasics.task4;

/**
 * Тестовый класс для проверки инициализации объектов OverloadedStudent через разные конструкторы.
 */
public class OverloadedStudentTest {

    public static void main(String[] args) {
        OverloadedStudent overloadedStudent1 = new OverloadedStudent();
        OverloadedStudent overloadedStudent2 = new OverloadedStudent(1, "Petr", "Ivanov", 3);
        OverloadedStudent overloadedStudent3 = new OverloadedStudent(2, "Egor", "Prutov", 2, 8.9, 9.3, 8.5);

        System.out.println(overloadedStudent1);
        System.out.println(overloadedStudent2);
        System.out.println(overloadedStudent3);
    }

}
