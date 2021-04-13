package buttons;

import events.AwayPressedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class AwayButton extends GUIButton {
	
	public AwayButton() {
		super("Away");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(AwayPressedEvent.instance());
		
	}

}
