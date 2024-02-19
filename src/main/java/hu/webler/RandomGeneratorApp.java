package hu.webler;

import hu.webler.service.GenerateRandomStudent;

import java.io.IOException;

import static hu.webler.util.FileHandler.readStudentNamesFromFile;

public class RandomGeneratorApp {

    private static final String TXT_FILE_PATH = "src/main/resources/names";

    public static void main(String[] args) {

        try {
            String[] studentNames = readStudentNamesFromFile(TXT_FILE_PATH);
            GenerateRandomStudent generator = new GenerateRandomStudent(studentNames);
            System.out.println("Random student: " + generator.getRandomStudent());
        } catch (IOException e) {
            System.err.println("Error reading student names from file: " + e.getMessage());
        }

    }
}
