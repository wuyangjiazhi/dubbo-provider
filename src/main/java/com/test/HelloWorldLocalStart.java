package com.test;

import java.io.IOException;
import java.util.ServiceLoader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldLocalStart {

	public static void main(String[] args) {
		ApplicationContext act=new ClassPathXmlApplicationContext("spring-local.xml");
		HelloWorld hw=(HelloWorld)act.getBean("helloWorld");
		System.out.println(hw.sayHello("张三"));
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
