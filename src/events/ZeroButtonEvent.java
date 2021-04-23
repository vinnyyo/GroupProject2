package events;

/**
 * The event that represents the zero button press
 * 
 * @author Vincent Peterson
 */
public class ZeroButtonEvent {

	private static ZeroButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private ZeroButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static ZeroButtonEvent instance() {
		if (instance == null) {
			instance = new ZeroButtonEvent();
		}
		return instance;
	}
}
