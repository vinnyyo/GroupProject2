package states;

import events.CorrectCodeEvent;
import events.TimerRanOutEvent;
import events.TimerTickedEvent;
import timer.Notifiable;
import timer.Timer;

/**
 * SystemState to represent while the system is in BreachCountdown
 * @author Michael Olson
 *
 */
public class BreachCountdownState extends SystemState implements Notifiable {
	private static BreachCountdownState instance;
	Timer timer;

	/**
	 * Private for singleton
	 */
	private BreachCountdownState() {

	}

	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static BreachCountdownState instance() {
		if (instance == null) {
			instance = new BreachCountdownState();
		}
		return instance;
	}

	/**
	 * What happens when we enter the state
	 * Start Timer,
	 * Display Timer.
	 */
	@Override
	public void enter() {
		timer = new Timer(this, 15);
		SystemContext.instance().showSecurityBreachCountdown(timer.getTimeValue());
	}

	/**
	 * What to do when we leave the State
	 * Stop the Timer,
	 * Kill the Timer.
	 */
	@Override
	public void leave() {
		timer.stop();
		timer = null;
	}

	/**
	 * Action to take when a TimerTickedEvent is passed
	 * Display Timer
	 */
	@Override
	public void handleEvent(TimerTickedEvent event) {
		SystemContext.instance().showSecurityBreachCountdown(timer.getTimeValue());
	}

	/**
	 * Action to take when a TimerRanOutEvent is passed
	 * Change state to SecurityBreachState
	 */
	@Override
	public void handleEvent(TimerRanOutEvent event) {
		SystemContext.instance().changeState(SecurityBreachState.instance());
	}

	/**
	 * Action to take when a CorrectCodeEvent is passed
	 * Set the system to Zones(Not)ReadyState depending on the Zones
	 */
	@Override
	public void handleEvent(CorrectCodeEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(ZonesReadyState.instance());
		} else { 
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}
}
