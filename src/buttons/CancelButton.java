package buttons;

import events.CancelPressedEvent;
import javafx.event.ActionEvent;
import states.SystemContext;

public class CancelButton extends GUIButton {

	public CancelButton() {
		super("Cancel");
	}
	
	@Override
	public void handle(ActionEvent event) {
		SystemContext.instance().handleEvent(CancelPressedEvent.instance());
		
	}

}
