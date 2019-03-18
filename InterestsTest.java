/*
 * JUnit test for class Interests
 * author-K.HariHaraChaitanya project-Interest calculator
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class InterestsTest {

	@Test
	public void simpleInterest_test() {
		Interests interest = new Interests(1500,2,5);
		assertEquals(150,interest.simpleInterest(),0.01);
	}
	public void compoundInterest_test() {
		Interests interest = new Interests(1500,2,5);
		assertEquals(153.75,interest.compoundInterest(),0.01);
	}
}
