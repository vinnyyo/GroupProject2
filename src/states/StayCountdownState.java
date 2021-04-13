package states;

import events.TimerRanOutEvent;
import events.TimerTickedEvent;
import timer.Notifiable;
import timer.Timer;

public class StayCountdownState extends SystemState implements Notifiable {
	private static StayCountdownState instance;
	Timer timer;
	
	private StayCountdownState() {
		
	}
	
	public static StayCountdownState instance() {
		if (instance == null) {
			instance = new StayCountdownState();
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
		SystemContext.instance().showStayCountdown(timer.getTimeValue());
	}

	@Override
	public void handleEvent(TimerRanOutEvent event) {
		if (SystemContext.instance().getZonesReady()) {
			SystemContext.instance().changeState(StayArmedState.instance());
		} else {
			SystemContext.instance().changeState(ZonesNotReadyState.instance());
		}
	}
}

