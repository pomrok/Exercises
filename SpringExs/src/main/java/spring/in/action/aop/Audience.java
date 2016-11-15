package spring.in.action.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeates() {
		System.out.println("Widzowie zajmuj¹ miejsca");
	}

	public void turnOffCellPhons() {
		System.out.println("Widzowie wy³¹czaj¹ telefony");
	}

	public void applaud() {
		System.out.println("Brawo! Oklaski!");
	}

	public void demandRefund() {
		System.out.println("Oddajcie kasê!");
	}

	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Widzowie zajmuj¹ miejsca");
			System.out.println("Widzowie wy³¹czaj¹ telefony");

			jp.proceed();

			System.out.println("Brawo! Oklaski!");
		} catch (Throwable t) {
			System.out.println("Oddajcie kasê!");
		}
	}
	
	public void aplaus() {
		System.out.println("Fantastic award - audience claps their hands");
	}
}
