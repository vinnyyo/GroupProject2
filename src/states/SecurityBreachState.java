package states;

import events.CorrectCodeEvent;

public class SecurityBreachState extends SystemState {
	private static SecurityBreachState instance;

	private SecurityBreachState() {

	}

	public static SecurityBreachState instance() {
		if (instance == null) {
			instance = new SecurityBreachState();
		}
		return instance;
	}

	public void handleEvent(CorrectCodeEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(ZonesReadyState.instance());
		} else { 
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}

	@Override
	public void enter() {
		SystemContext.instance().showSecurityBreach();
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

}
