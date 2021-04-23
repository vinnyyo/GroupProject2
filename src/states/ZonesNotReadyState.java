package states;

import events.AwayPressedEvent;
import events.StayPressedEvent;
import events.ZonesReadyEvent;

/**
 * SystemState to represent while the system is in ZonesNotReadyState
 * @author Michael Olson
 *
 */
public class ZonesNotReadyState extends SystemState {
	private static ZonesNotReadyState instance;
	
	/**
	 * Private for singleton
	 */
	private ZonesNotReadyState() {
		
	}
	
	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static ZonesNotReadyState instance() {
		if (instance == null) {
			instance = new ZonesNotReadyState();
		}
		return instance;
	}

	/**
	 * Action to take when a ZonesReadyEvent is passed
	 * change to ZonesReadyState
	 */
	@Override
	public void handleEvent(ZonesReadyEvent event) {
		SystemContext.instance().changeState(ZonesReadyState.instance());
	}
	
	/**
	 * Action to take when a AwayPressedEvent is passed
	 * Change to AwayCountdownState
	 */
	@Override
	public void handleEvent(AwayPressedEvent event) {
		SystemContext.instance().changeState(AwayCountdownState.instance());
	}

	/**
	 * Action to take when a StayPressedEvent is passed
	 * change to StayCountdownState
	 */
	@Override
	public void handleEvent(StayPressedEvent event) {
		SystemContext.instance().changeState(StayCountdownState.instance());
	}
		
	/**
	 * Action to take when entering the state
	 * Display ZonesNotReady
	 */
	@Override
	public void enter() {
		SystemContext.instance().showZonesNotReady();
	}

	/**
	 * Action to take when leaving the state
	 */
	@Override
	public void leave() {
		// Nothing
	}


}
