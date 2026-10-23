package com.ekaterinakok.javabasics.task4;

/**
 * Класс, демонстрирующий перегрузку методов (Method Overloading)
 * на примере вычисления суммы чисел.
 */
public class OverloadedSum {

    public static void main(String[] args) {
        OverloadedSum calculator = new OverloadedSum();

        System.out.println("=== Тестирование перегрузки методов ===");
        calculator.sum();
        calculator.sum(5);
        calculator.sum(10, 20);
        calculator.sum(1, 2, 3);
        calculator.sum(4, 8, 15, 16);
    }

    public int sum() {
        int result = 0;
        System.out.println("Sum = " + result);
        return result;
    }

    public int sum(int a) {
        int result = a;
        System.out.println("Sum = " + result);
        return result;
    }

    public int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum = " + result);
        return result;
    }

    public int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Sum = " + result);
        return result;
    }

    public int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Sum = " + result);
        return result;
    }

}
