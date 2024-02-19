package hu.webler.service;

import java.util.Random;

public class GenerateRandomStudent {

    private String[] students;
    private Random random;

    public GenerateRandomStudent(String[] students) {
        this.students = students;
        this.random = new Random();
    }

    public String getRandomStudent() {
        int randomIndex = random.nextInt(students.length);
        return students[randomIndex];
    }
}
