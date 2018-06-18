package com.demianchuk.cjug.lambda.example1;

import java.util.*;

public class Java7Approach {

    public static void main(String[] args) {

        List<Programmer> programmers = Arrays.asList(
                new Programmer("Mary", "Grygleski", Programmer.Gender.FEMALE, "Java"),
                new Programmer("Janine", "Patterson", Programmer.Gender.FEMALE, "Java"),
                new Programmer("Todd", "Ginsberg", Programmer.Gender.MALE, "Kotlin"),
                new Programmer("Freddy", "Guime", Programmer.Gender.MALE, "Python"),
                new Programmer("Bob", "Paulin", Programmer.Gender.MALE, "Ruby"),
                new Programmer("Nick", "Demianchuk", Programmer.Gender.MALE, "Java")
        );

        // sort by last name
        Collections.sort(programmers, new Comparator<Programmer>() {
            public int compare(Programmer p1, Programmer p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        // print all programmers
        System.out.println("--- All programmers ---");
        printConditionally(programmers, new Condition() {
            @Override
            public boolean test(Programmer programmer) {
                return true;
            }
        });

        // print all programmers whose favorite language is Java
        System.out.println("\n--- Programmers whose favorite language is Java ---");
        printConditionally(programmers, new Condition() {
            @Override
            public boolean test(Programmer programmer) {
                return programmer.getFavoriteLanguage().equals("Java");
            }
        });
    }

    public static void printConditionally(List<Programmer> programmers, Condition condition) {
        for (Programmer programmer : programmers)
            if (condition.test(programmer))
                System.out.println(programmer);

    }
}