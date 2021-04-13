package states;

import events.TimerRanOutEvent;
import events.TimerTickedEvent;
import timer.Notifiable;
import timer.Timer;

public class AwayCountdownState extends SystemState implements Notifiable {
	private static AwayCountdownState instance;
	Timer timer;
	
	private AwayCountdownState() {
		
	}
	
	public static AwayCountdownState instance() {
		if (instance == null) {
			instance = new AwayCountdownState();
		}
		return instance;
	}
	
	@Override
	public void enter() {
		timer = new Timer(this, 10);
		SystemContext.instance().showAwayCountdown(timer.getTimeValue());
	}

	@Override
	public void leave() {
		timer.stop();
		timer = null;
	}

	@Override
	public void handleEvent(TimerTickedEvent event) {
		SystemContext.instance().showAwayCountdown(timer.getTimeValue());
	}

	@Override
	public void handleEvent(TimerRanOutEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(AwayArmedState.instance());
		} else {
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}
}
