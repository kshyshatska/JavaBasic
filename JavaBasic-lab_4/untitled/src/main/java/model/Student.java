package model;

public class Student extends Human {

    public Student(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }

    @Override
    public String toString() {
        return "model.Student: " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Student) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
