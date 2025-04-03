package main;

import model.Student;
import repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRepository studentRepo = new StudentRepository();

        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        System.out.println("\n🔹 Студенти, народжені у " + month + "-му місяці:");
        List<Student> students = studentRepo.getStudentsByMonth(month);

        if (students.isEmpty()) {
            System.out.println("Немає студентів, народжених у цьому місяці.");
        } else {
            students.forEach(System.out::println);
        }
    }
}
