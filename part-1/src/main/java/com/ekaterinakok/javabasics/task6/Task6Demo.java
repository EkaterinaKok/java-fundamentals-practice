package com.ekaterinakok.javabasics.task6;

import static com.ekaterinakok.javabasics.task6.CircleCalculator.calculateCircumference;
import static com.ekaterinakok.javabasics.task6.MathUtils.divideAndPrint;
import static com.ekaterinakok.javabasics.task6.MathUtils.multiply;

/**
 * Главный класс для задачи №6, служащий точкой входа.
 * Используется для тестирования и демонстрации работы статических и нестатических методов
 * из классов {@link MathUtils} и {@link CircleCalculator}.
 */
public class Task6Demo {

    public static void main(String[] args) {
        System.out.println(multiply(5, 10, 2));
        System.out.println(multiply(9.5, 22.3, 76.1));

        divideAndPrint(78, 4);
        divideAndPrint(4562654, 456.445);

        System.out.println();

        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println("Площадь круга равна " + circleCalculator.calculateArea(7));
        System.out.println("Длина окружности равна " + calculateCircumference(7));
        circleCalculator.printCircleInfo(7);

    }

}
