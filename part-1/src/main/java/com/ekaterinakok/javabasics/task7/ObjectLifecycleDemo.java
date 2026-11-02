package com.ekaterinakok.javabasics.task7;

/**
 * Демонстрационный класс для изучения типов переменных и жизненного цикла объектов.
 * В методе {@link #main(String[])} создается 8 объектов различными способами,
 * но к финальной строке метода активные ссылки остаются только у 2 объектов.
 */
public class ObjectLifecycleDemo {

    private static TemporaryObject staticObj;

    public static void main(String[] args) {

        // --- СПОСОБ 1: Прямое присвоение в локальную переменную (ЭТОТ ОБЪЕКТ ВЫЖИВЕТ №1)
        TemporaryObject survivor1 = new TemporaryObject("Выживший 1 (Локальная переменная)");

        // --- СПОСОБ 2: Запись в статическую переменную класса (ЭТОТ ОБЪЕКТ ВЫЖИВЕТ №2)
        staticObj = new TemporaryObject("Выживший 2 (Статическое поле)");


        // --- СПОСОБ 3: Анонимный объект (умрет сразу после создания, так как нет ссылки)
        new TemporaryObject("Анонимный объект (Сразу доступен для GC)");


        // --- СПОСОБ 4: Обнуление ссылки (null)
        TemporaryObject objToNull = new TemporaryObject("Объект для обнуления");
        objToNull = null; // Ссылка стерта, объект стал недоступен


        // --- СПОСОБ 5: Перезапись ссылки другой ссылкой
        TemporaryObject objToOverwrite = new TemporaryObject("Объект для перезаписи");
        objToOverwrite = survivor1; // Ссылка перезаписана, первый объект потерян


        // --- СПОСОБ 6: Ограничение областью видимости локального блока {}
        {
            TemporaryObject blockScopedObj = new TemporaryObject("Объект внутри блока {}");
            // blockScopedObj виден и доступен только внутри этих фигурных скобок
        }
        // Здесь blockScopedObj уже вышел из области видимости и недоступен


        // --- СПОСОБ 7: Создание внутри вызываемого метода
        createAndDropObject(); // Объект внутри метода уничтожится при выходе из него


        // --- СПОСОБ 8: Объект внутри локального массива
        createObjectInArray();


        // ПОСЛЕДНЯЯ СТРОКА:
        // На данном этапе доступны ТОЛЬКО:
        // 1. survivor1 (Способ 1)
        // 2. staticObj (Способ 2)
        System.out.println("Программа завершена. Живы объекты: "
                + survivor1.getName() + " и " + staticObj.getName());
    }

    /**
     * Создает объект внутри метода.
     * Ссылка на объект является локальной для данного метода и уничтожается при его завершении.
     */
    private static void createAndDropObject() {
        TemporaryObject methodScopedObj = new TemporaryObject("Объект внутри метода");
    }

    /**
     * Создает объект и помещает его в массив.
     * Так как сам массив локален для метода, после выхода из метода массив и его элементы теряются.
     */
    private static void createObjectInArray() {
        TemporaryObject[] array = new TemporaryObject[]{ new TemporaryObject("Объект в массиве") };
    }
}
