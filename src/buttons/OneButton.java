package buttons;

import events.OneButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class OneButton extends GUIButton {

	public OneButton() {
		super("1");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(OneButtonEvent.instance());

	}
}
