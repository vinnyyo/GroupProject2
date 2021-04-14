package events;

public class SixButtonEvent {

	private static SixButtonEvent instance;

	private SixButtonEvent() {

	}

	public static SixButtonEvent instance() {
		if (instance == null) {
			instance = new SixButtonEvent();
		}
		return instance;
	}
}
