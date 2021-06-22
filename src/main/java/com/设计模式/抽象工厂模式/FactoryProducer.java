package com.设计模式.抽象工厂模式;

import com.设计模式.工厂模式.Car;

public class FactoryProducer {

    public static  AbstractFactory getFactory(String choice){
          if (choice.equalsIgnoreCase("car")){
              return new CarFactory();
          }else if (choice.equalsIgnoreCase("color")){
              return new ColorFactory();
          }
          return null;
    }

}
