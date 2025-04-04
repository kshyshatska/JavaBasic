package org.example.model;

public class Group {
    private String name;
    private Human head;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
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

    @Override
    public String toString() {
        return "Group: " + name + ", Head: " + head;
    }
}
