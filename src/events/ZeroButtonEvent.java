package events;

public class ZeroButtonEvent {

	private static ZeroButtonEvent instance;

	private ZeroButtonEvent() {

	}

	public static ZeroButtonEvent instance() {
		if (instance == null) {
			instance = new ZeroButtonEvent();
		}
		return instance;
	}
}
