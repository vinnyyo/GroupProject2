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
	 * Signify that away is counting down
	 */
	public void showAwayCountDown();

	/**
	 * Signify that stay is counting down
	 */
	public void showStayCountDown();

	/**
	 * Signify that security breach is counting down
	 */
	public void showSecurityBreachCountDown();
}
