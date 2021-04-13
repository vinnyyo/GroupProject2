package events;

public class ZonesNotReadyEvent extends SystemEvent {
	private static ZonesNotReadyEvent instance;
	
	private ZonesNotReadyEvent() {
		
	}
	
	public static ZonesNotReadyEvent instance() {
		if (instance == null) {
			instance = new ZonesNotReadyEvent();
		}
		return instance;
	}
}
