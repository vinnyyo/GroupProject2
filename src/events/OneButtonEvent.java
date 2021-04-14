package events;

public class OneButtonEvent {

	private static OneButtonEvent instance;

	private OneButtonEvent() {

	}

	public static OneButtonEvent instance() {
		if (instance == null) {
			instance = new OneButtonEvent();
		}
		return instance;
	}
}
