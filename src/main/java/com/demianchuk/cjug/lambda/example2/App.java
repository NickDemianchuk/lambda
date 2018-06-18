package com.demianchuk.cjug.lambda.example2;

import java.util.function.BiFunction;

public class App {

    public static void main(String[] args) {
        System.out.println("====== Addition ======");
        perform(4, 5, (a, b) -> a + b);

        System.out.println("\n====== Subtraction ======");
        perform(10, 20, (a, b) -> a - b);

        System.out.println("\n====== Multiplication ======");
        perform(5, 7, (a, b) -> a * b);

        System.out.println("\n====== Division ======");
        perform(9, 0, (a, b) -> b == 0 ? 0 : a / b );
    }

    private static void perform(int a, int b, Calculator calculator) {
        System.out.println(calculator.doMath(a, b));
    }

//    private static void perform(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
//        System.out.println(biFunction.apply(a, b));
//    }
}
