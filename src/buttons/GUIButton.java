package buttons;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * Abstract Class for all of our buttons to extends,
 * Adds the EventHandler interface.
 * @author Michael Olson
 *
 */
public abstract class GUIButton extends Button implements EventHandler<ActionEvent> {
 
    public GUIButton(String string) {
        super(string);
        setOnAction(this);
    }
}
