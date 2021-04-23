package buttons;

import events.ZonesNotReadyEvent;
import events.ZonesReadyEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import states.SystemContext;

/**
 * A JavaFX Pane overrided to be a Zones Pane.
 * The pane takes care of itself, and notifies the Context if there is a change
 * @author Michael Olson
 *
 */
public class ZonesPane extends GridPane implements EventHandler<ActionEvent>{
	// The checkboxes used in the Pane
	private CheckBox zone1CheckBox = new CheckBox("Zone 1");
	private CheckBox zone2CheckBox = new CheckBox("Zone 2");
	private CheckBox zone3CheckBox = new CheckBox("Zone 3");
	// Text to display the current status of the Zones
	private Text statusText = new Text("System Ready");

	/**
	 * Constructor for the Pane,
	 * Initializes all the object in the pane.
	 */
	public ZonesPane() {
		super();
		
		this.setHgap(10);
		zone1CheckBox.setSelected(true);
		zone2CheckBox.setSelected(true);
		zone3CheckBox.setSelected(true);
		GridPane.setConstraints(statusText, 0, 1, 3, 1);
		GridPane.setHalignment(statusText, HPos.CENTER);
		
		zone1CheckBox.setOnAction(this);
		zone2CheckBox.setOnAction(this);
		zone3CheckBox.setOnAction(this);
		this.add(zone1CheckBox, 0, 0);
		this.add(zone2CheckBox, 1, 0);
		this.add(zone3CheckBox, 2, 0);
		this.add(statusText, 0, 1);
	}
	
	/**
	 * Are the Zones ready?
	 * @return boolean value indicating the readiness status of the zones
	 */
	public boolean isReady() {
		if (zone1CheckBox.isSelected() && 
				zone2CheckBox.isSelected() &&
				zone3CheckBox.isSelected()) {
			return true;
		}
		return false;
	}

	@Override
	public void handle(ActionEvent event) {
		if (isReady()) {
			statusText.setText("System Ready");
			SystemContext.instance().handleEvent(ZonesReadyEvent.instance());
		} else {
			statusText.setText("System Not Ready");
			SystemContext.instance().handleEvent(ZonesNotReadyEvent.instance());
		}
	}
}
