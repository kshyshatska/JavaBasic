package org.example.model;

public class Faculty {
    private String name;
    private Human head;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
    }

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

    @Override
    public String toString() {
        return "Faculty: " + name + ", Head: " + head;
    }
}
