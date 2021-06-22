package com.设计模式.抽象工厂模式;

import com.设计模式.工厂模式.AoDi;
import com.设计模式.工厂模式.BaoMa;
import com.设计模式.工厂模式.BenChi;
import com.设计模式.工厂模式.Car;

public class CarFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Car getCar(String carType) {
        if (carType==null){
            return null;
        }
        if (carType.equalsIgnoreCase("aodi")){
            return new AoDi();
        }
        if (carType.equalsIgnoreCase("baoma")){
            return new BaoMa();
        }
        if (carType.equalsIgnoreCase("benchi")){
            return new BenChi();
        }
        return null;

    }
}
