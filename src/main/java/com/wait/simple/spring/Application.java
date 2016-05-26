package com.wait.simple.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		TestChildClassA testClassA=(TestChildClassA) context.getBean("classA");
//		print(testClassA.getAddress()); print(testClassA.getConfiguration()); print(testClassA.getTextChildClass());
//		
//		TestChildClassB testClassB=(TestChildClassB) context.getBean("classB");
//		print(testClassB.getAddress()); print(testClassB.getConfiguration()); print(testClassB.getTextChildClass());
		
		TestChildClassA testFromFactory = (TestChildClassA) context.getBean("classDataWSFactory");
		print(testFromFactory.getClass().getSimpleName()); print(testFromFactory.getAddress());
		
		TestChildClassB testFromFactoryB = (TestChildClassB) context.getBean("antScanWSFactory");
		print(testFromFactoryB.getClass().getSimpleName()); print(testFromFactoryB.getAddress());
		
		
	}
	
	public static void print(String print) {
		System.out.println(print);
	}
}
