package events;

public class MotionDetectedEvent {

	private static MotionDetectedEvent instance;
	
	private MotionDetectedEvent() {
		
	}
	
	public static MotionDetectedEvent instance() {
		if (instance == null) {
			instance = new MotionDetectedEvent();
		}
		return instance;
	}
}
