package display;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUIDisplay extends Application implements SystemDisplay {
	private TextArea systemStatus = new TextArea("Test");
	private Button oneButton = new Button("1");
	private Button twoButton = new Button("2");
	private Button threeButton = new Button("3");
	private Button fourButton = new Button("4");
	private Button fiveButton = new Button("5");
	private Button sixButton = new Button("6");
	private Button sevenButton = new Button("7");
	private Button eightButton = new Button("8");
	private Button nineButton = new Button("9");
	private Button zeroButton = new Button("0");
	private CheckBox zone1CheckBox = new CheckBox("Zone 1");
	private CheckBox zone2CheckBox = new CheckBox("Zone 2");
	private CheckBox zone3CheckBox = new CheckBox("Zone 3");
	private Text statusText = new Text("Ready Status");
	private Button motionDetectorButton = new Button("Motion Detector");
	private Button stayButton = new Button("Stay");
	private Button awayButton = new Button("Away");
	private Button cancelButton = new Button("Cancel");

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane buttonPane = new GridPane();
		GridPane topPane = new GridPane();
		GridPane bottomPane = new GridPane();
		BorderPane outsidePane = new BorderPane();
		BorderPane insidePane = new BorderPane();
		GridPane zonesPane = new GridPane();
		GridPane stayAwayCancelPane = new GridPane();
		outsidePane.setPadding(new Insets(10, 10, 10, 10));
		insidePane.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(8), new BorderWidths(2, 2, 2, 2))));
		outsidePane.setCenter(insidePane);
		
		buttonPane.add(oneButton, 0, 0);
		buttonPane.add(twoButton, 1, 0);
		buttonPane.add(threeButton, 2, 0);
		buttonPane.add(fourButton, 0, 1);
		buttonPane.add(fiveButton, 1, 1);
		buttonPane.add(sixButton, 2, 1);
		buttonPane.add(sevenButton, 0, 2);
		buttonPane.add(eightButton, 1, 2);
		buttonPane.add(nineButton, 2, 2);
		buttonPane.add(zeroButton, 1, 3);
		
		GridPane.setConstraints(systemStatus, 1, 0, 100, 4);
		systemStatus.setPrefRowCount(5);
		systemStatus.setEditable(false);

		buttonPane.add(systemStatus, 4, 0);
		topPane.add(buttonPane, 0, 0);

		GridPane.setConstraints(statusText, 0, 1, 2, 1);
		GridPane.setHalignment(statusText, HPos.CENTER);
		
		GridPane.setConstraints(motionDetectorButton, 0, 2, 2, 1);
		GridPane.setHalignment(motionDetectorButton, HPos.CENTER);

		zonesPane.setHgap(10);
		zonesPane.add(zone1CheckBox, 0, 0);
		zonesPane.add(zone2CheckBox, 1, 0);
		zonesPane.add(zone3CheckBox, 2, 0);
		zonesPane.add(statusText, 0, 1);
		zonesPane.add(motionDetectorButton, 0, 2);
		
		stayAwayCancelPane.add(new Text("          "), 0, 0);
		stayAwayCancelPane.add(stayButton, 1, 0);
		stayAwayCancelPane.add(awayButton, 2, 0);
		stayAwayCancelPane.add(new Text("          "), 3, 0);
		stayAwayCancelPane.add(cancelButton, 4, 0);
		GridPane.setHalignment(stayAwayCancelPane, HPos.CENTER);
		
		bottomPane.add(zonesPane, 0, 0);
		bottomPane.add(stayAwayCancelPane, 1, 0);
		
		BorderPane.setMargin(topPane, new Insets(10, 10, 10, 10));
		BorderPane.setMargin(bottomPane, new Insets(10, 10, 10, 10));
		insidePane.setTop(topPane);
		insidePane.setBottom(bottomPane);
		
		Scene scene = new Scene(outsidePane);
		primaryStage.setHeight(220);
		primaryStage.setWidth(500);
		primaryStage.setMinHeight(260);
		primaryStage.setMinWidth(500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Security System");

		primaryStage.show();
		primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent window) {
				System.exit(0);
			}
		});
	}

	/**
	 * Displays the time until action activates
	 * 
	 * @param time - seconds remaining before action activates
	 */
	@Override
	public void showCountDown(int time) {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that zones are ready
	 */
	@Override
	public void showZonesReady() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that zones are not ready
	 */
	@Override
	public void showZonesNotReady() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that away is armed
	 */
	@Override
	public void showAwayArmed() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that stay is armed
	 */
	@Override
	public void showStayArmed() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that security is breached
	 */
	@Override
	public void showSecurityBreach() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that away is counting down
	 */
	@Override
	public void showAwayCountDown() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that stay is counting down
	 */
	@Override
	public void showStayCountDown() {
		// TODO Auto-generated method stub

	}

	/**
	 * Signify that security breach is counting down
	 */
	@Override
	public void showSecurityBreachCountDown() {
		// TODO Auto-generated method stub

	}

}
