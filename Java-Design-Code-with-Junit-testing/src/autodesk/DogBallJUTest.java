package autodesk;

import junit.framework.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;

import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

public class DogBallJUTest extends TestCase {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	// test method to fetch ball by labrador dog
	@Test
	public void testFetchLabrador() {
		Dog labrador = new LabradorDog(22, "Labby");
		// test type
		thrown.expect(DogException.class);

		// test message
		thrown.expectMessage((Dog.HATE));

		// test detail
		try {
			assertEquals(Dog.HATE, labrador.fetchBall(Size.Large));
			assertEquals(Dog.LIKE, labrador.fetchBall(Size.Small));
		} catch (DogException ex) {
			ex.printStackTrace();
		}
		assertEquals(Dog.MOVED, labrador.throwBall());
	}

	@Test
	public void testFetchBulldog() {
		Dog bulldog = new BulldogDog(23, "bully");
		// test type
		thrown.expect(DogException.class);

		// test message
		thrown.expectMessage((Dog.HATE));

		// test detail
		try {
			assertEquals(Dog.LIKE, bulldog.fetchBall(Size.Large));
			assertEquals(Dog.HATE, bulldog.fetchBall(Size.Small));
		} catch (DogException ex) {
			ex.printStackTrace();
		}
		assertEquals(Dog.MOVED, bulldog.throwBall());
	}
	
	@Test
	public void testFetchGerman() {
		Dog german = new GermanShepherdDog(67, "giny");
		// test type
		thrown.expect(DogException.class);

		// test message
		thrown.expectMessage((Dog.HATE));

		// test detail
		try {
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NEGATIVE TEST CASE... MUST FAIL!!!!!!!!!!!!!!!!!!!!
			//we should have used "ALWAYS LIKE PLAYING"
			assertEquals(Dog.LIKE, german.fetchBall(Size.Small));
		} catch (DogException ex) {
			ex.printStackTrace();
		}
		assertEquals(Dog.MOVED, german.throwBall());
	}

}
