package buttons;

import events.ZeroButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class ZeroButton extends GUIButton {

	public ZeroButton() {
		super("0");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(ZeroButtonEvent.instance());

	}
}
