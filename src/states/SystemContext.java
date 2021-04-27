package states;

import display.SystemDisplay;
import events.AwayPressedEvent;
import events.CancelPressedEvent;
import events.CorrectCodeEvent;
import events.EightButtonEvent;
import events.FiveButtonEvent;
import events.FourButtonEvent;
import events.IncorrectCodeEvent;
import events.MotionDetectedEvent;
import events.NineButtonEvent;
import events.OneButtonEvent;
import events.SevenButtonEvent;
import events.SixButtonEvent;
import events.StayPressedEvent;
import events.ThreeButtonEvent;
import events.TwoButtonEvent;
import events.ZeroButtonEvent;
import events.ZonesNotReadyEvent;
import events.ZonesReadyEvent;

/**
 * Context of the Security System. Holds / Controls state of system. It is using
 * a Singleton Paradigm. Also contains and maintains the four digit passcode
 * functionality. And contains the system display.
 * 
 * @author Michael Olson and Vincent Peterson
 *
 */
public class SystemContext {
	private static SystemContext instance;
	private SystemState currentState;
	private SystemDisplay display;

	private static int[] passcode = { 1, 2, 3, 4 };
	private static int[] input = { -1, -1, -1, -1 };
	private static int inputLength = 0;

	/**
	 * A method that returns the input as a string of numbers
	 * 
	 * @return the input as a string
	 */
	public String getInput() {
		String output = "";
		for (int i = 0; i < 4; i++) {
			if (input[i] > -1) {
				output += String.valueOf(input[i]) + " ";
			}
		}
		return output;
	}

	/**
	 * Check to see if the code entered is correct
	 * 
	 * @return true if correct, false if not
	 */
	private boolean correctCode() {
		for (int i = 0; i < 4; i++) {
			if (passcode[i] != input[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Function to test if a code is correct and reset the input once 4 digits are
	 * entered.
	 */
	private void testCode() {
		if (inputLength == 4) {
			if (correctCode()) {
				SystemContext.instance().handleEvent(CorrectCodeEvent.instance());
			} else {
				SystemContext.instance().handleEvent(IncorrectCodeEvent.instance());
			}
			input[0] = -1;
			input[1] = -1;
			input[2] = -1;
			input[3] = -1;
			inputLength = 0;
			display.resetInput();
		}
	}

	/**
	 * Creates an instance of the SystemContext. Only Accessible within the class
	 * for singleton functionality.
	 */
	private SystemContext() {
		instance = this;
		currentState = ZonesReadyState.instance();
	}

	/**
	 * Gets the instance of the SystemContext
	 * 
	 * @return the instance of the SystemContext
	 */
	public static SystemContext instance() {
		if (instance == null) {
			instance = new SystemContext();
		}
		return instance;
	}

	/**
	 * Sets the display of the system
	 * 
	 * @param display the display
	 */
	public void setDisplay(SystemDisplay display) {
		this.display = display;
	}

	/**
	 * Action to take when a state is changed
	 * 
	 * @param newState state to change to
	 */
	public void changeState(SystemState newState) {
		currentState.leave();
		currentState = newState;
		currentState.enter();
	}

	/**
	 * method to pass ZonesReadyEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(ZonesReadyEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * method to pass ZonesNotReadyEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(ZonesNotReadyEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * method to pass AwayPressedEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(AwayPressedEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * method to pass StayPressedEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(StayPressedEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * method to pass CancelPressedEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(CancelPressedEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * method to pass MotionDetectedEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(MotionDetectedEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * Display for Zones Ready
	 */
	public void showZonesReady() {
		display.showZonesReady();
	}

	/**
	 * Display for Zones Not Ready
	 */
	public void showZonesNotReady() {
		display.showZonesNotReady();
	}

	/**
	 * Display for Away Armed
	 */
	public void showAwayArmed() {
		display.showAwayArmed();
	}

	/**
	 * Display for Security Breach
	 */
	public void showSecurityBreach() {
		display.showSecurityBreach();
	}

	/**
	 * Display for Stay Armed
	 */
	public void showStayArmed() {
		display.showStayArmed();
	}

	/**
	 * Display for Away Countdown
	 * 
	 * @param time current timer count
	 */
	public void showAwayCountdown(int time) {
		display.showAwayCountDown(time);
	}

	/**
	 * Display for Stay Countdown
	 * 
	 * @param time current timer count
	 */
	public void showStayCountdown(int time) {
		display.showStayCountDown(time);
	}

	/**
	 * Display for Security Breach Countdown
	 * 
	 * @param time current timer count
	 */
	public void showSecurityBreachCountdown(int time) {
		display.showSecurityBreachCountDown(time);
	}

	/**
	 * Display for Enter Password
	 */
	public void showEnterPassword() {
		display.showEnterPassword();
	}

	/**
	 * gets the current Zone status
	 * 
	 * @return a boolean representing if the zones are ready
	 */
	public boolean getZonesReady() {
		return display.getZonesReady();
	}

	/**
	 * Action to take when a OneButtonEvent is passed
	 */
	public void handleEvent(OneButtonEvent event) {
		input[inputLength++] = 1;
		display.inputCharacter("1 ");
		testCode();
	}

	/**
	 * Action to take when a TwoButtonEvent is passed
	 */
	public void handleEvent(TwoButtonEvent event) {
		input[inputLength++] = 2;
		display.inputCharacter("2 ");
		testCode();
	}

	/**
	 * Action to take when a ThreeButtonEvent is passed
	 */
	public void handleEvent(ThreeButtonEvent event) {
		input[inputLength++] = 3;
		display.inputCharacter("3 ");
		testCode();
	}

	/**
	 * Action to take when a FourButtonEvent is passed
	 */
	public void handleEvent(FourButtonEvent event) {
		input[inputLength++] = 4;
		display.inputCharacter("4 ");
		testCode();
	}

	/**
	 * Action to take when a FiveButtonEvent is passed
	 */
	public void handleEvent(FiveButtonEvent event) {
		input[inputLength++] = 5;
		display.inputCharacter("5 ");
		testCode();
	}

	/**
	 * Action to take when a SixButtonEvent is passed
	 */
	public void handleEvent(SixButtonEvent event) {
		input[inputLength++] = 6;
		display.inputCharacter("6 ");
		testCode();
	}

	/**
	 * Action to take when a SevenButtonEvent is passed
	 */
	public void handleEvent(SevenButtonEvent event) {
		input[inputLength++] = 7;
		display.inputCharacter("7 ");
		testCode();
	}

	/**
	 * Action to take when a EightButtonEvent is passed
	 */
	public void handleEvent(EightButtonEvent event) {
		input[inputLength++] = 8;
		display.inputCharacter("8 ");
		testCode();
	}

	/**
	 * Action to take when a NineButtonEvent is passed
	 */
	public void handleEvent(NineButtonEvent event) {
		input[inputLength++] = 9;
		display.inputCharacter("9 ");
		testCode();
	}

	/**
	 * Action to take when a ZeroButtonEvent is passed
	 */
	public void handleEvent(ZeroButtonEvent event) {
		input[inputLength++] = 0;
		display.inputCharacter("0 ");
		testCode();
	}

	/**
	 * method to pass CorrectCodeEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(CorrectCodeEvent event) {
		currentState.handleEvent(event);
	}

	/**
	 * method to pass IncorrectCodeEvent to the current state
	 * 
	 * @param event event to pass to the current state.
	 */
	public void handleEvent(IncorrectCodeEvent event) {
		currentState.handleEvent(event);
	}
}
