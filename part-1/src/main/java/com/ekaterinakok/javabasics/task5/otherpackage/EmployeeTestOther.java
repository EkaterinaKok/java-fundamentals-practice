package com.ekaterinakok.javabasics.task5.otherpackage;

import com.ekaterinakok.javabasics.task5.samepackage.Employee;

public class EmployeeTestOther {

    public static void main(String[] args) {
        System.out.println("=== Тест внутри того же пакета ===\n");

        Employee emp1 = new Employee("Ganin");
        //Employee emp2 = new Employee(1, "Ivanov"); - не даст из-за модификатора default
        //Employee emp1 = new Employee(100500.7); - не даст из-за модификатора private

        //emp1.id = 10; - не даст из-за модификатора default
        emp1.surname = "Titov";
        //emp1.salary = 1000; - не даст из-за модификатора private

        System.out.println("Вывод напрямую через println: Surname = " + emp1.surname);

        System.out.println("\nВывод через методы самого класса:");
        emp1.printId();
        emp1.printSurname();
        emp1.printSalary();
    }

}
