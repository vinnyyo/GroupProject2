package events;

/**
 * Represents the eight button press
 * 
 * @author Vincent Peterson
 */
public class EightButtonEvent {

	private static EightButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private EightButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static EightButtonEvent instance() {
		if (instance == null) {
			instance = new EightButtonEvent();
		}
		return instance;
	}
}
