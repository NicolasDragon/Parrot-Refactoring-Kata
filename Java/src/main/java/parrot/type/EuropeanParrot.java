package parrot.type;

import parrot.Parrot;

public class EuropeanParrot extends Parrot {
	/**
	 * see {@link Parrot#getSpeed()}
	 */
	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

}
