package com.test;

import java.util.concurrent.atomic.AtomicInteger;

public class RandomTest {


    public static void main(String[] args) {


        StringBuilder a = new StringBuilder();
        for (int i=1;i<4001;i++){
            String s = autoGenericCode(i + "", 11);
            a.append(s);
            a.append(",");
        }
        System.out.println(a.toString());
        System.out.println(a.toString().length());

    }

    private static String autoGenericCode(String code, int num) {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        String result = "";
        // 保留num的位数
        // 0 代表前面补充0
        // num 代表长度为4
        // d 代表参数为正数型
        result = String.format("%0" + num + "d", Integer.parseInt(code));

        return result;
    }/*
    private  synchronized String getGameListByWord(String word) {
        if((System.currentTime - lastLoad)  > 60000){
            lastLoad = System.currentTime();
            new Thread(){
                temp = ......
                data = temp;
            }.start();
        }
        return data.get(word);  //   Map<String,List<String>> data
    }

    }*/

}
