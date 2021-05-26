package com.day12;

import java.io.*;
import java.util.Scanner;

public class Zuoye {
   

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File src=getDir();
        File dest=getDir();
        if(src.equals(dest)){
            System.out.println("���ļ���ΪԴ�ļ��е����ļ���");
        }else{
        copy(src,dest);
        }
    }
    private static void copy(File src,File dest) throws IOException {
        // TODO Auto-generated method stub
        //����һ�����ļ���
        File newdir=new File(dest,src.getName());
        newdir.mkdir();
        //��ȡ���ļ��������е��ļ����ļ���listFile(),�洢��File����;
        File[] subfiles=src.listFiles();
        //�ж��Ƿ����ļ�
        for (File subfile : subfiles) {
            if(subfile.isFile()){
                //�ļ��Ķ�д��io��ֻ�ܶ�д�ļ������ܶ�д�ļ���
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream(subfile));
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(newdir,subfile.getName())));
                int b;
                while((b=bis.read())!=-1){
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }else{
                //�ݹ����
                copy(subfile,newdir);
            }
        }
    }
    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ļ���·����");
        // ����һ������ѭ��
        while (true) {
            //������¼��Ľ���洢����װ��File����
            String line = sc.nextLine();
            File file = new File(line);
            //��File�����ж�
            if (!file.exists()) {
                System.out.println("�ļ��в����ڣ�������һ���ļ���·����");
            } else if (file.isFile()) {
                System.out.println("����Ĳ����ļ��У�������һ���ļ���·����");
            } else {
                return file;
            }
        }
    }
}
