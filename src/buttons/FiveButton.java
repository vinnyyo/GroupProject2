package buttons;

import events.FiveButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class FiveButton extends GUIButton {

	public FiveButton() {
		super("5");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(FiveButtonEvent.instance());

	}
}
