package spring.in.action.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerform {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("BeansAop.xml");
		Performer performer = (Performer) ctx.getBean("Marry");
		performer.perform();
		((Contestant)performer).receiveAward();


//		Thinker thinker = (Thinker) ctx.getBean("volunteer");
//		thinker.thinkOfSOmething("I think about nothing");
	}

}
