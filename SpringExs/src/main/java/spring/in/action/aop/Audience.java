package spring.in.action.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeates() {
		System.out.println("Widzowie zajmuj� miejsca");
	}

	public void turnOffCellPhons() {
		System.out.println("Widzowie wy��czaj� telefony");
	}

	public void applaud() {
		System.out.println("Brawo! Oklaski!");
	}

	public void demandRefund() {
		System.out.println("Oddajcie kas�!");
	}

	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Widzowie zajmuj� miejsca");
			System.out.println("Widzowie wy��czaj� telefony");

			jp.proceed();

			System.out.println("Brawo! Oklaski!");
		} catch (Throwable t) {
			System.out.println("Oddajcie kas�!");
		}
	}
	
	public void aplaus() {
		System.out.println("Fantastic award - audience claps their hands");
	}
}
