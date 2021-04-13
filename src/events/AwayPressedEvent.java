package events;

public class AwayPressedEvent {

	private static AwayPressedEvent instance;
	
	private AwayPressedEvent() {
		
	}
	
	public static AwayPressedEvent instance() {
		if (instance == null) {
			instance = new AwayPressedEvent();
		}
		return instance;
	}
}
