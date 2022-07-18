package observer;

public class GrandmaListener implements IListener {

	@Override
	public void update(String value) {
		System.out.println("Sou sua avó e fiquei sabendo que: "+value);
	}

}
