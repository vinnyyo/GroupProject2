package events;

/**
 * Represents that the correct code was entered
 * 
 * @author Vincent Peterson
 */
public class CorrectCodeEvent {

	private static CorrectCodeEvent instance;

	/**
	 * Private for singleton
	 * 
	 */
	private CorrectCodeEvent() {

	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the only instance
	 */
	public static CorrectCodeEvent instance() {
		if (instance == null) {
			instance = new CorrectCodeEvent();
		}
		return instance;
	}
}
