package states;

import events.CorrectCodeEvent;

/**
 * SystemState to represent while the system is in CancelButtonState
 * @author Michael Olson
 *
 */

public class CancelButtonState extends SystemState {
	private static CancelButtonState instance;

	/**
	 * Private for singleton
	 */
	private CancelButtonState() {

	}

	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static CancelButtonState instance() {
		if (instance == null) {
			instance = new CancelButtonState();
		}
		return instance;
	}

	/**
	 * Action to take when a CorrectCodeEvent is passed
	 * Enter ZonesReadyState
	 */
	@Override
	public void handleEvent(CorrectCodeEvent event) {
		SystemContext.instance().changeState(ZonesReadyState.instance());
	}

	/**
	 * Action to take when entering the state
	 * Display Enter Password
	 */
	@Override
	public void enter() {
		SystemContext.instance().showEnterPassword();
		
	}

	/**
	 * Action to take when leaving the state
	 */
	@Override
	public void leave() {
		// Nothing
		
	}

}
