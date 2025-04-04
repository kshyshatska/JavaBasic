package controller;

import model.Sex;
import model.Student;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        return new Student(firstName, lastName, patronymic, sex);
    }
}
