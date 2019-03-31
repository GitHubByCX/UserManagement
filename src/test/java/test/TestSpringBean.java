package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
		
		System.out.println(ac.getBean("sessionFactory"));
		
	}

}
