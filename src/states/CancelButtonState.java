package states;

import events.CorrectCodeEvent;

public class CancelButtonState extends SystemState {
	private static CancelButtonState instance;

	private CancelButtonState() {

	}

	public static CancelButtonState instance() {
		if (instance == null) {
			instance = new CancelButtonState();
		}
		return instance;
	}

	@Override
	public void handleEvent(CorrectCodeEvent event) {
		SystemContext.instance().changeState(ZonesReadyState.instance());
	}

	@Override
	public void enter() {
		SystemContext.instance().showEnterPassword();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}

}
