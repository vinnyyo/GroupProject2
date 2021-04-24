package states;

import events.CancelPressedEvent;
import events.MotionDetectedEvent;
import events.ZonesNotReadyEvent;

/**
 * The system state for when away is armed
 * 
 * @author Michael Olson
 *
 */
public class AwayArmedState extends SystemState {
	private static AwayArmedState instance;

	/**
	 * Private for singleton
	 */
	private AwayArmedState() {

	}

	/**
	 * get the instance of the singleton
	 * 
	 * @return the instance
	 */
	public static AwayArmedState instance() {
		if (instance == null) {
			instance = new AwayArmedState();
		}
		return instance;
	}

	/**
	 * Action to take when we get a ZoneNotReadyEvent, go into BreachCountdownState
	 */
	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(BreachCountdownState.instance());
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
	 * Action to take when we get a CancelPressedEvent, go into AwayCancelState
	 */
	@Override
	public void handleEvent(CancelPressedEvent event) {
		SystemContext.instance().changeState(AwayCancelState.instance());
	}

	/**
	 * When we enter the state. Show Away Armed on the display
	 */
	@Override
	public void enter() {
		SystemContext.instance().showAwayArmed();
	}

	/**
	 * When we leave the state. Do nothing.
	 */
	@Override
	public void leave() {
		// Do nothing.
	}

}
