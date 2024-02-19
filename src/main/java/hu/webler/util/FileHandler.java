package hu.webler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public static String[] readStudentNamesFromFile(String filePath) throws IOException {
        List<String> studentNames = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                studentNames.add(line);
            }
        }
        return studentNames.toArray(new String[0]);
    }

    private FileHandler() {

    }
}
