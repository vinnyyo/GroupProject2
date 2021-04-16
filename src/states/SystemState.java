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

public abstract class SystemState {

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

	public void handleEvent(OneButtonEvent event) {

	}

	public void handleEvent(TwoButtonEvent event) {

	}

	public void handleEvent(ThreeButtonEvent event) {

	}

	public void handleEvent(FourButtonEvent event) {

	}

	public void handleEvent(FiveButtonEvent event) {

	}

	public void handleEvent(SixButtonEvent event) {

	}

	public void handleEvent(SevenButtonEvent event) {

	}

	public void handleEvent(EightButtonEvent event) {

	}

	public void handleEvent(NineButtonEvent event) {

	}

	public void handleEvent(ZeroButtonEvent event) {

	}

	public void handleEvent(CorrectCodeEvent event) {

	}

}
