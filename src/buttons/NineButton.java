package buttons;

import events.NineButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class NineButton extends GUIButton {

	public NineButton() {
		super("9");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(NineButtonEvent.instance());

	}
}
