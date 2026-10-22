package com.ekaterinakok.javabasics.task1;

/**
 * Класс для форматированного вывода стихотворения (рубаи) Омара Хайяма.
 * Демонстрирует работу с текстовыми блоками и консольным выводом.
 */
public class QuatrainPrinter {

    public static void main(String[] args) {
        System.out.println("Вариант 1:");
        printKhayyamQuatrainVersion1();

        System.out.println();

        System.out.println("Вариант 2:");
        printKhayyamQuatrainVersion2();
    }

    private static void printKhayyamQuatrainVersion1() {
        System.out.print("               ");
        System.out.println("РУБАИ");

        System.out.println("Много лет размышлял я над жизнью земной.");
        System.out.println("Непонятного нет для меня под луной.");
        System.out.println("Мне известно, что мне ничего не известно!");
        System.out.println("Вот последняя правда, открытая мной.");

        System.out.print("                                ");
        System.out.println("О. Хайям");
    }

    private static void printKhayyamQuatrainVersion2() {
        String rubai = """
                               РУБАИ
                Много лет размышлял я над жизнью земной.
                Непонятного нет для меня под луной.
                Мне известно, что мне ничего не известно!
                Вот последняя правда, открытая мной.
                                                О. Хайям
                """;

        System.out.println(rubai);
    }

}
