package events;

public class TwoButtonEvent {

	private static TwoButtonEvent instance;

	private TwoButtonEvent() {

	}

	public static TwoButtonEvent instance() {
		if (instance == null) {
			instance = new TwoButtonEvent();
		}
		return instance;
	}
}
