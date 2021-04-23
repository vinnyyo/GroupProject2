package buttons;

import events.ThreeButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the three digit
 * 
 * @author Vincent Peterson
 *
 */
public class ThreeButton extends GUIButton {

	/**
	 * The button for the three digit
	 */
	public ThreeButton() {
		super("3");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(ThreeButtonEvent.instance());

	}
}
