package events;

/**
 * The event for pressing the stay button
 * Singleton Class
 * @author Michael Olson
 *
 */public class StayPressedEvent {

	private static StayPressedEvent instance;
	
	/**
	 * private for singleton
	 */
	private StayPressedEvent() {
		
	}
	
	/**
	 * to get an instance of the singleton
	 * @return an instance
	 */
	public static StayPressedEvent instance() {
		if (instance == null) {
			instance = new StayPressedEvent();
		}
		return instance;
	}
}
