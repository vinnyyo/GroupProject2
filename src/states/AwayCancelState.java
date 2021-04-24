package states;

import events.CorrectCodeEvent;
import events.IncorrectCodeEvent;
import events.MotionDetectedEvent;
import events.ZonesNotReadyEvent;

/**
 * The system state for when away is being cancelled
 * 
 * @author Vincent Peterson and Micheal Olson
 *
 */
public class AwayCancelState extends SystemState {
	private static AwayCancelState instance;

	/**
	 * Private for singleton
	 */
	private AwayCancelState() {

	}

	/**
	 * get the instance of the singleton
	 * 
	 * @return the instance
	 */
	public static AwayCancelState instance() {
		if (instance == null) {
			instance = new AwayCancelState();
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
	 * Action to take when an IncorrectCodeEvent is passed Enter AwayArmedState
	 */
	@Override
	public void handleEvent(IncorrectCodeEvent event) {
		SystemContext.instance().changeState(AwayArmedState.instance());
	}

	/**
	 * Action to take when entering the state Display Enter Password
	 */
	@Override
	public void enter() {
		SystemContext.instance().showEnterPassword();
	}

	/**
	 * When we leave the state. Do nothing.
	 */
	@Override
	public void leave() {
		// Do nothing.
	}

}
