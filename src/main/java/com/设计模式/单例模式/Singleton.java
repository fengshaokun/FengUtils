package com.设计模式.单例模式;

/***
 * 懒汉式单例,线程不安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){};

    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!-----> Singleton");
    }
}
