package states;

import events.AwayPressedEvent;
import events.CancelPressedEvent;
import events.MotionDetectedEvent;
import events.PasswordEnteredEvent;
import events.StayPressedEvent;
import events.ZonesNotReadyEvent;
import events.ZonesReadyEvent;

public abstract class SystemState {

	public abstract void enter();
	
	public abstract void leave();
	
	public void handleEvent(ZonesReadyEvent event) {
		
	}

	public void handleEvent(ZonesNotReadyEvent event) {
		
	}

	public void handleEvent(StayPressedEvent event) {
		
	}

	public void handleEvent(CancelPressedEvent event) {
		
	}

	public void handleEvent(AwayPressedEvent event) {
		
	}

	public void handleEvent(MotionDetectedEvent event) {
		
	}

	public void handleEvent(PasswordEnteredEvent event) {

	}

}
