package states;

import events.AwayPressedEvent;
import events.StayPressedEvent;
import events.ZonesNotReadyEvent;

public class ZonesReadyState extends SystemState {
	private static ZonesReadyState instance;
	
	private ZonesReadyState() {
		
	}
	
	public static ZonesReadyState instance() {
		if (instance == null) {
			instance = new ZonesReadyState();
		}
		return instance;
	}
	
	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(ZonesNotReadyState.instance());
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
		SystemContext.instance().showZonesReady();
	}

	@Override
	public void leave() {
	}

}
