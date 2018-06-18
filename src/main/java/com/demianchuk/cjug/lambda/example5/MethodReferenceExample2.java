package com.demianchuk.cjug.lambda.example5;

import java.util.Arrays;
import java.util.function.Supplier;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        Student student1 = getInstance(Student::new);
        Student student2 = getInstance(Student::new);

        student1.setName("Brian");
        student2.setName("Andrew");

        Student[] students = { student1, student2 };
        Arrays.sort(students,  (s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println(students);
    }

    private static Student getInstance(Supplier<Student> supplier) {
        return supplier.get();
    }
}
