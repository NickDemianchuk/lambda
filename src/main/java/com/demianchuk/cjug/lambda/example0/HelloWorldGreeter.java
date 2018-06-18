package com.demianchuk.cjug.lambda.example0;

public class HelloWorldGreeter implements Greeter {
    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}
