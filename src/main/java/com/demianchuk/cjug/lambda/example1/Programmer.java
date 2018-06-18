package com.demianchuk.cjug.lambda.example1;

public class Programmer {

    public enum Gender {
        MALE, FEMALE
    }
    private String firstName;
    private String lastName;
    private Gender gender;
    private String favoriteLanguage;

    public Programmer(String firstName, String lastName, Gender gender, String favoriteLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    @Override
    public String toString() {
        return "====== Programmer ======" +
                "\n\t Name: " + firstName + " " + lastName +
                ",\n\t Gender: " + gender +
                ",\n\t Favorite Language: " + favoriteLanguage;
    }
}
