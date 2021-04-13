package buttons;

import events.MotionDetectedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class MotionDetectorButton extends GUIButton {

	public MotionDetectorButton() {
		super("Motion Detector");
	}
	
	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(MotionDetectedEvent.instance());

		
	}

}
