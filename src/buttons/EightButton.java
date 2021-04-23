package buttons;

import events.EightButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the eight digit
 * 
 * @author Vincent Peterson
 *
 */
public class EightButton extends GUIButton {

	/**
	 * The button for the eight digit
	 */
	public EightButton() {
		super("8");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(EightButtonEvent.instance());

	}
}
