package com.glx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		
		
		Triangle tri=(Triangle)con.getBean("tri");
		tri.draw(); 
	
	}

}
