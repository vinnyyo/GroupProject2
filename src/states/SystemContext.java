package states;

import display.SystemDisplay;
import events.AwayPressedEvent;
import events.CancelPressedEvent;
import events.MotionDetectedEvent;
import events.StayPressedEvent;
import events.ZonesNotReadyEvent;
import events.ZonesReadyEvent;

/**
 * Context of the Security System.
 * Holds / Controls state of system.
 * It is using a Singleton Paradigm
 * @author Michael Olson
 *
 */
public class SystemContext {
	private static SystemContext instance;
	private SystemState currentState;
	private SystemDisplay display;
	
	/**
	 * Creates an instance of the SystemContext.
	 * Only Accessible within the class
	 */
	private SystemContext() {
		instance = this;
		currentState = ZonesReadyState.instance();
	}
	
	/**
	 * Gets the instance of the SystemContext
	 * @return the instance of the SystemContext
	 */
	public static SystemContext instance() {
		if (instance == null) {
			instance = new SystemContext();
		}
		return instance;
	}

	public void setDisplay(SystemDisplay display) {
		this.display = display;
	}
	
	public void changeState(SystemState newState) {
		currentState.leave();
		currentState = newState;
		currentState.enter();
	}
	
	public void handleEvent(ZonesReadyEvent event) {
		currentState.handleEvent(event);
	}
	
	public void handleEvent(ZonesNotReadyEvent event) {
		currentState.handleEvent(event);
	}

	public void handleEvent(AwayPressedEvent event) {
		currentState.handleEvent(event);
	}

	public void handleEvent(StayPressedEvent event) {
		currentState.handleEvent(event);
	}

	public void handleEvent(CancelPressedEvent event) {
		currentState.handleEvent(event);
	}
	
	public void handleEvent(MotionDetectedEvent event) {
		currentState.handleEvent(event);
	}

	public void showZonesReady() {
		display.showZonesReady();
	}

	public void showZonesNotReady() {
		display.showZonesNotReady();
	}
	
	public void showAwayArmed() {
		display.showAwayArmed();
	}
	
	public void showSecurityBreach() {
		display.showSecurityBreach();
	}
	
	public void showStayArmed() {
		display.showStayArmed();
	}
	
	public void showAwayCountdown(int time) {
		display.showAwayCountDown(time);
	}

	public void showStayCountdown(int time) {
		display.showStayCountDown(time);
	}
	
	public void showSecurityBreachCountdown(int time) {
		display.showSecurityBreachCountDown(time);
	}
	
	public boolean getZonesReady() {
		return display.getZonesReady();
	}
}
