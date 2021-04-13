package events;

public class ZonesReadyEvent extends SystemEvent {

	private static ZonesReadyEvent instance;
	
	private ZonesReadyEvent() {
		
	}
	
	public static ZonesReadyEvent instance() {
		if (instance == null) {
			instance = new ZonesReadyEvent();
		}
		return instance;
	}
}
