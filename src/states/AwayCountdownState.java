package states;

import events.CorrectCodeEvent;
import events.TimerRanOutEvent;
import events.TimerTickedEvent;
import timer.Notifiable;
import timer.Timer;

/**
 * System state after away was pressed
 * Countdown to away Armed
 * @author Michael Olson
 *
 */
public class AwayCountdownState extends SystemState implements Notifiable {
	private static AwayCountdownState instance;
	Timer timer;

	/**
	 * Private for singleton
	 */
	private AwayCountdownState() {

	}

	/** 
	 * Gets the instance of the singleton
	 * @return the instance
	 */
	public static AwayCountdownState instance() {
		if (instance == null) {
			instance = new AwayCountdownState();
		}
		return instance;
	}

	/**
	 * What happens when we enter the state,
	 * Start a new Timer,
	 * Display the Timer on the display.
	 */
	@Override
	public void enter() {
		timer = new Timer(this, 10);
		SystemContext.instance().showAwayCountdown(timer.getTimeValue());
	}

	/** 
	 * What happens when we leave the state.
	 * Kill the timer.
	 */
	@Override
	public void leave() {
		timer.stop();
		timer = null;
	}

	/**
	 * A TimerTickedEvent is passed
	 * show the timer state on the display 
	 */
	@Override
	public void handleEvent(TimerTickedEvent event) {
		SystemContext.instance().showAwayCountdown(timer.getTimeValue());
	}

	/** 
	 * A TimerRanOutEvent is passed
	 * If the zones are still ready, Set to AwayArmedState,
	 * Else set to ZonesNotReadyState
	 */
	@Override
	public void handleEvent(TimerRanOutEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(AwayArmedState.instance());
		} else {
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}
}
