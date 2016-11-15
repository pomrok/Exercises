package spring.in.action.aop;

public class Jackson implements Performer {

	public void perform() throws Exception {
		System.out.println("La LA La la!");
		throw new Exception("");
	}

}
