package observer;

public class AuntListener implements IListener {

	@Override
	public void update(String value) {
		System.out.println("Sou sua tia e fiquei sabendo que: "+value);
	}

}
