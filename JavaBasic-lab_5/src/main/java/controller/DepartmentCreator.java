package controller;

import model.Department;
import model.Group;
import model.Human;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public void addGroups(Department department, java.util.List<Group> groups) {
        for (Group g : groups) {
            department.addGroup(g);
        }
    }
}
