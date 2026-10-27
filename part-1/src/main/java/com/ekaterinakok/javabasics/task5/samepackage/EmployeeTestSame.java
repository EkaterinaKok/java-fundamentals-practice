package com.ekaterinakok.javabasics.task5.samepackage;

public class EmployeeTestSame {

    public static void main(String[] args) {
        System.out.println("=== Тест внутри того же пакета ===\n");

        Employee emp1 = new Employee("Popov");
        Employee emp2 = new Employee(1, "Ivanov");
        //Employee emp1 = new Employee(100500.7); - не даст из-за модификатора private

        emp1.id = 10;
        emp1.surname = "Smirnov";
        //emp1.salary = 1000; - не даст из-за модификатора private

        emp2.id = 20;
        emp2.surname = "Davidov";
        //emp2.salary = 2000;

        System.out.println("Вывод напрямую через println: ID = " + emp1.id + ", Surname = " + emp1.surname);

        System.out.println("\nВывод через методы самого класса:");
        emp1.printId();
        emp1.printSurname();
        emp1.printSalary();
        emp2.printId();
        emp2.printSurname();
        emp2.printSalary();
    }

}
