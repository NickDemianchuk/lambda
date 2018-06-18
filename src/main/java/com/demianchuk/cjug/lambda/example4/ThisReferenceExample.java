package com.demianchuk.cjug.lambda.example4;

public class ThisReferenceExample {

    public void doProcess(int x, Process p) {
        p.process(x);
    }

    public void execute() {
        doProcess(10, (x) -> {
            System.out.println("Value of x is " + x);
            System.out.println(this);
        });
    }
    
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(10, new Process() {

            @Override
            public void process(int x) {
                System.out.println("Value of x is " + x);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is anonymous inner class reference";
            }
        });

        thisReferenceExample.execute();
    }

    @Override
    public String toString() {
        return "This is ThisReferenceExample reference";
    }
}
