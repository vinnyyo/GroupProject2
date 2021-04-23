package states;

import events.CorrectCodeEvent;

/**
 * SystemState to represent while the system is in SecurityBreachState
 * @author Michael Olson
 *
 */
public class SecurityBreachState extends SystemState {
	private static SecurityBreachState instance;

	/**
	 * Private for singleton
	 */
	private SecurityBreachState() {

	}

	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static SecurityBreachState instance() {
		if (instance == null) {
			instance = new SecurityBreachState();
		}
		return instance;
	}

	/**
	 * Action to take when a CorrectCodeEvent is passed
	 * Revert to a Zones(Not)ReadyState
	 */
	public void handleEvent(CorrectCodeEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(ZonesReadyState.instance());
		} else { 
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}

	/**
	 * Action to take when entering the state
	 * Display Security Breach
	 */
	@Override
	public void enter() {
		SystemContext.instance().showSecurityBreach();
	}

	/**
	 * Action to take when leaving the state
	 */
	@Override
	public void leave() {
		// Nothing

	}

}
