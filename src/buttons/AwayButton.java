package buttons;

import events.AwayPressedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * Button to hit when we are away
 * 
 * @author Michael Olson
 *
 */
public class AwayButton extends GUIButton {

	/**
	 * Constructor to Create the button
	 */
	public AwayButton() {
		super("Away");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(AwayPressedEvent.instance());

	}

}
