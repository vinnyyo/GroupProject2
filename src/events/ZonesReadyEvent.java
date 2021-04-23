package events;

/**
 * The event for when the Zones become ready
 * Singleton Class
 * @author Michael Olson
 *
 */
public class ZonesReadyEvent extends SystemEvent {

	private static ZonesReadyEvent instance;
	
	/**
	 * private for singleton
	 */
	private ZonesReadyEvent() {
		
	}
	
	/**
	 * to get an instance of the singleton
	 * @return an instance
	 */
	public static ZonesReadyEvent instance() {
		if (instance == null) {
			instance = new ZonesReadyEvent();
		}
		return instance;
	}
}
