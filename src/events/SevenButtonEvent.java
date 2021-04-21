package events;

/**
 * Represents the seven button press
 * 
 * @author Vincent Peterson
 */
public class SevenButtonEvent {

	private static SevenButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private SevenButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static SevenButtonEvent instance() {
		if (instance == null) {
			instance = new SevenButtonEvent();
		}
		return instance;
	}
}
