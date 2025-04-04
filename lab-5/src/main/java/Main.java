import db.DBManager;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBManager manager = new DBManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        List<Student> students = manager.getStudentsByMonth(month);
        if (students.isEmpty()) {
            System.out.println("Студентів, які народилися в цьому місяці, не знайдено.");
        } else {
            System.out.println("Список студентів:");
            students.forEach(System.out::println);
        }
    }
}
