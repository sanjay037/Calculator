import static org.junit.Assert.*;

import org.junit.*;


public class TestCalculator {
	Calculator c = new Calculator();
	@Test
	public void test_square_root()
	{
		double n = c.square_root(25);
		assertEquals(5.0,n,0.0);
		n = c.square_root(-3);
		assertEquals(Double.NaN,n,0.0);
		n = c.square_root(-5);
		assertNotEquals(0,n,0.0);
		n = c.square_root(0);
		assertEquals(0,n,0.0);
		n = c.square_root(10);
		assertEquals(3.1622776601683795,n,0.0);
	}
	
	@Test
	public void test_factorial()
	{
		Calculator c = new Calculator();
		int n = c.factorial(0);
		assertEquals(1,n);
		n = c.factorial(-4);
		assertEquals(0,n);
		n = c.factorial(-1);
		assertNotEquals(1,n);
		n = c.factorial(20);
		assertNotEquals(10,n);
		n = c.factorial(3);
		assertEquals(6,n);
	}

	@Test
	public void test_ln_function()
	{
		Calculator c = new Calculator();
		double n = c.ln_function(1);
		assertEquals(0.0,n,0.0);
		n = c.ln_function(4);
		assertEquals(1.3862943611198906,n,0.001);
		n = c.ln_function(0);
		assertEquals(Double.NaN,n,0.0);
		n = c.ln_function(-10);
		assertEquals(Double.NaN,n,0.0);
		n = c.ln_function(-4);
		assertNotEquals(1.3862943611198906,n,0.001);
		n = c.ln_function(20);
		assertNotEquals(15.2567,n,0.001);
		n = c.ln_function(2.2);
		assertNotEquals(15.2567,n,0.001);
	}

	@Test
	public void test_power()
	{
		Calculator c = new Calculator();
		double n = c.power(2, 3);
		assertEquals(8.0,n,0.0);
		n = c.power(2, 0);
		assertEquals(1,n,0.0);
		n = c.power(0, 0);
		assertEquals(1,n,0.0);
		n = c.power(2, 4);
		assertNotEquals(8.0,n,0.0);
		n = c.power(-2, 2);
		assertEquals(4,n,0.0);
		n = c.power(-2, -2);
		assertEquals(0.25,n,0.0);
		n = c.power(2, -1.2);
		assertEquals(0.43527528164806206,n,0.0);
	}
}