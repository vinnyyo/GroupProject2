package display;

/**
 * Template interface for the system display.
 * 
 * @author Vincent Peterson
 */

public interface SystemDisplay {

	/**
	 * Displays the time until action activates
	 * 
	 * @param time - seconds remaining before action activates
	 */
	public void showCountDown(int time);

	/**
	 * Signify that zones are ready
	 */
	public void showZonesReady();

	/**
	 * Signify that zones are not ready
	 */
	public void showZonesNotReady();

	/**
	 * Signify that away is armed
	 */
	public void showAwayArmed();

	/**
	 * Signify that stay is armed
	 */
	public void showStayArmed();

	/**
	 * Signify that security is breached
	 */
	public void showSecurityBreach();

	/**
	 * Signify that security breach is counting down
	 */
	public void showSecurityBreachCountDown(int time);

	/**
	 * Signify that away is counting down with time
	 */
	public void showAwayCountDown(int time);

	/**
	 * Signify that stay is counting down
	 */
	public void showStayCountDown(int time);

	/**
	 * Boolean value of the current zone status
	 */
	public boolean getZonesReady();

	void showEnterPassword();

	public void inputCharacter(String string);

	public void resetInput();

}
