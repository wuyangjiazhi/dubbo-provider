package com.test;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="classpath*:META-INF/spring/*.xml";
		String [] configPath=path.split("[,\\s]+");
		System.out.println(configPath);
		for(String s : configPath)
			System.out.println(s);
		
		
		System.setSecurityManager(new SecurityManager(){

			@Override
			public void checkExit(int status) {
				// TODO Auto-generated method stub
				super.checkExit(status);
				throw new ThreadDeath();
			}
			
		});
		
		try {
			System.exit(0);
		} finally{
			System.out.println("finally");
			System.out.println("OK!!!");
			System.out.println("OK!!!");
			System.out.println("OK!!!");
		}
	}

}
