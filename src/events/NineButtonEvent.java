package events;

public class NineButtonEvent {

	private static NineButtonEvent instance;

	private NineButtonEvent() {

	}

	public static NineButtonEvent instance() {
		if (instance == null) {
			instance = new NineButtonEvent();
		}
		return instance;
	}
}
