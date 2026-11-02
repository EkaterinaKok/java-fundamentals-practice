package com.ekaterinakok.javabasics.task8.p4;

import com.ekaterinakok.javabasics.task8.p1.A;
import com.ekaterinakok.javabasics.task8.p1.p2.p3.C;
import com.ekaterinakok.javabasics.task8.p4.p5.E;

import static com.ekaterinakok.javabasics.task8.p1.p2.B.VERSION_INFO;
import static com.ekaterinakok.javabasics.task8.p1.p2.B.logStaticMessage;

/**
 * Класс D является центральной точкой управления в пакете p4.
 * Демонстрирует связывание компонентов из различных независимых пакетов
 * с применением механизмов импорта.
 */
public class D {

    /**
     * Главный метод программы, координирующий вызовы методов внешних классов.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== СТАРТ СИСТЕМЫ И ИНИЦИАЛИЗАЦИЯ КОМПОНЕНТОВ ===\n");

        // 1. Использование статических элементов класса B напрямую благодаря `import static`
        // Нам не нужно писать "B.VERSION_INFO" или "B.logStaticMessage()"
        logStaticMessage("Запуск ядра системы. Версия сборки: " + VERSION_INFO);

        // 2. Взаимодействие с классом A из пакета p1 через короткое имя
        A componentA = new A();
        componentA.executeActionA();

        // 3. Взаимодействие с классом C из глубоко вложенного пакета p1.p2.p3 через короткое имя
        C componentC = new C();
        componentC.processDataC();

        // 4. Взаимодействие с классом E из подпакета p5 текущего пакета p4.
        // Даже если p5 находится внутри p4, в Java пакеты не наследуются,
        // поэтому явный import класса E в начале файла был обязателен.
        E componentE = new E();
        componentE.renderInterfaceE();

        System.out.println("\n=== РАБОТА СИСТЕМЫ УСПЕШНО ЗАВЕРШЕНА ===");
    }
}
