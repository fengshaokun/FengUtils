package com.设计模式.单例模式;

/**
 * 饿汉式
 */
public class Singleton4 {
    private static Singleton4 singleton4 = new Singleton4();

    private Singleton4(){};

    public static Singleton4 getInstance(){
        return singleton4;
    }
}
