import static org.junit.Assert.*;

import org.junit.*;


public class TestCalculator {
	@Test
	public void test_square_root()
	{
		Calculator c = new Calculator();
		double n = c.square_root(25);
		assertEquals(5.0,n,0.0);
		n = c.square_root(3);
		assertEquals(1.7320508075688772,n,0.0);
	}
	
	@Test
	public void test_factorial()
	{
		Calculator c = new Calculator();
		int n = c.factorial(0);
		assertEquals(1,n);
		n = c.factorial(4);
		assertEquals(24,n);
	}
}