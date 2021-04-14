package buttons;

import events.EightButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class EightButton extends GUIButton {

	public EightButton() {
		super("8");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(EightButtonEvent.instance());

	}
}
