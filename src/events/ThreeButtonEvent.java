package events;

public class ThreeButtonEvent {

	private static ThreeButtonEvent instance;

	private ThreeButtonEvent() {

	}

	public static ThreeButtonEvent instance() {
		if (instance == null) {
			instance = new ThreeButtonEvent();
		}
		return instance;
	}
}
