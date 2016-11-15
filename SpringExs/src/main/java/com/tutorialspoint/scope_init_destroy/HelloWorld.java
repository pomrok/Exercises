package com.tutorialspoint.scope_init_destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialization takes place");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposal takes place");
	}

	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init() takes place");
	}

	public void dispose() {
		// TODO Auto-generated method stub
		System.out.println("dispose() takes place");
	}

	public void init0() {
		// TODO Auto-generated method stub
		System.out.println("init0() takes place");
	}

	public void dispose0() {
		// TODO Auto-generated method stub
		System.out.println("dispose0() takes place");
	}
}
