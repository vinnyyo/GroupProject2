package states;

import events.AwayPressedEvent;
import events.StayPressedEvent;
import events.ZonesReadyEvent;

public class ZonesNotReadyState extends SystemState {
	private static ZonesNotReadyState instance;
	
	private ZonesNotReadyState() {
		
	}
	
	public static ZonesNotReadyState instance() {
		if (instance == null) {
			instance = new ZonesNotReadyState();
		}
		return instance;
	}

	@Override
	public void handleEvent(ZonesReadyEvent event) {
		SystemContext.instance().changeState(ZonesReadyState.instance());
	}
	
	@Override
	public void handleEvent(AwayPressedEvent event) {
		SystemContext.instance().changeState(AwayCountdownState.instance());
	}

	@Override
	public void handleEvent(StayPressedEvent event) {
		SystemContext.instance().changeState(StayCountdownState.instance());
	}
		
	@Override
	public void enter() {
		SystemContext.instance().showZonesNotReady();
	}

	@Override
	public void leave() {
	}


}
