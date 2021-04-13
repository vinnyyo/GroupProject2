package events;

public class PasswordEnteredEvent {

	private static PasswordEnteredEvent instance;
	
	private PasswordEnteredEvent() {
		
	}
	
	public static PasswordEnteredEvent instance() {
		if (instance == null) {
			instance = new PasswordEnteredEvent();
		}
		return instance;
	}
}
