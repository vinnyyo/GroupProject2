package states;

import events.CorrectCodeEvent;
import events.MotionDetectedEvent;
import events.ZonesNotReadyEvent;

public class AwayArmedState extends SystemState {
	private static AwayArmedState instance;

	private AwayArmedState() {

	}

	public static AwayArmedState instance() {
		if (instance == null) {
			instance = new AwayArmedState();
		}
		return instance;
	}

	@Override
	public void handleEvent(ZonesNotReadyEvent event) {
		SystemContext.instance().changeState(BreachCountdownState.instance());
	}

	@Override
	public void handleEvent(MotionDetectedEvent event) {
		SystemContext.instance().changeState(BreachCountdownState.instance());
	}

	@Override
	public void handleEvent(CorrectCodeEvent event) {
		SystemContext.instance().changeState(ZonesReadyState.instance());
	}

	@Override
	public void enter() {
		SystemContext.instance().showAwayArmed();
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

}
