package buttons;

import events.SevenButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class SevenButton extends GUIButton {

	public SevenButton() {
		super("7");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(SevenButtonEvent.instance());

	}
}
