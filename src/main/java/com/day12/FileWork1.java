package com.day12;

import java.io.File;

public class FileWork1 {

    public static void listDirs(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isFile()) {//f���ļ������
                System.out.println("�ļ�:" + f);
            } else {//f �����ļ�,����Ŀ¼,��Ҫ��һ�α���,���÷�������
                System.out.print("Ŀ¼:" + f + "\n");
                listDirs(f);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("d:");
        listDirs(file);
    }
}

