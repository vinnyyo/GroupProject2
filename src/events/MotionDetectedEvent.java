package events;

/**
 * The event for motion detected
 * Singleton Class
 * @author Michael Olson
 *
 */public class MotionDetectedEvent {

	private static MotionDetectedEvent instance;
	
	/**
	 * private for singleton
	 */
	private MotionDetectedEvent() {
		
	}
	
	/**
	 * to get an instance of the singleton
	 * @return an instance
	 */
	public static MotionDetectedEvent instance() {
		if (instance == null) {
			instance = new MotionDetectedEvent();
		}
		return instance;
	}
}
