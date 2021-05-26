package com.day11;

import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
public static void main(String[] args) throws IOException {
	Properties a = new Properties();
	a.load(PropertiesTest.class.getClassLoader().getResourceAsStream("fengshaokun"));
	
	a.list(System.out);
}
}
