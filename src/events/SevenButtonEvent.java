package events;

public class SevenButtonEvent {

	private static SevenButtonEvent instance;

	private SevenButtonEvent() {

	}

	public static SevenButtonEvent instance() {
		if (instance == null) {
			instance = new SevenButtonEvent();
		}
		return instance;
	}
}
