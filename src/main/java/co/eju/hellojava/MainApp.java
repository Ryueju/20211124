package co.eju.hellojava;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = // IoC를 사용하겠다는 뜻
				new GenericXmlApplicationContext("classpath:applicationConfig.xml");
		WalkClass walkClass = ctx.getBean("walk", WalkClass.class);
		
		walkClass.run();
		System.out.println("Hello Spring");
//		WalkClass walkClass = new WalkClass();
//		walkClass.run();
	}
}
