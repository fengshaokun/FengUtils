package com.设计模式.抽象工厂模式;

import com.设计模式.工厂模式.AoDi;
import com.设计模式.工厂模式.BaoMa;
import com.设计模式.工厂模式.BenChi;
import com.设计模式.工厂模式.Car;

public  class ColorFactory  extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color==null){
            return null;
        }
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }
        if (color.equalsIgnoreCase("green")){
            return new Green();
        }
        if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Car getCar(String carType) {
        return null;
    }
}
