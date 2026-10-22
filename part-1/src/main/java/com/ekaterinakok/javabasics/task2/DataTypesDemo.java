package com.ekaterinakok.javabasics.task2;

/**
 * Класс демонстрирует работу с базовыми типами данных Java,
 * использование различных систем счисления для числовых литералов
 * и различные способы инициализации символов.
 */
public class DataTypesDemo {

    public static void main(String[] args) {

        byte byteDecimal = 12;
        byte byteBinary = 0b1100;
        byte byteOctal = 014;
        byte byteHex = 0xC;
        System.out.println("--- Тип byte (12) ---");
        System.out.println("Dec: " + byteDecimal + ", Bin: " + byteBinary
                + ", Oct: " + byteOctal + ", Hex: " + byteHex);

        short shortDecimal = -1300;
        short shortBinary = -0b10100010100;
        short shortOctal = -02424;
        short shortHex = -0x514;
        System.out.println("\n--- Тип short (-1300) ---");
        System.out.println("Dec: " + shortDecimal + ", Bin: " + shortBinary
                + ", Oct: " + shortOctal + ", Hex: " + shortHex);

        int intDecimal = 0;
        int intBinary = 0b0;
        int intOctal = 00;
        int intHex = 0x0;
        System.out.println("\n--- Тип int (0) ---");
        System.out.println("Dec: " + intDecimal + ", Bin: " + intBinary
                + ", Oct: " + intOctal + ", Hex: " + intHex);

        long longDecimal = 123456789L;
        long longBinary = 0b111010110111100110100010101L;
        long longOctal = 0726746425L;
        long longHex = 0x75BCD15L;
        System.out.println("\n--- Тип long (123456789) ---");
        System.out.println("Dec: " + longDecimal + ", Bin: " + longBinary
                + ", Oct: " + longOctal + ", Hex: " + longHex);

        float floatValue1 = 3.14f;
        float floatValue2 = -0.5f;

        double doubleValue1 = 123.456;
        double doubleValue2 = 7.89e3;

        boolean isJavaFun = true;
        boolean isFinished = false;

        System.out.println("\n--- Вещественные и логические типы ---");
        System.out.println("float: " + floatValue1 + " ; " + floatValue2);
        System.out.println("double: " + doubleValue1 + " ; " + doubleValue2);
        System.out.println("boolean: " + isJavaFun + " ; " + isFinished);

        char charBySymbol = 'A';
        char charByUnicode = '\u0041';
        char charByDecimal = 65;
        char charByOctal = '\101';
        System.out.println("\n--- Тип char ---");
        System.out.println("Символ: " + charBySymbol);
        System.out.println("Unicode-код: " + charByUnicode);
        System.out.println("Целочисленный код: " + charByDecimal);
        System.out.println("Восьмеричный код: " + charByOctal);
    }

}
