package com.设计模式.工厂模式;

public class Test {

    public static void main(String[] args) {

        CaeFactory caeFactory = new CaeFactory();
        Car aodi = caeFactory.getCar("aodi");
        aodi.run();
        Car baoma = caeFactory.getCar("baoma");
        baoma.run();
        Car benchi = caeFactory.getCar("benchi");
        benchi.run();
    }
}
