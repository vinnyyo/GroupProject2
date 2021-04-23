package events;

/**
 * The event for pressing a cancel button
 * A singleton class
 * @author Michael Olson
 *
 */
public class CancelPressedEvent {

	private static CancelPressedEvent instance;
	
	/**
	 * private for singleton
	 */
	private CancelPressedEvent() {
		
	}

	/**
	 * to get an instance of the singleton
	 * @return an instance
	 */
	public static CancelPressedEvent instance() {
		if (instance == null) {
			instance = new CancelPressedEvent();
		}
		return instance;
	}
}
