package states;

import events.ZonesNotReadyEvent;

public class StayArmedState extends SystemState {
	private static StayArmedState instance;
	
	private StayArmedState() {
		
	}
	
	public static StayArmedState instance() {
		if (instance == null) {
			instance = new StayArmedState();
		}
		return instance;
	}

	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(SecurityBreachState.instance());
	}
	
	@Override
	public void enter() {
		SystemContext.instance().showStayArmed();
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}

}
