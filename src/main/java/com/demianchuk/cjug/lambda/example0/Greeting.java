package com.demianchuk.cjug.lambda.example0;

public class Greeting {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.perform();
    }

    private void perform() {
        System.out.println("Hello World!");
    }
}
