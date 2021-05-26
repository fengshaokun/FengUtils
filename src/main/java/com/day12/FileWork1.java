package com.day12;

import java.io.File;

public class FileWork1 {

    public static void listDirs(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isFile()) {//f是文件就输出
                System.out.println("文件:" + f);
            } else {//f 不是文件,就是目录,需要再一次遍历,调用方法本身
                System.out.print("目录:" + f + "\n");
                listDirs(f);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("d:");
        listDirs(file);
    }
}

