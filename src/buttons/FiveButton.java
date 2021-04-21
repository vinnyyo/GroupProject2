package buttons;

import events.FiveButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the five digit
 * 
 * @author Vincent Peterson
 *
 */
public class FiveButton extends GUIButton {

	/**
	 * The button for the five digit
	 */
	public FiveButton() {
		super("5");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(FiveButtonEvent.instance());

	}
}
