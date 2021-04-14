package buttons;

import events.FourButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class FourButton extends GUIButton {

	public FourButton() {
		super("4");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(FourButtonEvent.instance());

	}
}
