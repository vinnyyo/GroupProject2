package states;

import events.CorrectCodeEvent;
import events.MotionDetectedEvent;
import events.ZonesNotReadyEvent;

/**
 * SystemState to represent while the system is in CancelButtonState
 * 
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
	 * 
	 * @return Instance of the singleton
	 */
	public static CancelButtonState instance() {
		if (instance == null) {
			instance = new CancelButtonState();
		}
		return instance;
	}

	/**
	 * Action to take when a CorrectCodeEvent is passed Enter ZonesReadyState
	 */
	@Override
	public void handleEvent(CorrectCodeEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(ZonesReadyState.instance());
		} else {
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}

	/**
	 * Action to take when a ZonesNotReadyEvent is passed Change to
	 * SecurityBreachState
	 */
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(SecurityBreachState.instance());
	}

	/**
	 * Action to take when we get a MotionDetectedEvent, go into
	 * BreachCountdownState
	 */
	@Override
	public void handleEvent(MotionDetectedEvent event) {
		SystemContext.instance().changeState(BreachCountdownState.instance());
	}

	/**
	 * Action to take when entering the state Display Enter Password
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
