package events;

/**
 * Represents the four button press
 * 
 * @author Vincent Peterson
 */
public class FourButtonEvent {

	private static FourButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private FourButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static FourButtonEvent instance() {
		if (instance == null) {
			instance = new FourButtonEvent();
		}
		return instance;
	}
}
