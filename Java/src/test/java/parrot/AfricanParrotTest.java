package parrot;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import parrot.type.AfricanParrot;

public class AfricanParrotTest {
	@Test
	public void getSpeedOfAfricanParrot_With_One_Coconut() {
		/* GIVEN */
		Parrot parrot = new AfricanParrot(1);
		final double expectedSpeed = 3.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();

		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		/* GIVEN */
		Parrot parrot = new AfricanParrot(2);
		final double expectedSpeed = 0.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();

		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		/* GIVEN */
		Parrot parrot = new AfricanParrot(0);
		final double expectedSpeed = 12.0;

		/* WHEN */
		double actualSpeed = parrot.getSpeed();

		/* THEN */
		assertEquals(expectedSpeed, actualSpeed);
	}

}
