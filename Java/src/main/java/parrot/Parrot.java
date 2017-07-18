package parrot;

/**
 * abstract parent class Parrot
 * 
 * @author MSI
 *
 */
public abstract class Parrot {


	private static final double BASE_SPEED = 12.0;

	/**
	 * calculate the speed of the parrot
	 * 
	 * @return actual speed of the parrot
	 */
	public abstract double getSpeed();


	/**
	 * get the base speed of a parrot
	 * @return
	 */
	protected double getBaseSpeed() {
		return BASE_SPEED;
	}

}
