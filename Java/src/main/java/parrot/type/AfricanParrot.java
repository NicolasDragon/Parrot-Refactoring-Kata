package parrot.type;

import parrot.Parrot;

/**
 * africanParrot Class
 * 
 * @author MSI
 *
 */
public class AfricanParrot extends Parrot {
	private static final double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts = 0;

	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}

	/**
	 * see {@link Parrot#getSpeed()}
	 */
	public double getSpeed() {
		double speedWithCoconuts = calculateSpeedWithCoconuts();
		return Math.max(0, speedWithCoconuts);
	}

	/**
	 * get the speed of the parrot according to the coconuts number
	 * 
	 * @return
	 */
	private double calculateSpeedWithCoconuts() {
		return getBaseSpeed() - LOAD_FACTOR * numberOfCoconuts;
	}
}
