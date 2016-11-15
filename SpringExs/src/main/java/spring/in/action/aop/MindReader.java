package spring.in.action.aop;

import org.aspectj.lang.JoinPoint;

public interface MindReader {
	void interceptThouths(JoinPoint jp, String thought);

	String getThoughts();
}
