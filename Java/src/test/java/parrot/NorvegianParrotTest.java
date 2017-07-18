package parrot;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import parrot.type.NorvegianParrot;

public class NorvegianParrotTest {

	@Test
	public void getSpeedNorwegianBlueParrot_nailed() {
		/* GIVEN */
		Parrot parrot = new NorvegianParrot( 0, true);
		final double expectedSpeed = 0.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();
		
		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed() {
		/* GIVEN */
		Parrot parrot = new NorvegianParrot( 1.5, false);
		final double expectedSpeed = 18.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();

		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		/* GIVEN */
		Parrot parrot = new NorvegianParrot( 4, false);
		final double expectedSpeed = 24.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();
		
		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

}
