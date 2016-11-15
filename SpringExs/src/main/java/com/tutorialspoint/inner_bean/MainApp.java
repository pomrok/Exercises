package com.tutorialspoint.inner_bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansInner.xml");

		TextEditor textEditor = (TextEditor) context.getBean("textEditor");

		textEditor.spellCheck();

		TextEditor textEditor2 = (TextEditor) context.getBean("textEditor2");

		textEditor2.spellCheck();
	}
}
