package events;

public class CorrectCodeEvent {

	private static CorrectCodeEvent instance;

	private CorrectCodeEvent() {

	}

	public static CorrectCodeEvent instance() {
		if (instance == null) {
			instance = new CorrectCodeEvent();
		}
		return instance;
	}
}
