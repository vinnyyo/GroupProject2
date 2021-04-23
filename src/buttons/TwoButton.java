package buttons;

import events.TwoButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

/**
 * The button for the two digit
 * 
 * @author Vincent Peterson
 *
 */
public class TwoButton extends GUIButton {

	/**
	 * The button for the two digit
	 */
	public TwoButton() {
		super("2");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(TwoButtonEvent.instance());

	}
}
