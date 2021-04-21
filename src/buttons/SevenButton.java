package buttons;

import events.SevenButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the seven digit
 * 
 * @author Vincent Peterson
 *
 */
public class SevenButton extends GUIButton {

	/**
	 * The button for the seven digit
	 */
	public SevenButton() {
		super("7");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(SevenButtonEvent.instance());

	}
}
