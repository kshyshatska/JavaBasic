package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    // Додати факультет
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Human getHead() {
        return head;
    }
    public void setHead(Human head) {
        this.head = head;
    }
    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("University: " + name + ", Head: " + head + "\nFaculties:\n");
        for (Faculty f : faculties) {
            sb.append(f.toString()).append("\n");
        }
        return sb.toString();
    }
}
