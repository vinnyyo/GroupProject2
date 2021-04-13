package events;

public class StayPressedEvent {

	private static StayPressedEvent instance;
	
	private StayPressedEvent() {
		
	}
	
	public static StayPressedEvent instance() {
		if (instance == null) {
			instance = new StayPressedEvent();
		}
		return instance;
	}
}
