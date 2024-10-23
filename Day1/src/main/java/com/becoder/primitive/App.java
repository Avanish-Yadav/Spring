package com.becoder.primitive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/becoder/primitive/configure.xml");
		student st1=context.getBean("st1",student.class);
		student st2=context.getBean("st2",student.class);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("Hello Bhai");
		System.out.println("This is new commit");		}
}
