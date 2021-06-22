package com.设计模式.抽象工厂模式;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色的");
    }
}
