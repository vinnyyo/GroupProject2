package buttons;

import events.ThreeButtonEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class ThreeButton extends GUIButton {

	public ThreeButton() {
		super("3");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(ThreeButtonEvent.instance());

	}
}
