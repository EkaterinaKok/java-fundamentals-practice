package com.ekaterinakok.javabasics.task6;

/**
 * Класс предназначен для расчета геометрических параметров круга и окружности.
 * Демонстрирует совместное использование статического и нестатического контекстов.
 */
public class CircleCalculator {

    static final double PI = 3.14;

    public double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public void printCircleInfo(double radius) {
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("\n--- Информация о круге ---");
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь круга: " + area);
        System.out.println("Длина окружности: " + circumference);
    }

}
