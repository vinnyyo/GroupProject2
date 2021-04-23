package buttons;

import events.CancelPressedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * Button to hit when we are to Cancel away or stay
 * @author Michael Olson
 *
 */
public class CancelButton extends GUIButton {

	/**
	 * Constructor to Create the button
	 */
	public CancelButton() {
		super("Cancel");
	}
	
	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(CancelPressedEvent.instance());
		
	}

}
