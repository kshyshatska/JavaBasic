package controller;

import model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Run {

    public static University createTypicalUniversity() {
        // Створюємо голову університету
        Human uniHead = new Human("Іван", "Іванов", "Іванович", Sex.MALE);
        University university = UniversityCreator.createUniversity("Університет", uniHead);

        // Приклад: створюємо один факультет з двома кафедрами,
        // кожна кафедра – з двома групами, і в кожній групі – два студенти.
        for (int f = 1; f <= 1; f++) {
            Human facHead = new Human("Федір" + f, "Федоров", "Федорович", Sex.MALE);
            Faculty faculty = FacultyCreator.createFaculty("Факультет " + f, facHead);

            for (int d = 1; d <= 2; d++) {
                Human depHead = new Human("Дмитро" + d, "Дмитров", "Дмитрович", Sex.MALE);
                Department department = DepartmentCreator.createDepartment("Кафедра " + d, depHead);

                for (int g = 1; g <= 2; g++) {
                    Human groupHead = new Human("Олексій" + g, "Олексійов", "Олексійович", Sex.MALE);
                    Group group = GroupCreator.createGroup("Група " + g, groupHead);

                    for (int s = 1; s <= 2; s++) {
                        Student student = StudentCreator.createStudent("Студент" + s, "Прізвище" + s, "Побатькович" + s, Sex.FEMALE);
                        group.addStudent(student);
                    }
                    department.addGroup(group);
                }
                faculty.addDepartment(department);
            }
            university.addFaculty(faculty);
        }
        return university;
    }

    public static void main(String[] args) {
        University university = createTypicalUniversity();
        String fileName = "university.json";

        // Запис у файл
        JsonManager.writeUniversityToFile(university, fileName);
        System.out.println("Університет записано у файл: " + fileName);

        // Зчитування з файлу
        University restoredUniversity = JsonManager.readUniversityFromFile(fileName);

        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(restoredUniversity);

        System.out.println("Дані університету:\n" + prettyJson);
    }
}
