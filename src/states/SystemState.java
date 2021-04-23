package states;

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
 * SystemState base abstract class to all the possible states our system can be in.
 * @author Michael Olson
 *
 */
public abstract class SystemState {

	// Code for password input
	protected static int[] passcode = { 1, 2, 3, 4 };
	protected static int[] input = new int[4];
	protected static int inputLength = 0;

	public boolean correctCode() {
		for (int i = 0; i < 4; i++) {
			if (passcode[i] != input[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Actions to take when entering state
	 */
	public abstract void enter();

	/**
	 * Actions to take when leaving state
	 */
	public abstract void leave();

	/**
	 * Action to take when a ZonesReadyEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(ZonesReadyEvent event) {

	}

	/**
	 * Action to take when a ZonesNotReadyEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(ZonesNotReadyEvent event) {

	}

	/**
	 * Action to take when a StayPressedEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(StayPressedEvent event) {

	}

	/**
	 * Action to take when a CancelPressedEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(CancelPressedEvent event) {

	}

	/**
	 * Action to take when a AwayPressedEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(AwayPressedEvent event) {

	}

	/**
	 * Action to take when a MotionDetectedEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(MotionDetectedEvent event) {

	}

	/**
	 * Action to take when a OneButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(OneButtonEvent event) {

	}

	/**
	 * Action to take when a TwoButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(TwoButtonEvent event) {

	}

	/**
	 * Action to take when a ThreeButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(ThreeButtonEvent event) {

	}

	/**
	 * Action to take when a FourButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(FourButtonEvent event) {

	}

	/**
	 * Action to take when a FiveButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(FiveButtonEvent event) {

	}

	/**
	 * Action to take when a SixButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(SixButtonEvent event) {

	}

	/**
	 * Action to take when a SevenButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(SevenButtonEvent event) {

	}

	/**
	 * Action to take when a EightButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(EightButtonEvent event) {

	}

	/**
	 * Action to take when a NineButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(NineButtonEvent event) {

	}

	/**
	 * Action to take when a ZeroButtonEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(ZeroButtonEvent event) {

	}

	/**
	 * Action to take when a CorrectCodeEvent is passed
	 * @param event event passed
	 */
	public void handleEvent(CorrectCodeEvent event) {

	}
}
