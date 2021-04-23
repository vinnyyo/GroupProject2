package states;

import events.AwayPressedEvent;
import events.StayPressedEvent;
import events.ZonesNotReadyEvent;

/**
 * SystemState to represent while the system is in ZonesReadyState
 * @author Michael Olson
 *
 */
public class ZonesReadyState extends SystemState {
	private static ZonesReadyState instance;
	
	/**
	 * Private for singleton
	 */
	private ZonesReadyState() {
		
	}
	
	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static ZonesReadyState instance() {
		if (instance == null) {
			instance = new ZonesReadyState();
		}
		return instance;
	}
	
	/**
	 * Action to take when a ZonesNotReadyEvent is passed
	 * Change to ZonesNotReadyState
	 */
	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(ZonesNotReadyState.instance());
	}

	/**
	 * Action to take when an AwayPressedEvent is passed
	 * Change to AwayCountdownState
	 */
	@Override
	public void handleEvent(AwayPressedEvent event) {
		SystemContext.instance().changeState(AwayCountdownState.instance());
	}

	/**
	 * Action to take when a StayPressedEvent it passed
	 * Change to StayCountdownState
	 */
	@Override
	public void handleEvent(StayPressedEvent event) {
		SystemContext.instance().changeState(StayCountdownState.instance());
	}
	
	/**
	 * Action to take when entering the State
	 * Display ZonesReady
	 */
	@Override
	public void enter() {
		SystemContext.instance().showZonesReady();
	}

	/**
	 * Action to take when leaving the state
	 */
	@Override
	public void leave() {
		// Nothing
	}

}
