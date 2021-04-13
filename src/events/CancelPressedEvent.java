package events;

public class CancelPressedEvent {

	private static CancelPressedEvent instance;
	
	private CancelPressedEvent() {
		
	}
	
	public static CancelPressedEvent instance() {
		if (instance == null) {
			instance = new CancelPressedEvent();
		}
		return instance;
	}
}
