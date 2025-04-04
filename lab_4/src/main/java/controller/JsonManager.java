package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void writeUniversityToFile(University university, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readUniversityFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
