package com.设计模式.抽象工厂模式;

import com.设计模式.工厂模式.Car;

public class Test {
    public static void main(String[] args) {

        AbstractFactory abstractFactory =FactoryProducer.getFactory("car");
        Car aodi = abstractFactory.getCar("aodi");
        aodi.run();
        Car benchi = abstractFactory.getCar("benchi");
        benchi.run();

        AbstractFactory color =FactoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();
        Color blue = color.getColor("blue");
        blue.fill();

    }
}
