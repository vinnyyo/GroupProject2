package buttons;

import events.StayPressedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class StayButton extends GUIButton {
	
	public StayButton() {
		super("Stay");
	}

	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(StayPressedEvent.instance());
		
	}
}
