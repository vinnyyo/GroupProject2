package buttons;

import events.SixButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the six digit
 * 
 * @author Vincent Peterson
 *
 */
public class SixButton extends GUIButton {

	/**
	 * The button for the six digit
	 */
	public SixButton() {
		super("6");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(SixButtonEvent.instance());

	}
}
