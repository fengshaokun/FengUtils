package com.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author yk
 * @version 1.0
 * @date 2021-01-22 21:27
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        String str = "a1b2c3d12##!@!@$%3efd";
        String s = removeChar(str);
        System.out.println(s);
    }


   static  String  removeChar(String str){

        String charStr =  "#,$,%,^,&,!,@";
        List<String> strings = Arrays.asList(charStr.split(","));
        for (String s:strings){
            if (str.contains(s)){
                str = str.replace(s,"");
            }
        }
        return str;


    }

}
