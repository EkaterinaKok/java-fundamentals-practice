package com.ekaterinakok.javabasics.task8.p1.p2;

/**
 * Класс B, расположенный в подпакете p2.
 * Содержит статические элементы для демонстрации возможностей `import static`.
 */
public class B {

    public static final String VERSION_INFO = "v2.4.8-RELEASE";

    /**
     * Статический утилитарный метод для логирования состояния системы.
     */
    public static void logStaticMessage(String message) {
        System.out.println("[Класс B (static метод)]: " + message);
    }
}
