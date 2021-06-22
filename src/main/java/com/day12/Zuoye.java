package com.day12;

import java.io.*;
import java.util.Scanner;

public class Zuoye {
   

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File src=getDir();
        File dest=getDir();
        if(src.equals(dest)){
            System.out.println("该文件夹为源文件夹的子文件夹");
        }else{
        copy(src,dest);
        }
    }
    private static void copy(File src,File dest) throws IOException {
        // TODO Auto-generated method stub
        //创建一个新文件夹
        File newdir=new File(dest,src.getName());
        newdir.mkdir();
        //获取该文件夹下所有的文件和文件夹listFile(),存储在File数组;
        File[] subfiles=src.listFiles();
        //判断是否是文件
        for (File subfile : subfiles) {
            if(subfile.isFile()){
                //文件的读写，io流只能读写文件，不能读写文件夹
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream(subfile));
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(newdir,subfile.getName())));
                int b;
                while((b=bis.read())!=-1){
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }else{
                //递归调用
                copy(subfile,newdir);
            }
        }
    }
    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        // 定义一个无限循环
        while (true) {
            //将键盘录入的结果存储并封装成File对象
            String line = sc.nextLine();
            File file = new File(line);
            //对File进行判断
            if (!file.exists()) {
                System.out.println("文件夹不存在，请输入一个文件夹路径：");
            } else if (file.isFile()) {
                System.out.println("输入的不是文件夹，请输入一个文件夹路径：");
            } else {
                return file;
            }
        }
    }
}
