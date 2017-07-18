package parrot.type;

import parrot.Parrot;

public class NorvegianParrot extends Parrot {
	private double voltage;
	private boolean isNailed;
	private static final double MAXIMUM_BASE_SPEED_NORVEGIAN_PARROT = 24.0;

	public NorvegianParrot(double voltage, boolean isNailed) {
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	/**
	 * see {@link Parrot#getSpeed()}
	 */
	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeedWithVoltage();
	}

	/**
	 * calculate the base speed for norvegian parrot
	 * 
	 * @return
	 */
	private double getBaseSpeedWithVoltage() {
		return Math.min(MAXIMUM_BASE_SPEED_NORVEGIAN_PARROT, calculateBaseSpeedWithVoltage());
	}

	private double calculateBaseSpeedWithVoltage() {
		return voltage * getBaseSpeed();
	}
}
