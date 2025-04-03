package test;

import static org.junit.Assert.assertEquals;

import controller.JsonManager;
import controller.UniversityCreator;
import controller.FacultyCreator;
import controller.DepartmentCreator;
import controller.GroupCreator;
import controller.StudentCreator;
import model.University;
import model.Faculty;
import model.Department;
import model.Group;
import model.Student;
import model.Human;
import model.Sex;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class UniversityJsonTest {

    @Test
    public void testUniversityJsonSerialization() throws IOException {

        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human uniHead = new Human("Університет", "Головний", "Керівник", Sex.MALE);
        University oldUniversity = universityCreator.createUniversity("Old University", uniHead);

        for (int f = 1; f <= 2; f++) {
            Human facHead = new Human("Faculty" + f, "Head", "X", Sex.FEMALE);
            Faculty faculty = facultyCreator.createFaculty("Faculty" + f, facHead);
            for (int d = 1; d <= 2; d++) {
                Human depHead = new Human("Department" + d, "Head", "Y", Sex.MALE);
                Department department = departmentCreator.createDepartment("Department" + d, depHead);
                for (int g = 1; g <= 2; g++) {
                    Human groupHead = new Human("Group" + g, "Head", "Z", Sex.FEMALE);
                    Group group = groupCreator.createGroup("Group" + g, groupHead);
                    for (int s = 1; s <= 2; s++) {
                        Student student = studentCreator.createStudent("Student" + s, "Surname" + s, "Middle" + s, Sex.MALE);
                        group.addStudent(student);
                    }
                    department.addGroup(group);
                }
                faculty.addDepartment(department);
            }
            oldUniversity.addFaculty(faculty);
        }

        // Запис у файл
        String filename = "university.json";
        JsonManager.writeUniversityToFile(oldUniversity, filename);

        // Зчитування з файлу як newUniversity
        University newUniversity = JsonManager.readUniversityFromFile(filename);

        // Видалення тестового файлу (опціонально)
        new File(filename).delete();

        // Перевірка еквівалентності
        assertEquals("Університети мають бути рівними", oldUniversity, newUniversity);
    }
}
