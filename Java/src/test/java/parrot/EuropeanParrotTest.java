package parrot;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import parrot.type.EuropeanParrot;

public class EuropeanParrotTest {

	@Test
	public void getSpeedOfEuropeanParrot() {
		/* GIVEN */
		Parrot parrot = new EuropeanParrot();
		final double expectedSpeed = 12.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();

		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

}
