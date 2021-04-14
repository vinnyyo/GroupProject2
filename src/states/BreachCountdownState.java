package states;

import events.CorrectCodeEvent;
import events.TimerRanOutEvent;
import events.TimerTickedEvent;
import timer.Notifiable;
import timer.Timer;

public class BreachCountdownState extends SystemState implements Notifiable {
	private static BreachCountdownState instance;
	Timer timer;

	private BreachCountdownState() {

	}

	public static BreachCountdownState instance() {
		if (instance == null) {
			instance = new BreachCountdownState();
		}
		return instance;
	}

	@Override
	public void enter() {
		timer = new Timer(this, 15);
		SystemContext.instance().showSecurityBreachCountdown(timer.getTimeValue());
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleEvent(TimerTickedEvent event) {
		SystemContext.instance().showSecurityBreachCountdown(timer.getTimeValue());
	}

	@Override
	public void handleEvent(TimerRanOutEvent event) {
		SystemContext.instance().changeState(SecurityBreachState.instance());
	}

	@Override
	public void handleEvent(CorrectCodeEvent event) {
		SystemContext.instance().changeState(ZonesNotReadyState.instance());
	}
}
