package spring.in.action.aop;

public class Volunteer implements Thinker {
	String thoughts;
	
	public void thinkOfSOmething(String thougths) {
		this.thoughts = thougths;
	}

	public String getThoughts() {
		return thoughts;
	}

}
