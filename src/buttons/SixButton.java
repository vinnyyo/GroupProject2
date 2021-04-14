package buttons;

import events.SixButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class SixButton extends GUIButton {

	public SixButton() {
		super("6");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(SixButtonEvent.instance());

	}
}
