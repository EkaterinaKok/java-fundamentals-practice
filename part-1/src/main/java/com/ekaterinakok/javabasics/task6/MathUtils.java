package com.ekaterinakok.javabasics.task6;

/**
 * Класс содержит утилитарные статические методы для выполнения
 * базовых арифметических операций (умножение и деление).
 */
public class MathUtils {

    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static void divideAndPrint(double dividend, double divisor) {
        if (divisor == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return;
        }
        long quotient = (long) (dividend / divisor);
        double remainder = dividend % divisor;
        System.out.println("При делении " + dividend + " на " + divisor +
                " получаем: целое частное = " + quotient + ", остаток = " + remainder);
    }

}
