package com.设计模式.单例模式;

/**
 * 单例模式
 */
public class SingleObject {
    //创建 SingleObject的一个对象
    private static SingleObject singleObject = new SingleObject();
    // 让构造函数为private，这样该类就不会呗实例化
    private SingleObject(){};
    // 获取可用对象
    public static SingleObject getSingleObject(){
        return singleObject;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }

}
