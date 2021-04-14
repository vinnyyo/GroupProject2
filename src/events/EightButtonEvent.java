package events;

public class EightButtonEvent {

	private static EightButtonEvent instance;

	private EightButtonEvent() {

	}

	public static EightButtonEvent instance() {
		if (instance == null) {
			instance = new EightButtonEvent();
		}
		return instance;
	}
}
