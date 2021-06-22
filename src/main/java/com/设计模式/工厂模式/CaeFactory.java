package com.设计模式.工厂模式;

public class CaeFactory {



    public Car getCar(String carType){
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
