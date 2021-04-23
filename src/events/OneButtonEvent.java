package events;

/**
 * The event that represents the one button press
 * 
 * @author Vincent Peterson
 */
public class OneButtonEvent {

	private static OneButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private OneButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static OneButtonEvent instance() {
		if (instance == null) {
			instance = new OneButtonEvent();
		}
		return instance;
	}
}
