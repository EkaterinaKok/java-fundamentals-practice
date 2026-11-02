package com.ekaterinakok.javabasics.task7;

/**
 * Класс, представляющий временный объект для демонстрации жизненного цикла.
 * Используется для отслеживания момента создания и уничтожения объектов в памяти.
 */
public class TemporaryObject {

    /** Название объекта для идентификации при выводе в консоль */
    private final String name;

    /**
     * Конструктор для создания нового временного объекта.
     *
     * @param name имя или описание создаваемого объекта
     */
    public TemporaryObject(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя объекта.
     *
     * @return строка с именем объекта
     */
    public String getName() {
        return name;
    }
}
