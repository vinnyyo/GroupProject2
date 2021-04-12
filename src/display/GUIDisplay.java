package display;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUIDisplay extends Application implements SystemDisplay {
	private Text systemStatus = new Text("Test");
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

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);

		pane.setPadding(new Insets(10, 10, 10, 10));

		pane.add(oneButton, 0, 0);
		pane.add(twoButton, 1, 0);
		pane.add(threeButton, 2, 0);
		pane.add(fourButton, 0, 1);
		pane.add(fiveButton, 1, 1);
		pane.add(sixButton, 2, 1);
		pane.add(sevenButton, 0, 2);
		pane.add(eightButton, 1, 2);
		pane.add(nineButton, 2, 2);
		pane.add(zeroButton, 1, 3);
		pane.add(systemStatus, 3, 0);

		Scene scene = new Scene(pane);
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
