package spring.in.action.aop;

import org.aspectj.lang.JoinPoint;

public class Magician implements MindReader {

	String thoughts;

	public void interceptThouths(JoinPoint jp, String thought) {
		System.out.println("Magician intercepts thought: " + thoughts);
		this.thoughts = thought;
	}

	public String getThoughts() {
		return thoughts;
	}

}
