package buttons;

import events.MotionDetectedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * Button to press to simulate Motion Detection
 * @author Michael Olson
 *
 */
public class MotionDetectorButton extends GUIButton {

	/**
	 * Constructor to create the button
	 */
	public MotionDetectorButton() {
		super("Motion Detector");
	}
	
	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(MotionDetectedEvent.instance());

		
	}

}
