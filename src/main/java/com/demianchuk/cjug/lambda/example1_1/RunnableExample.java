package com.demianchuk.cjug.lambda.example1_1;

public class RunnableExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        });

        thread.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
