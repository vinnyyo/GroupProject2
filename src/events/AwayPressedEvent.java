package events;

/**
 * The event for pressing the away button
 * Singleton Class
 * @author Michael Olson
 *
 */
public class AwayPressedEvent {
	private static AwayPressedEvent instance;
	
	/**
	 * private for singleton
	 */
	private AwayPressedEvent() {
		
	}
	
	/**
	 * to get an instance of the singleton
	 * @return an instance
	 */
	public static AwayPressedEvent instance() {
		if (instance == null) {
			instance = new AwayPressedEvent();
		}
		return instance;
	}
}
