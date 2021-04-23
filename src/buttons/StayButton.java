package buttons;

import events.StayPressedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * Button to start the stay state
 * @author Michael Olson
 *
 */
public class StayButton extends GUIButton {
	
	/**
	 * Constructor for the button
	 */
	public StayButton() {
		super("Stay");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(StayPressedEvent.instance());
		
	}
}
