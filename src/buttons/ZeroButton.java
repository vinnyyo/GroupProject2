package buttons;

import events.ZeroButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the zero digit
 * 
 * @author Vincent Peterson
 *
 */
public class ZeroButton extends GUIButton {

	/**
	 * The button for the zero digit
	 */
	public ZeroButton() {
		super("0");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(ZeroButtonEvent.instance());

	}
}
