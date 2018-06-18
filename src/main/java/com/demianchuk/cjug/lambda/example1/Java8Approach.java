package com.demianchuk.cjug.lambda.example1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8Approach {

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
        Collections.sort(programmers, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // print all programmers
        performConditionally(programmers,
                (p) -> true,
                (p) -> System.out.println(p));

        // print all programmers whose favorite language is Java
        performConditionally(programmers,
                (p) -> p.getFavoriteLanguage().equals("Java"),
                (p) -> System.out.println(p));

    }

    public static void performConditionally(List<Programmer> programmers,
                                            Predicate<Programmer> predicate,
                                            Consumer<Programmer> consumer) {
        for(Programmer programmer : programmers)
            if(predicate.test(programmer))
                consumer.accept(programmer);
    }
}