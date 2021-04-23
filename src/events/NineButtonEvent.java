package events;

/**
 * Represents the nine button press
 * 
 * @author Vincent Peterson
 */
public class NineButtonEvent {

	private static NineButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private NineButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static NineButtonEvent instance() {
		if (instance == null) {
			instance = new NineButtonEvent();
		}
		return instance;
	}
}
