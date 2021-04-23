package start;

import display.GUIDisplay;
import javafx.application.Application;
import timer.Clock;

/**
 * Program entry Point
 * @author Vincent Peterson
 *
 */
public class Main {

	public static void main(String[] args) {
		Clock.instance();
		new Thread() {
			@Override
			public void run() {
				Application.launch(GUIDisplay.class, "GUIDisplay");
			}
		}.start();
	}
}
