package states;

import events.CancelPressedEvent;
import events.CorrectCodeEvent;
import events.ZonesNotReadyEvent;

/**
 * SystemState to represent while the system is in StayArmedState
 * @author Michael Olson
 *
 */
public class StayArmedState extends SystemState {
	private static StayArmedState instance;

	/**
	 * Private for singleton
	 */
	private StayArmedState() {

	}

	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static StayArmedState instance() {
		if (instance == null) {
			instance = new StayArmedState();
		}
		return instance;
	}

	/**
	 * Action to take when a ZonesNotReadyEvent is passed
	 * Change to SecurityBreachState
	 */
	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(SecurityBreachState.instance());
	}

	/**
	 * Action to take when a CancelPressedEvent is passed
	 * Change to CancelButtonState
	 */
	@Override
	public void handleEvent(CancelPressedEvent event) {
		SystemContext.instance().changeState(CancelButtonState.instance());
	}

	/**
	 * Action to take when entering the state
	 * Display Stay Armed
	 */
	@Override
	public void enter() {
		SystemContext.instance().showStayArmed();
	}

	/**
	 * Action to take when leaving the state
	 */
	@Override
	public void leave() {
		// Nothing

	}

}
