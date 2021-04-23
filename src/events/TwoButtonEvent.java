package events;

/**
 * Represents the two button press
 * 
 * @author Vincent Peterson
 */
public class TwoButtonEvent {

	private static TwoButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private TwoButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static TwoButtonEvent instance() {
		if (instance == null) {
			instance = new TwoButtonEvent();
		}
		return instance;
	}
}
