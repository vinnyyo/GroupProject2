package states;

import events.CorrectCodeEvent;
import events.TimerRanOutEvent;
import events.TimerTickedEvent;
import timer.Notifiable;
import timer.Timer;

/**
 * SystemState to represent while the system is in StayCountdownState
 * @author Michael Olson
 *
 */
public class StayCountdownState extends SystemState implements Notifiable {
	private static StayCountdownState instance;
	Timer timer;

	/**
	 * Private for singleton
	 */
	private StayCountdownState() {

	}

	/**
	 * Used to get an instance of the Singleton
	 * @return Instance of the singleton
	 */
	public static StayCountdownState instance() {
		if (instance == null) {
			instance = new StayCountdownState();
		}
		return instance;
	}

	/**
	 * Action to take when entering the State
	 * Start a timer
	 * Display the timer
	 */
	@Override
	public void enter() {
		timer = new Timer(this, 10);
		SystemContext.instance().showAwayCountdown(timer.getTimeValue());
	}

	/**
	 * Action to take when leaving the state
	 * Stop Timer
	 * Kill Timer
	 */
	@Override
	public void leave() {
		timer.stop();
		timer = null;
	}

	/**
	 * Action to take when a TimerTickedEvent is passed
	 * display show countdown
	 */
	@Override
	public void handleEvent(TimerTickedEvent event) {
		SystemContext.instance().showStayCountdown(timer.getTimeValue());
	}

	/**
	 * Action to take when a TimerRanOutEvent is passed
	 * If Zones ready, change to StayArmedState
	 * Else change to ZonesNotReadyState
	 */
	@Override
	public void handleEvent(TimerRanOutEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(StayArmedState.instance());
		} else {
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}
}
