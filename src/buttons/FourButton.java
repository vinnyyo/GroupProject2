package buttons;

import events.FourButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the four digit
 * 
 * @author Vincent Peterson
 *
 */
public class FourButton extends GUIButton {

	/**
	 * The button for the four digit
	 */
	public FourButton() {
		super("4");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(FourButtonEvent.instance());

	}
}
