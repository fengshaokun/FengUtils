package com.lambda;


public class Lambda1 {
    interface Printer {
        void printer(String val);
    }

    public void pringSomething(String some, Printer printer) {
        printer.printer(some);
    }

    public static void main(String[] args) {
        Lambda1 l = new Lambda1();
        String some = "yikunxuexi";
   /*     Printer p = new Printer() {
            @Override
            public void printer(String val) {
                System.out.println(val);
            }
        };*/
        l.pringSomething(some, v -> System.out.println(v));
    }
}
