package controller;

import model.Department;
import model.Faculty;
import model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public void addDepartments(Faculty faculty, java.util.List<Department> departments) {
        for (Department d : departments) {
            faculty.addDepartment(d);
        }
    }
}
