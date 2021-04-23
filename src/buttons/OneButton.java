package buttons;

import events.OneButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the one digit
 * 
 * @author Vincent Peterson
 *
 */
public class OneButton extends GUIButton {

	/**
	 * The button for the one digit
	 */
	public OneButton() {
		super("1");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(OneButtonEvent.instance());

	}
}
