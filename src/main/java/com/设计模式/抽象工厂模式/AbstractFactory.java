package com.设计模式.抽象工厂模式;

import com.设计模式.工厂模式.Car;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Car getCar(String carType) ;
}
