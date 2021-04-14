package events;

public class FourButtonEvent {

	private static FourButtonEvent instance;

	private FourButtonEvent() {

	}

	public static FourButtonEvent instance() {
		if (instance == null) {
			instance = new FourButtonEvent();
		}
		return instance;
	}
}
