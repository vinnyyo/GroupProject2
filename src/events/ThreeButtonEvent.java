package events;

/**
 * The event that represents the three button press
 * 
 * @author Vincent Peterson
 */
public class ThreeButtonEvent {

	private static ThreeButtonEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private ThreeButtonEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static ThreeButtonEvent instance() {
		if (instance == null) {
			instance = new ThreeButtonEvent();
		}
		return instance;
	}
}
