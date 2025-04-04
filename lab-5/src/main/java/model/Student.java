package model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String recordBookNumber;

    public Student(int id, String lastName, String firstName, String middleName, LocalDate birthDate, String recordBookNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.recordBookNumber = recordBookNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, дата народження: %s, залікова книжка: %s",
                lastName, firstName, middleName, birthDate, recordBookNumber);
    }
}
