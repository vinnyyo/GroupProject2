package states;

import display.SystemDisplay;
import events.AwayPressedEvent;
import events.CancelPressedEvent;
import events.CorrectCodeEvent;
import events.EightButtonEvent;
import events.FiveButtonEvent;
import events.FourButtonEvent;
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
 * a Singleton Paradigm
 * 
 * @author Michael Olson
 *
 */
public class SystemContext {
	private static SystemContext instance;
	private SystemState currentState;
	private SystemDisplay display;

	private static int[] passcode = { 1, 2, 3, 4 };
	private static int[] input = { -1, -1, -1, -1 };
	private static int inputLength = 0;

	public String getInput() {
		String output = "";
		for (int i = 0; i < 4; i++) {
			if (input[i] > -1) {
				output += String.valueOf(input[i]) + " ";
			}
		}
		return output;
	}

	private boolean correctCode() {
		for (int i = 0; i < 4; i++) {
			if (passcode[i] != input[i]) {
				return false;
			}
		}
		return true;
	}

	private void testCode() {
		if (inputLength == 4) {
			if (correctCode()) {
				SystemContext.instance().handleEvent(CorrectCodeEvent.instance());
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

	public void showEnterPassword() {
		display.showEnterPassword();
	}

	public boolean getZonesReady() {
		return display.getZonesReady();
	}

	public void handleEvent(OneButtonEvent event) {
		input[inputLength++] = 1;
		display.inputCharacter("1 ");
		testCode();
	}

	public void handleEvent(TwoButtonEvent event) {
		input[inputLength++] = 2;
		display.inputCharacter("2 ");
		testCode();
	}

	public void handleEvent(ThreeButtonEvent event) {
		input[inputLength++] = 3;
		display.inputCharacter("3 ");
		testCode();
	}

	public void handleEvent(FourButtonEvent event) {
		input[inputLength++] = 4;
		display.inputCharacter("4 ");
		testCode();
	}

	public void handleEvent(FiveButtonEvent event) {
		input[inputLength++] = 5;
		display.inputCharacter("5 ");
		testCode();
	}

	public void handleEvent(SixButtonEvent event) {
		input[inputLength++] = 6;
		display.inputCharacter("6 ");
		testCode();
	}

	public void handleEvent(SevenButtonEvent event) {
		input[inputLength++] = 7;
		display.inputCharacter("7 ");
		testCode();
	}

	public void handleEvent(EightButtonEvent event) {
		input[inputLength++] = 8;
		display.inputCharacter("8 ");
		testCode();
	}

	public void handleEvent(NineButtonEvent event) {
		input[inputLength++] = 9;
		display.inputCharacter("9 ");
		testCode();
	}

	public void handleEvent(ZeroButtonEvent event) {
		input[inputLength++] = 0;
		display.inputCharacter("0 ");
		testCode();
	}

	public void handleEvent(CorrectCodeEvent event) {
		currentState.handleEvent(event);
	}
}
