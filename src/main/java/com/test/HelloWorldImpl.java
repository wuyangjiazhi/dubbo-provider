package com.test;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String username) {
		System.out.println("欢迎访问:"+username);
		return "您好:"+username;
	}

	
}
