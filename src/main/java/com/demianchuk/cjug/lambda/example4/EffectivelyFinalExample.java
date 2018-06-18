package com.demianchuk.cjug.lambda.example4;

public class EffectivelyFinalExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        doProcess(x, a -> {
            // y = 21; This will not work
            System.out.println(a + y);

        });
    }

    public static void doProcess(int x, Process p) {
        p.process(x);
    }
}
