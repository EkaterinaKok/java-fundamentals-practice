package com.ekaterinakok.javabasics.task3;

/**
 * Класс, представляющий модель студента, его академическую успеваемость,
 * среднюю арифметическую оценку студента по всем предметам.
 */
public class Student {

    int studentId;
    String firstName;
    String lastName;
    int courseYear;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;

    public Student(int studentId, String firstName, String lastName, int courseYear, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseYear = courseYear;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }

    public double calculateAverageGrade() {
        final int totalSubjects = 3;
        return (mathGrade + economicsGrade + foreignLanguageGrade) / totalSubjects;
    }

    @Override
    public String toString() {
        return "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'';
    }

}
