package events;

public class FiveButtonEvent {

	private static FiveButtonEvent instance;

	private FiveButtonEvent() {

	}

	public static FiveButtonEvent instance() {
		if (instance == null) {
			instance = new FiveButtonEvent();
		}
		return instance;
	}
}
