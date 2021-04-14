package display;

import buttons.AwayButton;
import buttons.CancelButton;
import buttons.EightButton;
import buttons.FiveButton;
import buttons.FourButton;
import buttons.MotionDetectorButton;
import buttons.NineButton;
import buttons.OneButton;
import buttons.SevenButton;
import buttons.SixButton;
import buttons.StayButton;
import buttons.ThreeButton;
import buttons.TwoButton;
import buttons.ZeroButton;
import buttons.ZonesPane;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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
import states.SystemContext;

public class GUIDisplay extends Application implements SystemDisplay {
	private TextArea systemStatus = new TextArea();
	private OneButton oneButton = new OneButton();
	private TwoButton twoButton = new TwoButton();
	private ThreeButton threeButton = new ThreeButton();
	private FourButton fourButton = new FourButton();
	private FiveButton fiveButton = new FiveButton();
	private SixButton sixButton = new SixButton();
	private SevenButton sevenButton = new SevenButton();
	private EightButton eightButton = new EightButton();
	private NineButton nineButton = new NineButton();
	private ZeroButton zeroButton = new ZeroButton();
	private AwayButton stayButton = new AwayButton();
	private StayButton awayButton = new StayButton();
	private MotionDetectorButton motionDetectorButton = new MotionDetectorButton();
	private CancelButton cancelButton = new CancelButton();
	private ZonesPane zonesPane = new ZonesPane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		SystemContext.instance().setDisplay(this);
		GridPane buttonPane = new GridPane();
		GridPane topPane = new GridPane();
		GridPane bottomPane = new GridPane();
		BorderPane outsidePane = new BorderPane();
		BorderPane insidePane = new BorderPane();
		GridPane stayAwayCancelPane = new GridPane();
		GridPane bottomLeftPane = new GridPane();
		outsidePane.setPadding(new Insets(10, 10, 10, 10));
		insidePane.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(8),
				new BorderWidths(2, 2, 2, 2))));
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
		systemStatus.setPromptText("Ready");
		systemStatus.setPrefRowCount(5);
		systemStatus.setEditable(false);

		buttonPane.add(systemStatus, 4, 0);
		topPane.add(buttonPane, 0, 0);

		GridPane.setConstraints(motionDetectorButton, 0, 2, 2, 1);
		GridPane.setHalignment(motionDetectorButton, HPos.CENTER);

		bottomLeftPane.add(zonesPane, 0, 0);
		bottomLeftPane.add(motionDetectorButton, 0, 2);

		stayAwayCancelPane.add(new Text("          "), 0, 0);
		stayAwayCancelPane.add(stayButton, 1, 0);
		stayAwayCancelPane.add(awayButton, 2, 0);
		stayAwayCancelPane.add(new Text("          "), 3, 0);
		stayAwayCancelPane.add(cancelButton, 4, 0);
		GridPane.setHalignment(stayAwayCancelPane, HPos.CENTER);

		bottomPane.add(bottomLeftPane, 0, 0);
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
		systemStatus.setPromptText("Countdown will display here.");

	}

	/**
	 * Signify that zones are ready
	 */
	@Override
	public void showZonesReady() {
		systemStatus.setPromptText("Zones Ready");

	}

	/**
	 * Signify that zones are not ready
	 */
	@Override
	public void showZonesNotReady() {
		systemStatus.setPromptText("Zones Not Ready");
	}

	/**
	 * Signify that away is armed
	 */
	@Override
	public void showAwayArmed() {
		systemStatus.setPromptText("Away armed\n\rPress cancel to Unarm");
	}

	/**
	 * Signify that stay is armed
	 */
	@Override
	public void showStayArmed() {
		systemStatus.setPromptText("Stay armed\n\rPress cancel to Unarm");
	}

	/**
	 * Signify that security is breached
	 */
	@Override
	public void showSecurityBreach() {
		systemStatus.setPromptText(" *** Security Breach ***\n\rEnter password.");
	}

	/**
	 * Signify that away is counting down
	 */
	@Override
	public void showAwayCountDown(int time) {
		systemStatus.setPromptText("Away Countdown " + time);
	}

	/**
	 * Signify that stay is counting down
	 */
	@Override
	public void showStayCountDown(int time) {
		systemStatus.setPromptText("Stay Countdown " + time);
	}

	/**
	 * Signify that security breach is counting down
	 */
	@Override
	public void showSecurityBreachCountDown(int time) {
		systemStatus.setPromptText("Breach countdown " + time + "\n\rEnter password.");
	}

	@Override
	public boolean getZonesReady() {
		return zonesPane.isReady();
	}
}
