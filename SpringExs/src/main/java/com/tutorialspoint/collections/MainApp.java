package com.tutorialspoint.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansCollections.xml");
		JavaCollections bean = (JavaCollections) context.getBean("collections", JavaCollections.class);
		bean.getList();
		bean.getMap();
		bean.getProps();
		bean.getSet();
	}

}
