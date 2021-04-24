package events;

/**
 * The event that represents that the incorrect code was entered
 * 
 * @author Vincent Peterson
 */
public class IncorrectCodeEvent {

	private static IncorrectCodeEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private IncorrectCodeEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static IncorrectCodeEvent instance() {
		if (instance == null) {
			instance = new IncorrectCodeEvent();
		}
		return instance;
	}
}
