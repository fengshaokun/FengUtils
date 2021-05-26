package com.lambda;


public class Lambda2 {
    public static void main(String[] args) {
        try {
            String s1 = "\u5e7f\u5c9b\u4e4b\u604b.mp3";
            byte[] converttoBytes = s1.getBytes("UTF-8");
            String s2 = new String(converttoBytes, "UTF-8");
            System.out.println(s2);
          } catch (Exception e) {
            e.printStackTrace();
        }
        }
}
