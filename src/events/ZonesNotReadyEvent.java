package events;

/**
 * The event for when the Zones become unready
 * Singleton Class
 * @author Michael Olson
 *
 */
public class ZonesNotReadyEvent extends SystemEvent {
	private static ZonesNotReadyEvent instance;
	
	/**
	 * private for singleton
	 */
	private ZonesNotReadyEvent() {
		
	}
	
	/**
	 * to get an instance of the singleton
	 * @return an instance
	 */
	public static ZonesNotReadyEvent instance() {
		if (instance == null) {
			instance = new ZonesNotReadyEvent();
		}
		return instance;
	}
}
