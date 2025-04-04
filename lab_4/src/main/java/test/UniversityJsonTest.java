package test;

import controller.JsonManager;
import controller.Run;
import model.University;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class UniversityJsonTest {

    @Test
    public void testUniversityJsonSerialization() {
        String fileName = "test_university.json";

        // Створення університету з потрібною структурою:
        University oldUniversity = Run.createTypicalUniversity();

        // Запис у JSON файл
        JsonManager.writeUniversityToFile(oldUniversity, fileName);

        // Зчитування з файлу
        University newUniversity = JsonManager.readUniversityFromFile(fileName);


        // Перевірка еквівалентності через equals
        assertEquals("Університети мають бути еквівалентними", oldUniversity, newUniversity);

    }

}
