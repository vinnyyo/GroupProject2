package display;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUIDisplay extends Application implements SystemDisplay {
	private Text systemStatus = new Text("Test");

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();

		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.add(systemStatus, 0, 0);

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
