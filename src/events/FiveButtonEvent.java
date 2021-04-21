package events;

/**
 * Represents the five button press
 * 
 * @author Vincent Peterson
 */
public class FiveButtonEvent {

	private static FiveButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private FiveButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static FiveButtonEvent instance() {
		if (instance == null) {
			instance = new FiveButtonEvent();
		}
		return instance;
	}
}
