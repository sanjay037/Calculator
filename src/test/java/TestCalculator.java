import static org.junit.Assert.*;

import org.junit.*;


public class TestCalculator {
	@Test
	public void square_root_true_positive()
	{
		double n = c.square_root(25);
		assertEquals(5.0,n,0.0);
		n = c.square_root(3);
		assertEquals(1.7320508075688772,n,0.0);
	}

	@Test
	public void square_root_false_positive()
	{
		double n = c.square_root(20);
		assertNotEquals(5.0,n,0.0);
		n = c.square_root(10);
		assertNotEquals(1.7320508075688772,n,0.0);
	}
	
	@Test
	public void factorial_true_positive()
	{
		Calculator c = new Calculator();
		int n = c.factorial(0);
		assertEquals(1,n);
		n = c.factorial(4);
		assertEquals(24,n);
	}

	@Test
	public void factorial_false_positive()
	{
		Calculator c = new Calculator();
		int n = c.factorial(10);
		assertNotEquals(1,n);
		n = c.factorial(1);
		assertNotEquals(24,n);
	}
}