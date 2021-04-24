package states;

import events.CorrectCodeEvent;
import events.IncorrectCodeEvent;
import events.ZonesNotReadyEvent;

/**
 * SystemState to represent while the system is canceling the StayArmedState
 * 
 * @author Vincent Peterson and Michael Olson
 *
 */
public class StayCancelState extends SystemState {
	private static StayCancelState instance;

	/**
	 * Private for singleton
	 */
	private StayCancelState() {

	}

	/**
	 * Used to get an instance of the Singleton
	 * 
	 * @return Instance of the singleton
	 */
	public static StayCancelState instance() {
		if (instance == null) {
			instance = new StayCancelState();
		}
		return instance;
	}

	/**
	 * Action to take when a ZonesNotReadyEvent is passed Change to
	 * SecurityBreachState
	 */
	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(SecurityBreachState.instance());
	}

	/**
	 * Action to take when a CorrectCodeEvent is passed Enter ZonesReadyState
	 */
	@Override
	public void handleEvent(CorrectCodeEvent event) {
		SystemContext.instance().changeState(ZonesReadyState.instance());
	}

	/**
	 * Action to take when an IncorrectCodeEvent is passed Enter AwayArmedState
	 */
	@Override
	public void handleEvent(IncorrectCodeEvent event) {
		SystemContext.instance().changeState(StayArmedState.instance());
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
