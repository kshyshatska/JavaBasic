package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    // Геттери і сеттери
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Human getHead() { return head; }
    public void setHead(Human head) { this.head = head; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "model.Group: " + name + ", Head: " + head + ", Students: " + students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(head, group.head) &&
                Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, students);
    }
}