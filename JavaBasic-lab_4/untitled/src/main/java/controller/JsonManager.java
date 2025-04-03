package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Запис університету у файл
    public static void writeUniversityToFile(University university, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(university, writer);
        }
    }

    // Зчитування університету з файлу
    public static University readUniversityFromFile(String filename) throws IOException {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, University.class);
        }
    }

    // Перетворення університету у JSON-рядок
    public static String universityToJson(University university) {
        return gson.toJson(university);
    }

    // Створення університету з JSON-рядка
    public static University jsonToUniversity(String json) {
        return gson.fromJson(json, University.class);
    }
}
