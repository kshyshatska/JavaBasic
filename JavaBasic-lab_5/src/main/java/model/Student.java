package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String recordBookNumber;

    public Student(int id, String lastName, String firstName, String middleName, String birthDate, String recordBookNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.recordBookNumber = recordBookNumber;
    }

    public int getBirthMonth() {
        return birthDate.getMonthValue();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Дата народження: %s, Залікова: %s",
                lastName, firstName, middleName, birthDate, recordBookNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return id == other.id &&
                lastName.equals(other.lastName) &&
                firstName.equals(other.firstName) &&
                middleName.equals(other.middleName) &&
                birthDate.equals(other.birthDate) &&
                recordBookNumber.equals(other.recordBookNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, middleName, birthDate, recordBookNumber);
    }
}
