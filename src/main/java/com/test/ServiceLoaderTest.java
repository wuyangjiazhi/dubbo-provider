package com.test;

public class ServiceLoaderTest {

	public static int age=18;
	
	public static void main(String[] args) {
		Class clazz=ServiceLoaderTest.class;
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		try {
			System.out.println(loader);
			Object obj=clazz.cast(Class.forName(ServiceLoaderTest.class.getName(), true, loader).newInstance());
			System.out.println(obj);
			ServiceLoaderTest slt=(ServiceLoaderTest)obj;
			System.out.println(slt.age);
			System.out.println(slt.getClass().getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		String ln=ServiceLoaderTest.class.getName()+"int";
		int cp = ln.codePointAt(0);
		System.out.println("cp="+cp);
        for (int i = Character.charCount(cp); i < ln.length(); i += Character.charCount(cp)) {
             cp = ln.codePointAt(i);
             System.out.println("i="+i+",cp="+cp+","+Character.charCount(cp));
             if (!Character.isJavaIdentifierPart(cp) && (cp != '.'))
                 System.out.println("Illegal provider-class name: " + ln);
         }
	}

}
