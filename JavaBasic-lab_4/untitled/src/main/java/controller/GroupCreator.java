package controller;

import model.Group;
import model.Human;
import model.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public void addStudents(Group group, List<Student> students) {
        for (Student s : students) {
            group.addStudent(s);
        }
    }
}

