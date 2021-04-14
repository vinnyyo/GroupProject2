package buttons;

import events.TwoButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class TwoButton extends GUIButton {

	public TwoButton() {
		super("2");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(TwoButtonEvent.instance());

	}
}
