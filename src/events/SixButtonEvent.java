package events;

/**
 * Represents the six button press
 * 
 * @author Vincent Peterson
 */
public class SixButtonEvent {

	private static SixButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private SixButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static SixButtonEvent instance() {
		if (instance == null) {
			instance = new SixButtonEvent();
		}
		return instance;
	}
}
