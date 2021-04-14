package states;

import events.CorrectCodeEvent;
import events.PasswordEnteredEvent;

public class SecurityBreachState extends SystemState {
	private static SecurityBreachState instance;

	private SecurityBreachState() {

	}

	public static SecurityBreachState instance() {
		if (instance == null) {
			instance = new SecurityBreachState();
		}
		return instance;
	}

	@Override
	public void handleEvent(PasswordEnteredEvent event) {
		SystemContext.instance().changeState(ZonesNotReadyState.instance());
	}

	@Override
	public void handleEvent(CorrectCodeEvent event) {
		SystemContext.instance().changeState(ZonesNotReadyState.instance());
	}

	@Override
	public void enter() {
		SystemContext.instance().showSecurityBreach();
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

}
