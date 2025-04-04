package org.example.controller;

import org.example.model.*;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university);
    }

    public static University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human universityHead = new Human("Іван", "Іваненко", "Іванович", Sex.MALE);
        University university = universityCreator.createUniversity("Національний Університет", universityHead);

        Human facultyHead = new Human("Марія", "Петрівна", "Сергіївна", Sex.FEMALE);
        Faculty faculty = facultyCreator.createFaculty("Факультет інформатики", facultyHead);

        Human departmentHead = new Human("Олександр", "Сидоров", "Петрович", Sex.MALE);
        Department department = departmentCreator.createDepartment("Кафедра програмування", departmentHead);

        Human groupHead = new Human("Світлана", "Коваленко", "Олександрівна", Sex.FEMALE);
        Group group = groupCreator.createGroup("Група-101", groupHead);

        Student student1 = studentCreator.createStudent("Андрій", "Бойко", "Михайлович", Sex.MALE);
        Student student2 = studentCreator.createStudent("Олена", "Захарченко", "Василівна", Sex.FEMALE);

        university.addFaculty(faculty);

        System.out.println("Створено університет з наступною структурою:");
        System.out.println("Університет: " + university.getName());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Кафедра: " + department.getName());
        System.out.println("Група: " + group.getName());
        System.out.println("Студенти: " + student1 + ", " + student2);

        return university;
    }
}
