package com.ekaterinakok.javabasics.task4;

/**
 * Класс OverloadedStudent с демонстрацией перегрузки конструкторов.
 */
public class OverloadedStudent {

    int studentId;
    String firstName;
    String lastName;
    int courseYear;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;

    public OverloadedStudent(int studentId, String firstName, String lastName, int courseYear, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseYear = courseYear;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }

    public OverloadedStudent(int studentId, String firstName, String lastName, int courseYear) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseYear = courseYear;
    }

    public OverloadedStudent() {
    }

    public double calculateAverageGrade() {
        final int totalSubjects = 3;
        return (mathGrade + economicsGrade + foreignLanguageGrade) / totalSubjects;
    }

    @Override
    public String toString() {
        return "OverloadedStudent{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseYear=" + courseYear +
                ", mathGrade=" + mathGrade +
                ", economicsGrade=" + economicsGrade +
                ", foreignLanguageGrade=" + foreignLanguageGrade +
                '}';
    }
}
