package buttons;

import events.NineButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the nine digit
 * 
 * @author Vincent Peterson
 *
 */
public class NineButton extends GUIButton {

	/**
	 * The button for the nine digit
	 */
	public NineButton() {
		super("9");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(NineButtonEvent.instance());

	}
}
