package com.day12;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WorkTest {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/fengshaokun/5000/HelloWorld.java");
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入本行代码");
			String msg = sc.nextLine();
			if("OK".equals(msg)){break;}
			writer.write(msg+"\r\n");
			writer.flush();
		}
		
		writer.close();
	}

}

